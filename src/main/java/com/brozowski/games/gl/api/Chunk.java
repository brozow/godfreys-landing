package com.brozowski.games.gl.api;

public class Chunk {
	
	private Block[] blocks;
	
	public Chunk(Block[] blocks) {
		this.blocks = blocks;
	}
	
	public Block[] getBlocks() { return this.blocks; }
	

}
