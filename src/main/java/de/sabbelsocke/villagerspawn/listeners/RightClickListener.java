package de.sabbelsocke.villagerspawn.listeners;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RightClickListener implements Listener {

    private final List<Villager.Profession> professions = Arrays.asList(Villager.Profession.values());
    private final Random random = new Random();

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();

        if (player.getItemInHand().getType() == Material.STICK) {
            Location location = player.getLocation();
            Villager villager = (Villager) player.getWorld().spawnEntity(location.add(1, 1, 0), EntityType.VILLAGER);
            Villager.Profession randomProfession = getRandomProfession();
            villager.setProfession(randomProfession);



        }
    }

    private Villager.Profession getRandomProfession() {
        return professions.get(random.nextInt(professions.size()));
    }

}

