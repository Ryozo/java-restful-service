package net.equj65.rest.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import net.equj65.rest.service.PersonService;

import org.springframework.beans.factory.annotation.Autowired;

@Path("/persons")
public class PersonController {

	@Autowired
	PersonService userService;
	
	@GET
	@Path("/{personId}")
	public String getUser(@PathParam("userId") String userId) {
		// TODO 実装
		return userId;
	}
}
