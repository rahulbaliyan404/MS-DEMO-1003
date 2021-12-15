package com.home.dao.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.home.bean.MongodbDemo;
import com.home.constant.Constants;
import com.home.dao.UserDao;
import com.home.repository.MongodbDemoRepository;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private MongodbDemoRepository mySqlUserRepository;

	private static final Logger LOGGER = LoggerFactory.getLogger(UserDaoImpl.class);
	String message = Constants.ERROR;

	@Override
	public List<MongodbDemo> getMySqlUsers() {
		LOGGER.info("UserDaoImpl getMySqlUsers method   :: START");
		return mySqlUserRepository.findAll();
	}

	@Override
	public Optional<MongodbDemo> getUserById(int id) {
		
		return mySqlUserRepository.findById(id);
	}
}
