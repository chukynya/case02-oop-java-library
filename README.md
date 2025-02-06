So, in my OOP campus session (Java Object Oriented Programming), I've been provided this code

    package exercise_library_01;    // java project name: exercise_library_01
    
    public class Main {
    	public Main() {
    	    Author author1 = new Author("James Gosling", "Creator of the Java programming language.");
    	    Author author2 = new Author("Robert C. Martin", "Known for his works on software craftsmanship.");
    	
    	    Book book1 = new Book("Java Programming", "123456789", author1);
    	    Book book2 = new Book("Clean Code", "987654321", author2);
    	
    	    Library library = new Library();
    	
    	    library.addBook(book1);
    	    library.addBook(book2);
    	
    	    Borrower borrower = new Borrower("Alice");
    	
    	    library.borrowBook(borrower, book1);
    	    library.borrowBook(borrower, book2);
    	
    	    borrower.displayBorrowedBooks();
    	
    	    library.returnBook(borrower, book1);
    	
    	    borrower.displayBorrowedBooks();
    	    
    	    library.displayLibraryBooks();
    	}
    	
    	public static void main(String[] args) {
    		new Main();
    	}
    }

Expected output:
```
Book added to library: Java Programming
Book added to library: Clean Code
Alice borrowed: Java Programming
Alice borrowed: Clean Code
Alice's Borrowed Books:
Title: Java Programming
ISBN: 123456789
Author: James Gosling
Biography: Creator of the Java programming language.
------------------------
Title: Clean Code
ISBN: 987654321
Author: Robert C. Martin
Biography: Known for his works on software craftsmanship.
------------------------
Alice returned: Java Programming
Alice's Borrowed Books:
Title: Clean Code
ISBN: 987654321
Author: Robert C. Martin
Biography: Known for his works on software craftsmanship.
------------------------
Books in Library:
Title: Java Programming
ISBN: 123456789
Author: James Gosling
Biography: Creator of the Java programming language.
------------------------
```
I need to complete the code without changing any Main.java,

So this is my solution:
src -> exercise_library_01
