# commando-java-example

An example plugin of Commando being used in Java.

### Command Example
```java
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
```

### Main class
```java
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
```
