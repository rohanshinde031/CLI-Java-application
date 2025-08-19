package lms.demod.Service;

public interface LibraryOperations {

	public void addBook();
	
	public void addUser();
	
	public void removeUser(String name);
	
	public void returnBook(String bookName);
	
	public void removebook(String bookName);
	
	public void brrowBook(String bookName);

	public void viewBooks();

	public void viewmembers();
	
}
