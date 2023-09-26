package com.demo.functionalinterface;

import java.util.Arrays;
import java.util.List;

import java.util.function.Supplier;

public class SupplierDemo {

//	@Override
//	public String get() {
//		return "hello man";
//	}
	
	public static void main(String[] args) {
		Supplier<String> supplier = () -> "hello man";
		//System.out.println(supplier.get());
		
		List<String> list = Arrays.asList("a","b");
		//System.out.println(list.stream().findAny().orElseGet(supplier));
		System.out.println(list.stream().findFirst().orElseGet(supplier));

	}

}
