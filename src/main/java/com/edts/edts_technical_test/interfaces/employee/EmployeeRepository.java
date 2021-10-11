package com.edts.edts_technical_test.interfaces.employee;

import java.math.BigInteger;

import com.edts.edts_technical_test.models.Employee;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, BigInteger>{
    
}
