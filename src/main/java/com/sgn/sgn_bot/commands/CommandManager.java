package com.sgn.sgn_bot.commands;

import net.dv8tion.jda.api.events.guild.GuildJoinEvent;
import net.dv8tion.jda.api.events.guild.GuildReadyEvent;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.build.CommandData;
import net.dv8tion.jda.api.interactions.commands.build.Commands;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class CommandManager extends ListenerAdapter {
    @Override
    public void onSlashCommandInteraction(@NotNull SlashCommandInteractionEvent event) {
        String command = event.getName();
        if (command.equals("запрос")){
            String userTag = event.getUser().getAsTag();
            event.reply("запрос обработан" + userTag).queue();
        }
    }

    @Override
    public void onGuildReady(@NotNull GuildReadyEvent event) {
        List<CommandData> commandData = new ArrayList<>();
        commandData.add(Commands.slash("запрос", "тестовый запрос"));
        event.getGuild().updateCommands().addCommands(commandData).queue();
    }

    @Override
    public void onGuildJoin(@NotNull GuildJoinEvent event) {
        List<CommandData> commandData = new ArrayList<>();
        commandData.add(Commands.slash("запрос", "тестовый запрос"));
        event.getGuild().updateCommands().addCommands(commandData).queue();
    }
}
