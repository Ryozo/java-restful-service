package net.equj65.rest.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import net.equj65.rest.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;

@Path("/users")
public class UserController {

	@Autowired
	UserService userService;
	
	@GET
	@Path("/{userId}")
	public String getUser(@PathParam("userId") String userId) {
		// TODO 実装
		return userId;
	}
}
