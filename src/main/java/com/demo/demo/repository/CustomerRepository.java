package com.demo.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.demo.demo.entity.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {
    Customer findByEmail(String email);
}
