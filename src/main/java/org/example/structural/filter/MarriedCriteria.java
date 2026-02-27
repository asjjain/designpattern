package org.example.structural.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MarriedCriteria implements Criteria {
    // Return the List of Persons who are Married
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return persons.stream().filter(person -> person.getMaritalStatus().equalsIgnoreCase("Married")).collect(Collectors.toList());

    }
}
