package com.juangracia.usermanagement.dao;

import java.util.List;

import com.juangracia.usermanagement.models.User;

public interface UserDao {

	public List<User> getUsers();

	public void deleteUser(Long id);

	public void createUser(User user);
	
}
