package gg.druffko.youtubebot.events;

import static gg.druffko.youtubebot.bot.jda;

public class SlashCommands {

    public static void activateSlashCommands(){
        jda.upsertCommand("bot-info", "Information about the bot").setGuildOnly(true).queue();
        jda.upsertCommand("youtube-url", "Display Channel being posted").setGuildOnly(true).queue();
    }

}
