package me.electrum.social.commands;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.chat.hover.content.Text;
import net.md_5.bungee.api.plugin.Command;

public class Instagram extends Command {

    public Instagram(String name) {
        super(name);
    }
    public String convertColor(String in) {
        return in.replace("&", "§");
    }
    @Override
    public void execute(CommandSender sender, String[] args) {
        TextComponent message = new TextComponent(convertColor("&a&lTwist&5&lMC &f&l-> &e&lIn&6&Lsta&d&lgram"));
        message.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://www.instagram.com/twistbedwars"));
        message.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text(convertColor("&e&lClick Here to Follow Our Instagram!"))));
        sender.sendMessage(message);

    }
}
