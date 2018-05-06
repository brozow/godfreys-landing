package com.brozowski.games.gl.api;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;

// It's good practice to include a version number in the path so you can have
// multiple versions deployed at once. That way consumers don't need to upgrade
// right away if things are working for them.
@Path("world")
public class WorldResource {
  @GET
  @Consumes("text/plain")
  @Produces("text/plain")
  @Path("addTwoNumbers")
  public String add(@MatrixParam("firstNumber") int n1, @MatrixParam("secondNumber") int n2) {
    return String.valueOf(n1 + n2);
  }
}

