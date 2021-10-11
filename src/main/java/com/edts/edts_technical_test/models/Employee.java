package com.edts.edts_technical_test.models;

import java.math.BigInteger;
import java.util.HashMap;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.edts.edts_technical_test.constants.employee.EmployeeConstants;

@Entity
@Table(name = Employee.TABLE_NAME)
public class Employee {
    public static final String TABLE_NAME = "employee";

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private BigInteger id;

    private String name;
    private BigInteger salary;
    private int grade;

    protected Employee() {

    }

    public Employee(String name, BigInteger salary, int grade) {
        this.name = name;
        this.salary = salary;
        this.grade = grade;
    }

    // ID
    public BigInteger getId() {
        return id;
    }

    // Name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    // Salary
    public void setSalary(BigInteger salary) {
        this.salary = salary;
    }

    public BigInteger getSalary() {
        return this.salary;
    }

    // Grade
    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return this.grade;
    }

    public String getGradeCode() {
        HashMap<Integer, String> gradeConstants = EmployeeConstants.getGradesConstant();
        return this.grade+":"+gradeConstants.get(this.grade);
    }

    // Total Bonus
    public BigInteger getTotalbonus() {
        HashMap<Integer, Integer> bonusPercentageConstants = EmployeeConstants.getBonusPercentageConstant();
        
        int bonus = (this.salary.intValue() * bonusPercentageConstants.get(this.grade)) / 100;
        BigInteger totalBonus = this.salary.add(BigInteger.valueOf(bonus));
        return totalBonus;
    }
}
