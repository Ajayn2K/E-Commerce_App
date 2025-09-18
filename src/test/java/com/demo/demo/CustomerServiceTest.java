 package com.demo.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
	
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import com.demo.demo.controller.CustomerController;
import com.demo.demo.entity.Customer;
import com.demo.demo.service.CustomerService;

@WebMvcTest(CustomerController.class)
class ProductControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CustomerService service;

    @Test
    void shouldReturnAllProducts() throws Exception {
        when(service.getAllProducts()).thenReturn(
            List.of(new Customer("Laptop", "Desc", "cat", 1000f, "tag", 5))
        );
        mockMvc.perform(get("/products/all"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$[0].name").value("Laptop"));
    }
}