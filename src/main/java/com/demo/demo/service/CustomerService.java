 package com.demo.demo.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.demo.entity.Customer;
import com.demo.demo.repository.CustomerRepository;

@Service
public class CustomerService {

    private static final Logger log = LoggerFactory.getLogger(CustomerService.class);

    @Autowired
    private CustomerRepository customerRepository;

    // Save product
    public Customer createProduct(Customer product) {
        log.info("Creating product: {}", product.getName());
        product.setId(null); // Ensure it's a new product
        validate(product);   // Basic validation
        return customerRepository.save(product);
    }

    // Get product by ID
    public Customer getProductById(String id) {
        return customerRepository.findById(id).orElse(null);
    }

    // Get all products
    public List<Customer> getAllProducts() {
        return customerRepository.findAll();
    }

    // Delete product
    public boolean deleteProduct(String id) {
        Optional<Customer> product = customerRepository.findById(id);
        if (product.isEmpty()) {
            return false;
        }
        customerRepository.deleteById(id);
        return true;
    }

    // Update product
    public Customer updateProduct(Customer product, String id) {
        Optional<Customer> optionalProduct = customerRepository.findById(id);
        if (optionalProduct.isEmpty()) {
            return null;
        }

        Customer existingProduct = optionalProduct.get();
        existingProduct.setName(product.getName());
        existingProduct.setDescription(product.getDescription());
        existingProduct.setCategory(product.getCategory());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setTags(product.getTags());
        existingProduct.setStock(product.getStock());

        return CustomerRepository.save(existingProduct);
    }

    // Basic validation
    private void validate(Customer product) {
        // Add validation logic if needed
    }
}