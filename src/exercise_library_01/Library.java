package exercise_library_01;

import java.util.HashSet;

public class Library {
	private HashSet<Book> books;
	
	public Library() {
		this.books = new HashSet<Book>();
	}
	
	public boolean addBook(Book book) {
		books.add(book);
		System.out.println("Book added to library: " + book.getBookTitle());
		return true;
	}
	
	public boolean borrowBook(Borrower borrower, Book book) {
		if(book.isAvailable()) {
			borrower.addBooks(book);
			book.setAvailable(false);
			System.out.println(borrower.getName() + " borrowed: " + book.getBookTitle());
			return true;
		}
		System.out.println("Can't borrow book");
		return false;
	}
	
	public boolean returnBook(Borrower borrower, Book book) {
		if(!book.isAvailable()) {
			borrower.removeBooks(book);
			book.setAvailable(true);
			System.out.println(borrower.getName() + " returned: " + book.getBookTitle());
			return true;
		}
		System.out.println("Can't return book");
		return false;
	}
	
	public void displayLibraryBooks() {
		System.out.println("Books in library:");
		for(Book book: books) {
			if(book.isAvailable()) {
				System.out.println("Title: " + book.getBookTitle());
				System.out.println("ISBN: " + book.getBookID());
				System.out.println("Author: " + book.getBookAuthor());
				System.out.println("Biography: " + book.getBookBiography());
				System.out.println("---------------------------------");
			}
		}
	}
}
 