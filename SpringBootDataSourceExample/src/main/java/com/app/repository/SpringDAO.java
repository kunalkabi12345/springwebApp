

package com.app.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.model.Customer;

@Repository
public class SpringDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static final String SQL = "select * from customer";
	
	public List<Customer> isData() {
		
		List<Customer> customers = new ArrayList<Customer>();

		List<Map<String, Object>> rows = jdbcTemplate.queryForList(SQL);
		
		for (Map<String, Object> row : rows) {
			Customer customer = new Customer();
			
			customer.setCustNo((int)row.get("cid"));
			customer.setCustName((String)row.get("cname"));
			customer.setCountry((String)row.get("country"));
			
			customers.add(customer);
		}

		return customers;
		
	}
}