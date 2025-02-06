package exercise_library_01;

public class Author {
	private String authorName;
	private String authorDescription;
	public Author(String authorName, String authorDescription) {
		this.authorName = authorName;
		this.authorDescription = authorDescription;
	}
	public String getAuthorName() {
		return authorName;
	}
	public String getAuthorDescription() {
		return authorDescription;
	}
}
