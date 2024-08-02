package com.example.EmployeeOperations.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeeOperations.model.employee;
import com.example.EmployeeOperations.service.employeeservice;

@RestController
public class employeeController {
	
	Logger logger = LoggerFactory.getLogger(employeeController.class);
	@Autowired
	
	private employeeservice empservice;
	
	
	//get all employee from employee service
	@GetMapping("/employee")
	public List<employee> getemployee() {
		logger.info("getemployee called");
		return empservice.getemployee();
	}
	
	//get employee by id from employee service
	@GetMapping("/employee/{id}")
	public employee getemployeeById(@PathVariable Long id) {
		logger.info("getemployeeById called");
		return empservice.getemployeeById(id);
	}
	
	//add employee from employee service
	@PostMapping("/employee")
	public void addemployee(@RequestBody employee employee) {
		logger.info("addemployee called");
		empservice.addemployee(employee);
	}
	
	//delete employee from employee service
	@DeleteMapping("/employee")
	public void deleteemployee(@PathVariable Long id) {
		logger.info("deleteemployee called");
		empservice.deleteemployee(id);
	}
	
	//update employee from employee service
	@PutMapping("/employee")
	public void updateemployee(@RequestBody employee employee) {
		logger.info("updateemployee called");
		empservice.updateemployee(employee);
	}

}
