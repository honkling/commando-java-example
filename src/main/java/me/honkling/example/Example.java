package me.honkling.example;

import me.honkling.commando.CommandManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Example extends JavaPlugin {

    @Override
    public void onEnable() {
        CommandManager manager = new CommandManager(this);
        manager.registerCommands("me.honkling.example.commands");

        getLogger().info("Example is ready.");
    }
}
