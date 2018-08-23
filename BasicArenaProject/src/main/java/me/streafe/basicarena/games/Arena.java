package me.streafe.basicarena.games;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;

import me.streafe.basicarena.kits.Kit;
import me.streafe.basicarena.timer.CountDown;
import me.streafe.basicarena.timer.Game;

public class Arena {

	private final int id;
	private ArrayList<UUID> players;
	private HashMap<UUID, Kit> kits;
	private GameState state;
	private final Location location;
	private final CountDown countdown;
	private final Game game;
	private final int requiredPlayers;
	private final String prefix;
	
	public Arena(int id, Location location) {
		this.id = id;
		this.location = location;
		this.state = GameState.WAITING;
		
		this.countdown = new CountDown(this);
		this.game = new Game(this);
		
		this.requiredPlayers = 2;
		this.prefix = ChatColor.GRAY + "[" + ChatColor.GREEN + "Arena " + id + ChatColor.GRAY + "] " + ChatColor.RESET;
		
		Manager.getInstance().addArena(this);
	}
	
	public int getId() {
		return id;
	}

	public boolean contains(UUID uuid) {
		return players.contains(uuid);
	}
	
	public void reset() {
		this.players.clear();
		this.state = GameState.WAITING;
		this.kits = kits;
	}

	public void addPlayer(UUID uniqueId) {
		
	}
	
	public void setState(GameState state) {
		this.state = state;
	}
	
	public void BroadCast(String msg) {
		Bukkit.broadcastMessage(msg);
	}
}
