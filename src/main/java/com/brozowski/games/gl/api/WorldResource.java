package com.brozowski.games.gl.api;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

// It's good practice to include a version number in the path so you can have
// multiple versions deployed at once. That way consumers don't need to upgrade
// right away if things are working for them.
@Path("world")
public class WorldResource {

	@GET
	@Path("{worldName}/chunk/{chunkNumber}")
	@Produces(MediaType.APPLICATION_JSON)
	public Chunk getChunk(@PathParam("worldName")String worldName, @PathParam("chunkNumber")int chunkNumber) {

		Block stone = new Block(BlockType.Stone, 7, 12);
		Block dirt =  new Block(BlockType.Dirt,  8, 13);
		Block grass = new Block(BlockType.Grass, 9, 14);
		
		Block[] blocks = new Block[] {
				stone,
				dirt,
				grass
		};
		
		
		return new Chunk(blocks);
		

	}
  
  
  
}

