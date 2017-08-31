package org.ServeiRest;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

// http://localhost:8080/ServeiRest/Hola/main/jas/singh/sd
@Path ("/main")
public class TestingRest {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String donemDades() {
		return "{\"data\":"
				+ "{ "
					+ "\"id\": 100,"
					+ "\"name\": \"Et paso moltes dades\" "
				+ "}"
			 + "}";
	}	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{idd}/{nomm}/{cognomm}")
	public String donemDadesAmbParametres(@PathParam("idd") String idd,@PathParam("nomm") String nomm,@PathParam("cognomm") String cognomm) {
		return "{\"data\":"
				+ "{ "
					+ "\"id\": 100,"
					+ "\"name\": "+ idd+"->"+nomm+"->"+cognomm
				+ "}"
			 + "}";
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{idd}/{nomm}/{cognomm}")
	public String actualitzaDada(@PathParam("idd") String idd,@PathParam("nomm") String nomm,@PathParam("cognomm") String cognomm){
		return "{\"data\":"
				+ "{ "
					+ "\"id\": 100,"
					+ "\"name\": \"TOT actualitzat.\" "
				+ "}"
			+ "}";
	}
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{idd}/{nomm}/{cognomm}")
	public String creaNovaDada(@PathParam("idd") String idd,@PathParam("nomm") String nomm,@PathParam("cognomm") String cognomm) {
		return "{\"data\":"
				+ "{ "
					+ "\"id\": 100,"
					+ "\"name\": \"Dada nova Inserit.\" "
				+ "}"
			+ "}";
		
	}
	
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{idd}")
	public String esborraDada(@PathParam("idd") String idd){
		return "{\"data\":"
				+ "{ "
					+ "\"id\": 100,"
					+ "\"name\": \"Dada Esborrada.\" "
				+ "}"
			+ "}";
	}
}
