package com.brozowski.games.gl.api;

public class Block {
	
	private BlockType type;
	private int x;
	private int y;
	
	public Block(BlockType type, int x, int y) {
		this.type = type;
		this.x = x;
		this.y = y;
	}
	
	public BlockType getType() { return this.type; }
	public int getX() { return this.x; }
	public int getY() { return this.y; }

}
	

