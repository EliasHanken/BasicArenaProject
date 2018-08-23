package me.streafe.basicarena.games;

import java.util.ArrayList;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.Location;

public class Manager {
	
	public static Location SPAWN_POINT = new Location(Bukkit.getWorld("world"),0,50,0);
	public static Manager manager;
	private ArrayList<Arena> arenas;
	
	public static Manager getInstance() {
		
		if(manager == null) {
			manager = new Manager();
		}
		
		return manager;
	}
	
	public Manager() {
		this.arenas = new ArrayList<Arena>();
	}
	
	public void addArena(Arena arena) {
		arenas.add(arena);
	}

	public void removeArena(Arena arena) {
		arenas.remove(arena);
	}

	public Arena getArena(int id) {
		for (int i = 0; i < arenas.size(); i++) {
			final Arena arena = arenas.get(i);

			if (arena.getId() == id) {
				return arena;
			}
		}
		return null;
	}

	public boolean isArena(int id) {
		return getArena(id) != null;
	}

	public Arena getArena(UUID uuid) {
		for (int i = 0; i < arenas.size(); i++) {
			final Arena arena = arenas.get(i);

			if (arena.contains(uuid)) {
				return arena;
			}
		}
		return null;
}
}
