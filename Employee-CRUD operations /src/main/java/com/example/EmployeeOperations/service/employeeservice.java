package com.example.EmployeeOperations.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeeOperations.model.employee;
import com.example.EmployeeOperations.repo.employeerepo;

@Service
public class employeeservice {
	
	@Autowired
	private employeerepo repo;
	
	//get all employee
	public List<employee> getemployee(){
		return repo.findAll();
	}
	
	//get employee by id
	public employee getemployeeById(Long id) {
		return repo.findById(id).get();
	}
	
	//add employee
	public void addemployee(employee employee) {
		repo.save(employee);
	}
	
	//delete employee
	public void deleteemployee(Long id) {
		repo.deleteById(id);
	}
	
	//update employee
	public void updateemployee(employee employee) {
		repo.save(employee);
	}

}










