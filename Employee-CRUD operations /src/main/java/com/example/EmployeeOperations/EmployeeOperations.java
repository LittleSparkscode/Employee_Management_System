package com.example.EmployeeOperations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class EmployeeOperations {

	private static final Logger log = LoggerFactory.getLogger(EmployeeOperations.class);
	public static void main(String[] args) {
		SpringApplication.run(EmployeeOperations.class, args);
		log.info("Application Started Successfully");
	}

}
