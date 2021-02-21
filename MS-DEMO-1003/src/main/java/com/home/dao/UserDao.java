package com.home.dao;

import java.util.List;
import java.util.Optional;

import com.home.bean.MongodbDemo;

public interface UserDao {

	List<MongodbDemo> getMySqlUsers();

	Optional<MongodbDemo> getUserById(int id);
}
