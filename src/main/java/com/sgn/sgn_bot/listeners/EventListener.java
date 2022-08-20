package com.sgn.sgn_bot.listeners;

import net.dv8tion.jda.api.entities.Channel;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import java.util.Locale;

public class EventListener extends ListenerAdapter {

    //Триггер
    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        String message = event.getMessage().getContentRaw();
        if(message.toLowerCase(Locale.ROOT).contains("привет") && !event.getAuthor().isBot()) {
            MessageChannel channel = event.getChannel();
            channel.sendMessage("привет").queue();
        }
        if(message.toLowerCase(Locale.ROOT).contains("дени") && !event.getAuthor().isBot()) {
            MessageChannel channel = event.getChannel();
            channel.sendMessage("у тебя могут забрать деньги, нолик в графе поражений, сердце, но последний пакетик шпекса не отдавай никогда").queue();
        }
        if(message.toLowerCase(Locale.ROOT).contains("давай") && !event.getAuthor().isBot()) {
            MessageChannel channel = event.getChannel();
            channel.sendMessage("давай!! ДАВАААЙ УРААА ДАВАААЙ ДАААВАААЙ").queue();
        }
        if(message.toLowerCase(Locale.ROOT).contains("т9") && !event.getAuthor().isBot()) {
            MessageChannel channel = event.getChannel();
            channel.sendMessage("ссаный т9 чтоб ты умер сын говна").queue();
        }
        if(message.toLowerCase(Locale.ROOT).contains("говно") && !event.getAuthor().isBot()) {
            MessageChannel channel = event.getChannel();
            channel.sendMessage("моё").queue();
        }
        if(message.toLowerCase(Locale.ROOT).contains("пуга") && !event.getAuthor().isBot()) {
            MessageChannel channel = event.getChannel();
            channel.sendMessage("легенда").queue();
        }
        if(message.toLowerCase(Locale.ROOT).contains("s8_ahegao") && !event.getAuthor().isBot()) {
            MessageChannel channel = event.getChannel();
            channel.sendMessage("гаргулья блять").queue();
        }
        if(message.toLowerCase(Locale.ROOT).contains("можно") && !event.getAuthor().isBot()) {
            MessageChannel channel = event.getChannel();
            channel.sendMessage("нельзя").queue();
        }
        if(message.toLowerCase(Locale.ROOT).contains("запрещаю") && !event.getAuthor().isBot()) {
            MessageChannel channel = event.getChannel();
            channel.sendMessage("запрещаю запрещать").queue();
        }
        if(message.toLowerCase(Locale.ROOT).contains("разрешаю") && !event.getAuthor().isBot()) {
            MessageChannel channel = event.getChannel();
            channel.sendMessage("мама уже разрешила, но папа ещё на работе, он не разрешает").queue();
        }
        if(message.toLowerCase(Locale.ROOT).contains("удачи") && !event.getAuthor().isBot()) {
            MessageChannel channel = event.getChannel();
            channel.sendMessage("ну а так удачи").queue();
        }
        if(message.toLowerCase(Locale.ROOT).contains("курильщикам трудно без плана") && !event.getAuthor().isBot()) {
            MessageChannel channel = event.getChannel();
            channel.sendMessage("слезятся в глазах миражи").queue();
        }
        if(message.toLowerCase(Locale.ROOT).contains("идёт караван из ирана") && !event.getAuthor().isBot()) {
            MessageChannel channel = event.getChannel();
            channel.sendMessage("и много везёт анаши").queue();
        }
        if(message.toLowerCase(Locale.ROOT).contains("душистый план") && !event.getAuthor().isBot()) {
            MessageChannel channel = event.getChannel();
            channel.sendMessage("не купить ни где без труда").queue();
        }
        if(message.toLowerCase(Locale.ROOT).contains("будь караван") && !event.getAuthor().isBot()) {
            MessageChannel channel = event.getChannel();
            channel.sendMessage("в пути осторожен всегда").queue();
        }
        if(message.toLowerCase(Locale.ROOT).contains("анкот") && !event.getAuthor().isBot()) {
            MessageChannel channel = event.getChannel();
            channel.sendMessage("АРРРРРРЯЯЯЯ Я СТАНУ ТРАПОМ").queue();
        }
        if(message.toLowerCase(Locale.ROOT).contains("надо") && !event.getAuthor().isBot()) {
            MessageChannel channel = event.getChannel();
            channel.sendMessage("не обязан").queue();
        }
        if(message.toLowerCase(Locale.ROOT).contains("вопросы?") && !event.getAuthor().isBot()) {
            MessageChannel channel = event.getChannel();
            channel.sendMessage("ответы").queue();
        }



    }
}