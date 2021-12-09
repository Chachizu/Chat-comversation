package dev.example.devop.booktestdevop;

public class Book {
	//fields from book
	private String title;
	private String ISBN;
	private int pages;
	private int year;
	private String author;
	
	
	
	
	public Book(String title, String iSBN, int pages, int year, String author) {
		super();
		this.title = title;
		ISBN = iSBN;
		this.pages = pages;
		this.year = year;
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	

}
