package com.gous.apirest.repository;

import org.springframework.data.repository.CrudRepository;

import com.gous.apirest.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}
