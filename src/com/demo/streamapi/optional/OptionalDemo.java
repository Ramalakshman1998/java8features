package com.demo.streamapi.optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalDemo {
	
	
	public static Customer getCustomerById(String email) throws Exception {
		List<Customer> customers =CustomerDao.getAll();
		return customers.stream().filter(cust -> cust.getEmail().equals(email)).findAny().orElseThrow(()-> new Exception("no customer present"));
	}
		
		public static void main(String[] args) throws Exception {
			
			Customer customer1 = new Customer(101,"jhon",null,Arrays.asList("233456676","998765444"));
			Customer customer2 = new Customer(102,"ram","ram@gmail",Arrays.asList("233467676","99065444"));
			Customer customer3 = new Customer(103,"lakshman","lakshman@gmail",Arrays.asList("236786676","9988944"));
			Customer customer4 = new Customer(104,"petter","petter@gmail",Arrays.asList("2334789","99878904"));
			

		//empty
		//of
		//ofNullable
		
		Optional<Object> emptyOptional = Optional.empty();
		System.out.println(emptyOptional);
		
//		Optional<String> emailOptional = Optional.of(customer.getEmail());
//		System.out.println(emailOptional);
		
		Optional<String> emailOptional1 = Optional.ofNullable(customer1.getEmail());
		System.out.println(emailOptional1.orElse(" default"));
		
		Optional<String> emailOptional2 = Optional.ofNullable(customer2.getEmail());
		System.out.println(emailOptional2.orElse(" default"));
		
		Optional<String> emailOptional3 = Optional.ofNullable(customer2.getEmail());
		System.out.println(emailOptional3.map(String::toUpperCase).orElseGet(()->"email"));
		
		getCustomerById("peter");

		
		}	

	}




// out put ---- Optional.empty   Optional.empty