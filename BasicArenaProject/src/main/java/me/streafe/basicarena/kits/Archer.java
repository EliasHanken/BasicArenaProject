package me.streafe.basicarena.kits;

import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import me.streafe.basicarena.utils.Helper;

public class Archer extends Kit{

	public Archer(UUID uuid) {
		super(uuid, KitType.ARCHER, Helper.createItem(ChatColor.LIGHT_PURPLE, "Archer", Material.BOW), Helper.createItem(ChatColor.GREEN, "Archer's Arrow", Material.ARROW,32));
	}

	@Override
	public void onStart(Player player) {	
	}

	@Override
	public void update(Player player, int time) {
	}


}
