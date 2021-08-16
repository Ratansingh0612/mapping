package com.spring.mapping.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mapping.dto.CustomerRequesr;
import com.spring.mapping.dto.OrderResponse;
import com.spring.mapping.entity.Customer;
import com.spring.mapping.repositary.CustomerRepositary;
import com.spring.mapping.repositary.ProductRepositary;

@RestController
public class CustomerController {
	@Autowired
	private CustomerRepositary customerRepositary;
	@Autowired
	private ProductRepositary productRepositary;

	@PostMapping("/placeorder")
	public Customer placeOrder(@RequestBody CustomerRequesr request) {

		return customerRepositary.save(request.getCustomer());

	}

	@GetMapping("/findallorders")
	public List<Customer> findAllOrder() {
		return customerRepositary.findAll();
	}

	@GetMapping("/findByCustomerId/{id}")
	public Optional<Customer> findByCustomerId(@PathVariable("id") int Id) {

		return customerRepositary.findById(Id);
	}

	@GetMapping("/getInfo")
	public List<OrderResponse> getJoinInfo() {
		return customerRepositary.getJoinInfo();
	}

}
