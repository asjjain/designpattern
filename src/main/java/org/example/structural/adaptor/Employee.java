package org.example.structural.adaptor;

import lombok.Data;

@Data
public class Employee {
    private int empId;
    private String name;
    private String designation;
    private int salary;

    public Employee(int empId, String name, String designation, int salary) {
        super();
        this.empId = empId;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }
}