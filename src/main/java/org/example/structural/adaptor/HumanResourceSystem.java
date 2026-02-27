package org.example.structural.adaptor;

/*
 * Client System which has employee information as String Array
 *
 */

public class HumanResourceSystem
{

    public static String[][] getEmployees()
    {
        String[][] employees = new String[4][];

        employees[0] = new String[] { "100", "Dave", "Team Leader" ,"70000"};
        employees[1] = new String[] { "101", "Ram", "Developer", "40000" };
        employees[2] = new String[] { "102", "Raj", "Developer" , "30000"};
        employees[3] = new String[] { "103", "Rahul", "Tester", "30000" };

        return employees;
    }

    public static void main( String args[] )
    {

        ITarget target = new EmployeeAdapter();
        System.out.println("HR system passes employee string array to Adapter\n");
        target.processCompanySalary(getEmployees());

    }
}
