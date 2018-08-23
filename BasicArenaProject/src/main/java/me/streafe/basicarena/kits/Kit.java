package me.streafe.basicarena.kits;

import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;

import me.streafe.basicarena.BasicArena;

public abstract class Kit implements Listener {

	public static Kit getKit(UUID uuid, KitType type) {
		switch(type) {
		case ARCHER:
			return new Archer(uuid);
		case BARBARIAN:
			return new Barbarian(uuid);
		default:
			return null;
		}
		
	}
	
	private final UUID uuid;
	private final KitType type;
	private final ItemStack[] items;
	
	public Kit(UUID uuid, KitType type, ItemStack... items) {
		this.uuid = uuid;
		this.items = items;
		this.type = type;
		
		Bukkit.getPluginManager().registerEvents(this, BasicArena.getPlugin());
	}
	
	public abstract void onStart(Player player);
	
	public abstract void update(Player player, int time);
	
	public void remove() {
		HandlerList.unregisterAll(this);
	}

	public UUID getUuid() {
		return uuid;
	}

	public KitType getType() {
		return type;
	}

	public ItemStack[] getItems() {
		return items;
	}
	
	
	
}
