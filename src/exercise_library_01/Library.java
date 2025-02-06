package exercise_library_01;

import java.util.HashMap;

public class Library {
	private HashMap<Book, Book> books;
	public boolean addBook(Book book) {
		books.put(book, book);
		System.out.println("Book added to library: " + book.getBookTitle());
		return true;
	}
	
	public boolean borrowBook(Borrower borrower, Book book) {
		if(book.isAvailable()) {
			borrower.addBooks(book);
		}
	}
}
 