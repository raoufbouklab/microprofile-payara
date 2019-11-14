package com.microprofile.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;

import com.microprofile.entities.Book;
import com.microprofile.entities.Person;

@ApplicationScoped
public class BookService {
	
	List<Book> books;
	
	@PostConstruct
	private void init() {
		books = new ArrayList<>();
		books.add(new Book("1", "Eclipse MicroProfile", "Getting started with Eclipse MicroProfile",
				new Person(1, "Raouf", "Bouklab")));
		books.add(new Book("2", "Jakarta EE", "Getting started with Jakarta EE",
				new Person(2, "Jak", "Jakarta")));
	}

	public List<Book> listAll(){
		
			
		return books;
	}
	
	public Book getBook(String isbn) {
		List<Book> isbnList = books.stream().filter(book -> book.getIsbn().equals(isbn)).collect(Collectors.toList());
		if(isbnList.isEmpty()) return null;
		return isbnList.get(0);
	}
	
	public boolean addBook(Book book) {
		books.add(book);
		return true;
	}
	
}
