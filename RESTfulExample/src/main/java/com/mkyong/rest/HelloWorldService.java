package com.mkyong.rest;
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
 
@Path("/pod")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldService {
 
	@GET
	public Response getMsg() {
 
		String output = "I am from pod: " + System.getenv("HOST_NAME");
 
		return Response.status(200).entity(output).build();
 
	}
 
}