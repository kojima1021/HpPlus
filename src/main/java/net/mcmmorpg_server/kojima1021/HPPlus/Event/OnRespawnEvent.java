package net.mcmmorpg_server.kojima1021.HPPlus.Event;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;

public class OnRespawnEvent implements Listener {

	@EventHandler
    public void Respawn(PlayerRespawnEvent e) {
	   e.getPlayer().setHealthScale(40);
    }

}