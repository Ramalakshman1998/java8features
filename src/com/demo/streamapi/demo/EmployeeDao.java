package com.demo.streamapi.demo;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
	
	public static List<Employee> getAllEmployees(){
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(176, "Roshan", "IT", 600000));
		empList.add(new Employee(388, "Bikash", "CIVIL", 900000));
		empList.add(new Employee(470, "Bimal", "DEFENCE", 500000));
		empList.add(new Employee(624, "Sourav", "CORE", 400000));
		empList.add(new Employee(176, "Prakash", "SOCIAL", 1200000));
		return empList;
	}

}
