package org.example.structural.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FemaleCriteria implements Criteria {

    // Return the List of Persons who are female
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return persons.stream().filter(person -> person.getGender().equalsIgnoreCase("Female")).collect(Collectors.toList());
    }
}
