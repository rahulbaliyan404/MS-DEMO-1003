package com.home.bean;

import java.io.Serializable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document(collection = "mongodb_demo")
public class MongodbDemo implements Serializable {

	private static final Logger LOGGER = LoggerFactory.getLogger(MongodbDemo.class);
	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private String name;
	private String password;
	private String email;

	public MongodbDemo() {
		LOGGER.info("User class no-arg-constractor.");
	}
	
	public MongodbDemo(String id, String name, String password, String email) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
	}



	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
