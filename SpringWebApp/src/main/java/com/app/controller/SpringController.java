
package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Customer;

@RestController
public class SpringController {

	@GetMapping(path="/get-cust-info")
	public Customer customerInformation() 
	{
		Customer cust = new Customer();
		
		cust.setCustNo(10011);
		cust.setName("Madhavi");
		cust.setCountry("United States");
		
		return cust;
	}
}


// URL: http://localhost:8080/springbootrestxml/get-cust-info
// URL: http://localhost:8080/springbootrestxml/get-cust-info.json