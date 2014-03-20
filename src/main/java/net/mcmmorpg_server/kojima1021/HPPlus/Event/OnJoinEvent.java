package net.mcmmorpg_server.kojima1021.HPPlus.Event;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class OnJoinEvent implements Listener {

	@EventHandler
    public void Join(PlayerJoinEvent e) {
	   e.getPlayer().setHealthScale(40);
    }

}