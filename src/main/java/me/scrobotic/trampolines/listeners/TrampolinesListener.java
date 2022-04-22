package me.scrobotic.trampolines.listeners;

import io.papermc.paper.event.entity.EntityMoveEvent;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByBlockEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerItemDamageEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;

public class TrampolinesListener implements Listener {

    @EventHandler
    public void onPlayerMoveEvent(PlayerMoveEvent event) {
        Player player = event.getPlayer();
        Location loc = player.getLocation();
        loc.setY(loc.getY() -2);
        Block block = loc.getBlock();


        if (block.getType() == Material.BLUE_WOOL)
            {
               player.setVelocity(new Vector(1, 1, 1));
            }
    }



    @EventHandler
    public void onEntityMoveEvent(EntityMoveEvent event) {
        Entity entity = event.getEntity();
        Location loc = entity.getLocation();
        loc.setY(loc.getY() -2);
        Block block = loc.getBlock();


        if (block.getType() == Material.BLUE_WOOL)
        {
            entity.setVelocity(new Vector(0, 1, 0));
        }
    }




    @EventHandler
    public void onFall(EntityDamageByBlockEvent event) {
        Entity entity = event.getEntity();
        Location loc = entity.getLocation();
        loc.setY(loc.getY() -2);
        Block block = loc.getBlock();

        if (event.getCause() == EntityDamageByBlockEvent.DamageCause.FALL && block.getType() == Material.BLUE_WOOL) {
            event.setCancelled(true);
        }

        if (event.getCause() == EntityDamageByBlockEvent.DamageCause.FALL && block.getType() == Material.WAXED_OXIDIZED_CUT_COPPER_STAIRS) {
            event.setCancelled(true);
        }

    }



}