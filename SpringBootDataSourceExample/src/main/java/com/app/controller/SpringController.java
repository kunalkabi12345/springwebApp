package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.repository.SpringDAO;
import com.model.Customer;

@RestController
public class SpringController {
	
	@Autowired
	public SpringDAO dao;
	
	@RequestMapping("/getcustInfo")
	public List<Customer> customerInformation() {
		
		List<Customer> customers = dao.isData();		 
		
		return customers;
	}
}

//URL: http://localhost:8080/springbootds/getcustInfo