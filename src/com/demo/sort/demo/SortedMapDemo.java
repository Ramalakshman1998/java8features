package com.demo.sort.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.demo.streamapi.demo.Employee;

public class SortedMapDemo {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<>();
		map.put(5,"google");
		map.put(2,"amazon");
		map.put(6,"apple");
		map.put(4,"virtusa");
		
//		List<Entry<Integer,String>> entries = new ArrayList<>(map.entrySet());
//		Collections.sort(entries,(o1,o2)->o1.getValue().compareTo(o2.getValue()));
//		
//		for(Entry<Integer,String> entry :entries) {
//			System.out.println(entry.getKey()+"  "+entry.getValue());
//		}
		
//		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
//		
//		System.out.println("----------------------");
//		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		Map<Employee,Integer> employeeMap = new TreeMap<>((o1,o2)-> (int)(o2.getSalary()-o1.getSalary()));
			
		    employeeMap.put(new Employee(176, "Roshan", "IT", 600000),60);
			employeeMap.put(new Employee(388, "Bikash", "CIVIL", 900000),89);
			employeeMap.put(new Employee(470, "Bimal", "DEFENCE", 500000),90);
			employeeMap.put(new Employee(624, "Sourav", "CORE", 400000),78);
			employeeMap.put(new Employee(176, "Prakash", "SOCIAL", 1200000),65);
			
			System.out.println(employeeMap);
		
			//employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary)))
			//            .forEach(t ->System.out.println(t));
			
			employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary)
					.reversed())).forEach(System.out::println);

	}
	}

