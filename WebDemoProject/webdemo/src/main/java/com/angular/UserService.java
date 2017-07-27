package com.angular;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserService 
{
	public User getDefaultUser()
	{
		User user = new User();
		user.setId(0);
		user.setFirstName("Tom");
		user.setLastName("Cruise");
		return user;
	}
	
	public List<User> getAllUsers()
	{
		ArrayList<User> uList = new ArrayList<User>();
		
		try 
		{
			//BufferedReader br=new BufferedReader(new FileReader("C:/Uma/Eclipse_Workspace_WebApps/TextFiles/User.txt"));
			BufferedReader br=new BufferedReader(new FileReader("C:/Temp/User.txt"));
			String str;
			
			while((str=br.readLine()) != null)
			{
				String[] token = str.split(",");
				
				User u = new User();
				
				u.setId(Integer.parseInt(token[0]));
				u.setFirstName(token[1]);
				u.setLastName(token[2]);
				
				uList.add(u);	
			}
			br.close();
		}
		catch (FileNotFoundException e) 
		{	
			e.printStackTrace();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		return uList;
	}
	
	public User getUser(int id)
	{
		User user = new User();
		
		try 
		{
			BufferedReader br = new BufferedReader(new FileReader("C:/Temp/User.txt"));
			
			String str;
			
			while((str=br.readLine())!=null)
			{
				String[] token = str.split(",");
				
				if(Integer.parseInt(token[0])==id)
				{
					user.setId(id);
					user.setFirstName(token[1]);
					user.setLastName(token[2]);
				}
			}
			br.close();
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		return user;
	}
}
