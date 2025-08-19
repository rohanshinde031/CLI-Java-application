package lms.demod.Entity;

public class Book {
	
	private static int bookId= 1001;
	private String bookName;
	private String author;
	private boolean avilability;
	
	public int getBookId() {
		return bookId;
	}

	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public boolean isAvilability() {
		return avilability;
	}
	public void setAvilability(boolean avilability) {
		this.avilability = avilability;
	}
	
	public Book( String bookName, String author, boolean avilability) {
		super();
		this.bookId ++;
		this.bookName = bookName;
		this.author = author;
		this.avilability = avilability;
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", author=" + author + ", avilability=" + avilability + "]";
	}
	
	

}
