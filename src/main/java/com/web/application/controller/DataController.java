package com.web.application.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.application.model.Customer;
import com.web.application.repo.CustomerRepo;
import com.web.application.repo.ProductRepo;

@RestController
public class DataController {
	
	@Autowired CustomerRepo cp;
	@Autowired ProductRepo pp;
	
	@GetMapping("/isWorking")
	public String Working()
	{
		return "Working";
	}
	
    @PostMapping("/save")
    public Customer save(@RequestBody Customer customer) {
    	return cp.save(customer);
    }
    @GetMapping("/getAll")
   public List<Customer> getAll(){
    	return cp.findAll();
    }
    @PostMapping("/delete/{id}")
    public String deleteById(@PathVariable("id") int id) {
    	cp.deleteById(id);
    	return "deleted successfull";
    }

}
