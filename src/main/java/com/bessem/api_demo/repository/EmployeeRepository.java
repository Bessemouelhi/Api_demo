package com.bessem.api_demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bessem.api_demo.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
