package com.demo.functionalinterface;

import java.util.Arrays;
import java.util.List;
//import java.util.function.Predicate;

public class PredicateDemo {

//	@Override
//	public boolean test(Integer t) {
//		
//		if(t%2 ==0) {
//			return true;
//		}else {
//			
//		return false;
//	}
//	}	
	public static void main(String[] args) {
		//Predicate<Integer> predicate = t-> t % 2 == 0;			
	    //System.out.println(predicate.test(10));
	
	
	List<Integer> list = Arrays.asList(1,2,4,7,8,9);
	list.stream().filter(t-> t % 2 == 0).forEach(t ->
			System.out.println("printing even:"+t));
}
}