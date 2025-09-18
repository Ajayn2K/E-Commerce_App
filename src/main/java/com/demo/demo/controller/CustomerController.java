 package com.demo.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.demo.entity.Customer;
import com.demo.demo.entity.LoginCustomer;
import com.demo.demo.repository.CustomerRepository;

@RestController
public class CustomerController {
	
	@Autowired
	private  CustomerRepository repo;
	
	
	@PostMapping(path="/signup")
	 public Customer signUp(@RequestBody Customer customer) {
		customer.setId(null);
		Customer saveCustomer = repo .save(customer);
		return  saveCustomer;
		
	}
	@PostMapping(path="/ligin")
	 public String ligin(@RequestBody LoginCustomer loginCustomer ) {
		//jwt -token based authentication 
		Customer  customer = repo.findByEmail(loginCustomer.getEmail());
		return "token" +customer.getId();
	}
}

    