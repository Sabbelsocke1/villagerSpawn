package de.sabbelsocke.villagerspawn;

import de.sabbelsocke.villagerspawn.listeners.RightClickListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class VillagerSpawn extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        PluginManager pluginManager = Bukkit.getPluginManager();

        pluginManager.registerEvents(new RightClickListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
