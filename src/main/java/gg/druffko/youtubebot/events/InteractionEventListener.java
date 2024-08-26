package gg.druffko.youtubebot.events;

import gg.druffko.youtubebot.config.Settings;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class InteractionEventListener extends ListenerAdapter {
    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        super.onSlashCommandInteraction(event);
        //event.reply("Hello").queue();

        switch (event.getName()){
            case "bot-info":
                event.reply("Hi, I'm Druffko's YouTube Discord Bot and I am running! You can find me at: https://github.com/druffko-gg/discord-youtube-bot").queue();
                break;
            case "channel-url":
                event.reply("I'm currently posting " + Settings.channelId + " into a channel on this server.").queue();
        }
    }
}
