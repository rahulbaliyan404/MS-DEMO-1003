package com.home.logic;

import java.util.List;
import java.util.Optional;

import com.home.bean.MongodbDemo;

public interface UserLogic {
	List<MongodbDemo> getUsers();

	Optional<MongodbDemo> getUserById(int id);

	String saveUser(MongodbDemo user);

	String deleteUser(int id);

	String updateUser(MongodbDemo user, int id);

}
