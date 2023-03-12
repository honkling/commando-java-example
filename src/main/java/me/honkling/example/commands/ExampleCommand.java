package me.honkling.example.commands;

import me.honkling.commando.lib.Command;
import org.bukkit.entity.Player;

@Command(name = "example", aliases = {})
public final class ExampleCommand {
    public static void example(Player executor) {
        executor.sendMessage("Hello!");
    }

    public static void test(Player executor, int amount) {
        for (int i = 0; i < amount; i++)
            executor.sendMessage("Test!");
    }
}
