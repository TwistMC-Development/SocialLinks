package me.electrum.social.commands;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.chat.hover.content.Text;
import net.md_5.bungee.api.plugin.Command;

public class Discord extends Command {

    public Discord(String name) {
        super(name);
    }
    public String convertColor(String in) {
        return in.replace("&", "§");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        TextComponent message = new TextComponent(convertColor("&a&lTwist&5&lMC &f&l-> &9&lDiscord"));
        message.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://discord.com/invite/twistmc"));
        message.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text(convertColor("&9&lClick Here to Join Our Discord!"))));
        sender.sendMessage(message);
    }
}
