package com.home.controller.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.home.bean.MongodbDemo;
import com.home.controller.UserController;
import com.home.logic.UserLogic;

@RestController
//@CrossOrigin(origins = "http://localhost:3000")
public class UserControllerImpl implements UserController {
	
	@Autowired
	private UserLogic userLogic;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserControllerImpl.class);

	@Override
	public List<MongodbDemo> getUsers() {
		LOGGER.info("UserControllerImpl getUsers method    :: START");
		return userLogic.getUsers();
	}

	@Override
	public MongodbDemo loginUser(MongodbDemo user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<MongodbDemo> getUserById(int id) {
		// TODO Auto-generated method stub
		return userLogic.getUserById(id);
	}

	@Override
	public String saveUser(MongodbDemo user) {
		// TODO Auto-generated method stub
		return userLogic.saveUser(user);
	}

	@Override
	public String deleteUser(int id) {
		// TODO Auto-generated method stub
		return userLogic.deleteUser(id);
	}

	@Override
	public String updateUser(MongodbDemo user, int id) {
		// TODO Auto-generated method stub
		return userLogic.updateUser(user,id);
	}

}
