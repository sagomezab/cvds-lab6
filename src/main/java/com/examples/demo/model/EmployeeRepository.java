package com.examples.demo.model;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
}