package me.streafe.basicarena.timer;

import org.bukkit.scheduler.BukkitRunnable;

import me.streafe.basicarena.games.Arena;
import me.streafe.basicarena.games.GameState;

public class Game extends BukkitRunnable{
	
	private final Arena arena;
	private int time;
	
	public Game(Arena arena) {
		this.arena = arena;
	}

	public void start() {
		arena.setState(GameState.STARTED);
		arena.BroadCast("The game has started");
	}
	
	
	@Override
	public void run() {
		
	}

}
