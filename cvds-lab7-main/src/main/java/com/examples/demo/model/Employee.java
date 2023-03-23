package com.examples.demo.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long employeeId;
	private String firstName;
	private String lastName;
	private String role;
	private Double salary;

    public Employee() {}

    public Employee(String name, String last, String rol, double salary) {
        this.firstName = name;
        this.lastName = last;
        this.role = rol;
        this.salary = salary;
    }

    public Long getEmplyeedId(){
        return employeeId;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getRole(){
        return role;
    }

    public Double getSalary(){
        return salary;
    }

    public void setEmployeedId(Long value){
        this.employeeId = value;
    }

    public void setFirstName(String value){
        this.firstName = value;
    }
    
    public void setLastName(String value){
        this.lastName = value;
    }

    public void setRole(String value){
        this.role = value;
    }
    
    public void setSalary(Double value){
        this.salary = value;
    }

    @Override    
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", role="                + role + ", salary=" + salary + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, firstName, lastName, role, salary);
    }

    @Override    
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(employeeId, employee.employeeId) && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(role, employee.role) && Objects.equals(salary, employee.salary);
    }

    public Long getEmployeeId() {
        return employeeId;
    } 



}