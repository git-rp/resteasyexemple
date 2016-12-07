package com.javacodegeeks.enterprise.rest.resteasy;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/facil")
public class RESTEasyHelloWorldService {
	
	@GET
	public Response responseMessage(){
		String resposta = "ola mundo";
		return Response.status(200).entity(resposta).build();
	}

}
