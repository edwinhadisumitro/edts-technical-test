package com.edts.edts_technical_test;

import java.math.BigInteger;

import com.edts.edts_technical_test.interfaces.employee.EmployeeRepository;
import com.edts.edts_technical_test.models.Employee;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EdtsTechnicalTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdtsTechnicalTestApplication.class, args);
	}
}
