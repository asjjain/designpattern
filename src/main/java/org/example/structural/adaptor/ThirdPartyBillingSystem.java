package org.example.structural.adaptor;

import java.util.ArrayList;

/*
 * ThirdPartyBillingSystem accepts employees information as a List to process each employee salary
 */
public class ThirdPartyBillingSystem {
    public void processSalary(ArrayList<Employee> employeeList) {
        for (Employee employee : employeeList) {
            System.out.print("\n" + employee.toString() + " : ");
            System.out.println(employee.getSalary() + "Rs Salary credited to " + employee.getName() + " Account\n");
        }
    }

}