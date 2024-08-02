package com.example.EmployeeOperations.repo;

import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.example.EmployeeOperations.model.employee;

@RepositoryRestResource
@Repository
@Primary
public interface employeerepo extends JpaRepository<employee, Long>{

}
