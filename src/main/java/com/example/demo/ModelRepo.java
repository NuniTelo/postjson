package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface ModelRepo extends MongoRepository<ModelTest,String> {
}
