package com.model;

public class Customer {
	
	private int custNo;
	private String name;
	private String country;
	private long phoneno;
	
	public long getPhoneno() {
		return phoneno;
	}


	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}

	public Customer() {
		
	}
	
	public Customer(int custNumber, String name, String country, long phoneno) {
		this.custNo = custNumber;
		this.name = name;
		this.country = country;
		this.phoneno=phoneno;
	}

	public int getCustNo() {
		return custNo;
	}

	public void setCustNo(int custNo) {
		this.custNo = custNo;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
}
