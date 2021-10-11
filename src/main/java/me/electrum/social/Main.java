package me.electrum.social;

import me.electrum.social.commands.Discord;
import me.electrum.social.commands.Instagram;
import me.electrum.social.commands.Twitter;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Plugin;

import java.util.Locale;

public class Main extends Plugin {
    @Override
    public void onEnable() {
        super.onEnable();
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new Discord("discord".toLowerCase(Locale.ROOT)));
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new Instagram("instagram".toLowerCase(Locale.ROOT)));
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new Twitter("twitter".toLowerCase(Locale.ROOT)));
        getLogger().info("SocialLinks v1.0 by Electrum has loaded");
    }
}
