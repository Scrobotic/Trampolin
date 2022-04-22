package me.scrobotic.trampolines;

import me.scrobotic.trampolines.listeners.TrampolinesListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Trampolines extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Trampoline Plugin has started!!!");
        // Plugin startup logic
        Bukkit.getServer().getPluginManager().registerEvents(new TrampolinesListener(), this);
    }

    @Override
    public void onDisable() {

        System.out.println("Trampoline Plugin has stopped!!!");

        // Plugin shutdown logic
    }
}