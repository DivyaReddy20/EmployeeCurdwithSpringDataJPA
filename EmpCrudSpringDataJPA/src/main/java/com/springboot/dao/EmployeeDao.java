package com.springboot.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springboot.entity.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {
	
	

}

