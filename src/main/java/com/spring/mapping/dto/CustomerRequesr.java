package com.spring.mapping.dto;


import com.spring.mapping.entity.Customer;

public class CustomerRequesr {
	
	private Customer customer;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public CustomerRequesr() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CustomerRequesr [customer=" + customer + "]";
	}
	

}
