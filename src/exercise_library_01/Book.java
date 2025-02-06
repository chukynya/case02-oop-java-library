package exercise_library_01;

public class Book {
	private String bookTitle;
	private String bookID;
	private Author bookAuthor;
	private boolean isAvailable;
	public Book(String bookTitle, String bookID, Author bookAuthor) {
		this.bookTitle = bookTitle;
		this.bookID = bookID;
		this.bookAuthor = bookAuthor;
		this.isAvailable = true;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public String getBookID() {
		return bookID;
	}
	public String getBookAuthor() {
		return bookAuthor.getAuthorName();
	}
	public String getBookBiography() {
		return bookAuthor.getAuthorDescription();
	}
}
