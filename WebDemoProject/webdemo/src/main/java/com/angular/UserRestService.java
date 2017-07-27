package com.angular;


import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/user")
public class UserRestService 
{

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public User getDefaultUserInJSON()
	{
		UserService userService = new UserService();
		return userService.getDefaultUser();
	}
	
	
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public User getUserInJSON(@PathParam("id") Integer id)
	{
		UserService userService = new UserService();
		return userService.getUser(id);
	}
	
	@GET
	@Path("all")
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getAllUsersInJSON()
	{
		UserService userService = new UserService();
		return userService.getAllUsers();
	}
}
