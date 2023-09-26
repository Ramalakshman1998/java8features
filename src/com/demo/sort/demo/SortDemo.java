package com.demo.sort.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.demo.streamapi.demo.Employee;
import com.demo.streamapi.demo.EmployeeDao;

public class SortDemo {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(3);
		list.add(7);
		list.add(4);
		list.add(12);
		
//		Collections.sort(list);
//		Collections.reverse(list);
//		System.out.println(list);

		
		
//		list.stream().sorted().forEach(t->System.out.println(t));
//		list.stream().sorted(Comparator.reverseOrder()).forEach(t->System.out.println(t));
		
		List<Employee> empList = EmployeeDao.getAllEmployees();
		
		//empList.stream().sorted((o1,o2) -> (int)(o1.getSalary()-o2.getSalary())).forEach(t -> System.out.println(t));
	  // empList.stream().sorted(Comparator.comparing(emp->emp.getSalary())).forEach(System.out::println);
	//empList.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);
	empList.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
	empList.stream().sorted(Comparator.comparing(Employee::getDept)).forEach(System.out::println);


	
 
	}

}
