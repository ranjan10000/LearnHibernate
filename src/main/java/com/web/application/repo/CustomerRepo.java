package com.web.application.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.application.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
