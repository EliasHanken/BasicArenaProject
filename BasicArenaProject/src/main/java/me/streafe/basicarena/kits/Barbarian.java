package me.streafe.basicarena.kits;

import java.util.UUID;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;

import me.streafe.basicarena.utils.Helper;

public class Barbarian extends Kit{

	public Barbarian(UUID uuid) {
		super(uuid, KitType.BARBARIAN, 
				Helper.createItem(ChatColor.LIGHT_PURPLE, "Barbarian", Material.IRON_AXE), 
				Helper.createItem(ChatColor.GREEN, "Barbarian's Cheatmeal", Material.CAKE));
	}

	@Override
	public void onStart(Player player) {	
	}

	@Override
	public void update(Player player, int time) {
	}
}
