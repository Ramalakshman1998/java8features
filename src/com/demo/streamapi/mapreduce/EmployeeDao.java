package com.demo.streamapi.mapreduce;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDao {
	
	public static List<Employee> getEmployeeAll() {
        return Stream.of(
                new Employee(101, "john", "john@gmail.com","a",60000, Arrays.asList("397937955", "21654725")),
                new Employee(102, "smith", "smith@gmail.com","B",78000,Arrays.asList("89563865", "2487238947")),
                new Employee(103, "peter", "peter@gmail.com","a",79000,Arrays.asList("38946328654", "3286487236")),
                new Employee(104, "kely", "kely@gmail.com","B",67890, Arrays.asList("389246829364", "948609467"))
        ).collect(Collectors.toList());
    }
	
	
	

}
