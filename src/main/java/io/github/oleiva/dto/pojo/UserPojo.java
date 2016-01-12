package io.github.oleiva.dto.pojo;

import java.util.Map;


public class UserPojo
{

	private final String name;

	private final Map<String, Boolean> roles;


	public UserPojo(String userName, Map<String, Boolean> roles)
	{
		this.name = userName;
		this.roles = roles;
	}


	public String getName()
	{
		return this.name;
	}


	public Map<String, Boolean> getRoles()
	{
		return this.roles;
	}

}