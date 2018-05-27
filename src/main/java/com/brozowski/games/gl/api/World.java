package com.brozowski.games.gl.api;

public class World {
	
	private Chunk[] chunks;
	
	public World(Chunk[] chunks) {
		this.chunks = chunks;
	}
	
	public Chunk[] getChunks() { return this.chunks; }
	
	

}
