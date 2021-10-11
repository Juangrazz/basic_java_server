package com.juangracia.usermanagement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.juangracia.usermanagement.dao.UserDao;
import com.juangracia.usermanagement.models.User;

@RestController
public class UserController {
	
	@Autowired
	private UserDao userDao;
	
	@RequestMapping(value = "api/getUsers", method = RequestMethod.GET)
	public List<User> getUsers() {
		return userDao.getUsers();
	}
	
	@RequestMapping(value = "api/deleteUser/{id}", method = RequestMethod.DELETE)
	public void deleteUser(@PathVariable Long id) {
		userDao.deleteUser(id);
	}
	
	@RequestMapping(value = "api/createUser", method = RequestMethod.POST)
	public void createUser(@RequestBody User user) {
		userDao.createUser(user);
	}


}
