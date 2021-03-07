package com.home.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.home.bean.MongodbDemo;

@RequestMapping(value = "/demo1003")
public interface UserController {
	
	@GetMapping(value = "/users")
	public List<MongodbDemo> getUsers();
	
	@GetMapping(value = "/login")
	public MongodbDemo loginUser(@RequestBody MongodbDemo user);

	@GetMapping(value = "/user/{id}")
	public Optional<MongodbDemo> getUserById(@PathVariable("id") int id);

	@PostMapping(value = "/save")
	public String saveUser(@RequestBody MongodbDemo user);

	@DeleteMapping(value = "/delete/{id}")
	public String deleteUser(@PathVariable("id") int id);
	
	@PutMapping(value = "/update/{id}")
	public String updateUser(@RequestBody MongodbDemo user,@PathVariable("id") int id);


	
}
