package com.microprofile.entities;

public class Book {

	private String isbn;
	private String title;
	private String description;
	private Person author;

	public Book() {
	}

	public Book(String isbn, String title, String description, Person author) {
		this.isbn = isbn;
		this.title = title;
		this.description = description;
		this.author = author;
	}


	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Person getAuthor() {
		return author;
	}
	public void setAuthor(Person author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", description=" + description + ", author=" + author + "]";
	}
	
}
