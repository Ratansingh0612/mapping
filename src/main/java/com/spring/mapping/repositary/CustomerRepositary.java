package com.spring.mapping.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.spring.mapping.dto.OrderResponse;
import com.spring.mapping.entity.Customer;
@Repository
public interface CustomerRepositary extends JpaRepository<Customer, Integer> {
	
	@Query("SELECT new com.spring.mapping.dto.OrderResponse(c.cname,p.name,p.price,p.qty) FROM Customer c JOIN c.products p")
	 List<OrderResponse> getJoinInfo();

}
