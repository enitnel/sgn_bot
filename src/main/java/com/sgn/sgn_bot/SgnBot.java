package com.sgn.sgn_bot;
import com.sgn.sgn_bot.commands.CommandManager;
import com.sgn.sgn_bot.listeners.EventListener;
import io.github.cdimascio.dotenv.Dotenv;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.sharding.DefaultShardManagerBuilder;
import net.dv8tion.jda.api.sharding.ShardManager;
import net.dv8tion.jda.api.utils.ChunkingFilter;
import net.dv8tion.jda.api.utils.MemberCachePolicy;
import net.dv8tion.jda.api.utils.cache.CacheFlag;

import javax.security.auth.login.LoginException;

/**
 * JDA-5.0.0 Discord Bot for server "segnesion".
 * The main class.
 *
 * @author enitnel <a>https://linktr.ee/enitnel</a>
 */
public class SgnBot {
    private final Dotenv config;
    private final ShardManager shardManager;

    /**
     * Loads environment variables and builds the bot shard manager.
     * @throws LoginException occurs when bot token is invalid.
     */
    public SgnBot() throws LoginException {

        // Loading environment variables
        config = Dotenv.configure().ignoreIfMissing().load();
        String token = config.get("TOKEN");

        // Building shard manager
        DefaultShardManagerBuilder builder = DefaultShardManagerBuilder.createDefault(token);

        // Setting a bot
        builder.setStatus(OnlineStatus.ONLINE);
        builder.setActivity(Activity.watching(" и следит"));
        builder.enableIntents(GatewayIntent.GUILD_MESSAGES, GatewayIntent.GUILD_MEMBERS, GatewayIntent.GUILD_PRESENCES);
        //Cache
        builder.setMemberCachePolicy(MemberCachePolicy.ALL);
        builder.setChunkingFilter(ChunkingFilter.ALL);
        builder.enableCache(CacheFlag.ONLINE_STATUS);
        shardManager = builder.build();

        //Register listeners
        shardManager.addEventListener(new EventListener(), new CommandManager());
    }

    /**
     * Retrieves the bot environment variables.
     * @return the DotEnv instance for the bot.
     */
    public Dotenv getConfig() {
        return config;
    }

    /**
     * Retrieves the bot shard manager.
     * @return the ShardManager instance for the bot.
     */
    public ShardManager getShardManager() {
        return shardManager;
    }

    /**
     * Main method
     */
    public static void main(String[] args) {
        try {
            SgnBot sgnBot = new SgnBot();
        } catch (LoginException e) {
            String tokenErrorMsg = "Ошибка: недействительный токен";
            System.out.println(tokenErrorMsg);
        }
    }
}