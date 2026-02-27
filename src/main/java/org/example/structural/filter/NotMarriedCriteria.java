package org.example.structural.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NotMarriedCriteria implements Criteria {

    // Return the List of Persons who are not Married
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return persons.stream().filter(person -> person.getMaritalStatus().equalsIgnoreCase("NotMarried")).collect(Collectors.toList());

    }
}