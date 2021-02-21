package com.home.logic.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.home.bean.MongodbDemo;
import com.home.dao.UserDao;
import com.home.logic.UserLogic;

@Component
public class UserLogicImpl implements UserLogic {

	@Autowired
	private UserDao userDao;

	private static final Logger LOGGER = LoggerFactory.getLogger(UserLogicImpl.class);

	@Override
	public List<MongodbDemo> getUsers() {
		LOGGER.info("UserLogicImpl getUsers method :: START");
		List<MongodbDemo> mysqlUserList = userDao.getMySqlUsers();
		return mysqlUserList;

	}

	@Override
	public Optional<MongodbDemo> getUserById(int id) {
		// TODO Auto-generated method stub
		return userDao.getUserById(id);
	}

	@Override
	public String saveUser(MongodbDemo user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateUser(MongodbDemo user, int id) {
		// TODO Auto-generated method stub
		return null;
	}




}
