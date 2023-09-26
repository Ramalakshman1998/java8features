package com.demo.streamapi.mapreduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduceExample {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3,7,8,9,10);
		
		List<String> words = Arrays.asList("corejava","hiberante","springoot");
		
		List<Employee> emplist= EmployeeDao.getEmployeeAll();
		
		int sum =0;
		for(int no:list) {
			sum=sum+no;
		}
		//System.out.println(sum);
		
		int sum1 = list.stream().mapToInt(i->i).sum();
		System.out.println(sum1);
		
		Integer reduceSum = list.stream().reduce(0,(a,b)->a+b);
		System.out.println(reduceSum);
		
		Optional<Integer> ruducesumwithMethodReference = list.stream().reduce(Integer::sum);
		System.out.println(ruducesumwithMethodReference.get());
		
		Integer maxResult = list.stream().reduce(1,(a,b)->a*b);
		System.out.println(maxResult);
		
		Integer maxValue = list.stream().reduce(0,(a,b)->a>b?a:b);
		System.out.println(maxValue);
		
		Integer maxValueWithMethodReference = list.stream().reduce(Integer::max).get();
		System.out.println(maxValueWithMethodReference);
		
		String longSide = words.stream().reduce((word1,word2) -> word1.length()>word2.length() ?word1:word2).get();
		System.out.println(longSide);
		
		double salary =emplist.stream().filter(emp ->emp.getGrade().equalsIgnoreCase("a"))
		.map(emp -> emp.getSalary())
		.mapToDouble(i->i).average().getAsDouble();
		System.out.println(salary);
		
	    double salary1=	emplist.stream().filter(emp -> emp.getGrade().equalsIgnoreCase("b"))
	    		.map(emp->emp.getSalary()).mapToDouble(i->i).sum();
	    System.out.println(salary1);
		
	}

}
