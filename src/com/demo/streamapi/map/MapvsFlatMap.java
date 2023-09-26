package com.demo.streamapi.map;

import java.util.List;
import java.util.stream.Collectors;

public class MapvsFlatMap {
	
	public static void main(String[] args) {
		
		List<Customer> customerList=CustomerDao.getAll();
		
		//List<Customer>  convert List<String> -> Data Transformation
        //mapping : customer -> customer.getEmail()
        //customer -> customer.getEmail()  one to one mapping
        List<String> emails = customerList.stream()
                .map(customer -> customer.getEmail())
                .collect(Collectors.toList());
        System.out.println(emails);

//customer -> customer.getPhoneNumbers()  ->> one to many mapping
        //customer -> customer.getPhoneNumbers()  ->> one to many mapping
        List<List<String>> phoneNumbers = customerList.
                stream().map(customer -> customer.getPhoneNumbers())
                .collect(Collectors.toList());
        System.out.println(phoneNumbers);

        //List<Customer>  convert List<String> -> Data Transformation
        //mapping : customer -> phone Numbers
        //customer -> customer.getPhoneNumbers()  ->> one to many mapping
        List<String> phones = customerList.stream()
                .flatMap(customer -> customer.getPhoneNumbers().stream())
                .collect(Collectors.toList());
        System.out.println(phones);
    }
}