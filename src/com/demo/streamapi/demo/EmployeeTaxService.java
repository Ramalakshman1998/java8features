package com.demo.streamapi.demo;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTaxService {
	
	public static List<Employee> evaluteTaxPayers(String input){
		return (input.equalsIgnoreCase("tax"))?
			 EmployeeDao.getAllEmployees().stream().filter(emp->emp.getSalary()>500000).collect(Collectors.toList())
		    : EmployeeDao.getAllEmployees().stream().filter(emp->emp.getSalary()<=500000).collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		System.out.println(evaluteTaxPayers("non tax"));
	}

}
