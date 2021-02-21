package com.home.repository;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.home.bean.MongodbDemo;

@Repository
public interface MongodbDemoRepository extends MongoRepository<MongodbDemo, Integer> {
	Optional<MongodbDemo> findById(int id);

}
