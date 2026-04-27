package services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("Cliente")
public class Cliente {

	
	
	@Path("hola")
	@GET
	@Consumes(MediaType.TEXT_PLAIN)
	public String hola() {
		return ("¡Hola mundo!");
	}

}
