// DAO-Data Access Object

package com.angular;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User 
{
	private String firstName;
	private String lastName;
	private int id;
	
	public int getId()
	{
		return id;
	}
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public void setId(int uid)
	{
		id = uid;
	}
	public void setFirstName(String first)
	{
		firstName = first;
	}
	
	public void setLastName(String last)
	{
		lastName = last;
	}
}
