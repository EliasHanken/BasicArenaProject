package me.streafe.basicarena;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.plugin.java.JavaPlugin;

import me.streafe.basicarena.games.Arena;

public class BasicArena extends JavaPlugin{
	
	private static BasicArena basicArena;
	
	@Override
	public void onEnable() {
		
	}
	
	public static BasicArena getPlugin() {
		return basicArena;
	}
	
	public static void setup() {
		for(int i = 0; i < 10; i++) {
			
			new Arena(i,new Location(Bukkit.getWorld("world"),50,50,0));
			
		}
	}

}
