package com.edts.edts_technical_test.controllers;

import java.math.BigInteger;

import com.edts.edts_technical_test.constants.exception.EmployeeException;
import com.edts.edts_technical_test.interfaces.employee.EmployeeRepository;
import com.edts.edts_technical_test.models.Employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/employee/{id}")
    public Employee get(@PathVariable int id) {
        return this.employeeRepository.findById(BigInteger.valueOf(id)).orElseThrow(() -> EmployeeException.EmployeeNotFoundException());
    }

    @PostMapping("/employee")
    public Employee insert(@RequestBody Employee employee) {
        return this.employeeRepository.save(employee);
    }

    @PutMapping("/employee/{id}")
    public Employee update(@RequestBody Employee employee, @PathVariable int id) {
        return employeeRepository.findById(BigInteger.valueOf(id)).map(existingEmployee -> {
            existingEmployee.setName(employee.getName());
            existingEmployee.setGrade(employee.getGrade());
            existingEmployee.setSalary(employee.getSalary());
            return employeeRepository.save(existingEmployee);
        }).orElseThrow(() -> EmployeeException.EmployeeNotFoundException());
    }
}
