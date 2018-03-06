package br.com.springmvc.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Controller;

@Controller
@Path("/deparatamento")
public class DepartamentoController {

	@GET
	@Path("/ola")
	@Produces("application/json;charset=utf-8")
	public Response ola(){
		return Response.ok("Olá seja bem vindo!").build();
	}
}
