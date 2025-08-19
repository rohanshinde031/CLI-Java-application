package lms.demod.Service;

import java.util.ArrayList;
import java.util.Scanner;

import lms.demod.Entity.Book;
import lms.demod.Entity.Member;
import lms.demod.Entity.User;
import lms.demod.Entity.Admin;

public class Library implements LibraryOperations{

	   private ArrayList<Book> books;
	   private ArrayList<User> userlist;
	   
	   
	public Library(ArrayList<Book> books, ArrayList<User> userlist) {
		super();
		this.books = books;
		this.userlist= userlist;
	}

	@Override
	public void addBook() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter book Name :");
		String bookName=sc.nextLine() ;

		System.out.println("Enter Author :");
		String author=sc.nextLine() ;

		System.out.println("Enter Availibility true/ false :");
		boolean avilability=sc.nextBoolean() ;
		
		Book b= new Book(bookName,author,avilability);
		
		books.add(b);
		System.out.println("book added :");		

	}

	@Override
	public void returnBook(String bookName) {
		// TODO Auto-generated method stub
		for(Book b : books)
		{
			if( b.getBookName().equals(bookName))
			{
				b.setAvilability(true);
			}
		}
	}

	@Override
	public void removebook(String bookName) {
		// TODO Auto-generated method stub
		for(Book b : books)
		{
			if( b.getBookName().equals(bookName))
			{
				books.remove(b.getBookId());
			}
		}
	}
	public void viewBooks()
	{
		for(Book b : books)
		{
			System.out.println(b.toString());
		}
	}

	@Override
	public void brrowBook(String bookName) {
		// TODO Auto-generated method stub
		for(Book b : books)
		{
			if( b.getBookName().equals(bookName))
			{
				b.setAvilability(false);
			}
		}
	}

	@Override
	public void addUser() {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		    String name;

		    // Check for unique username
		    while (true) {
		        System.out.println("Enter username: ");
		        name = sc.next();
		        boolean exists = false;

		        for (User u : userlist) {
		            if (u.getUserName().equalsIgnoreCase(name)) {
		                exists = true;
		                System.out.println("This username is not available, try again!");
		                break;
		            }
		        }

		        if (!exists) break; // username is unique, exit loop
		    }

		    System.out.println("Enter password: ");
		    String password = sc.next();

		    System.out.println("Select user type (1. Admin, 2. Member): ");
		    int type = sc.nextInt();

		    User newUser;
		    if (type == 1) {
		        newUser = new Admin(name, password);
		    } else {
		        newUser = new Member(name, password);
		    }

		    userlist.add(newUser); // ✅ add to system
		    System.out.println("User added successfully: " + name);
	}

	@Override
	public void removeUser(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewmembers() {
		// TODO Auto-generated method stub
		for(User b : userlist)
		{
			System.out.println(b.toString());
		}
	}

	

}
