package exercise_library_01;

import java.util.ArrayList;

public class Borrower {
	private String name;
	private ArrayList<Book> books;
	public Borrower(String name) {
		this.name = name;
		this.books = new ArrayList<Book>();
	}
	
	public void displayBorrowedBooks() {
		System.out.println(name + "'s Borrowed Books:");
		for(Book book: books) {
			System.out.println("Title: " + book.getBookTitle());
			System.out.println("ISBN: " + book.getBookID());
			System.out.println("Author: " + book.getBookAuthor());
			System.out.println("Biography: " + book.getBookBiography());
			System.out.println("-----------------------------------");
		}
	}

	public void addBooks(Book book) {
		books.add(book);
	}
	
	public void removeBooks(Book book) {
		books.remove(book);
	}

	public String getName() {
		return name;
	};
}
