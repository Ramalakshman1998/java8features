package com.demo.comparator;

import java.util.ArrayList;
import java.util.List;

public class BookDao {

public List<Book> getBooks(){
	
	List<Book> bookList = new ArrayList<>(); 
	bookList.add(new Book(101,"core java",400));
	bookList.add(new Book(102,"hibernate",490));
	return bookList;
		
	}
}
