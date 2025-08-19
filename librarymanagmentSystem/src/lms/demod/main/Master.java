package lms.demod.main;

import java.util.ArrayList;
import java.util.Scanner;

import lms.demod.Entity.Admin;
import lms.demod.Entity.Book;
import lms.demod.Service.*;
import lms.demod.Entity.Member;
import lms.demod.Entity.User;

public class Master {

	static ArrayList<Book> bookArr = new ArrayList<Book>();
	
	static ArrayList<User> userlist = new ArrayList<User>();
	
	static {
	     // Add 3 books
        bookArr.add(new Book( "Java Basics", "Author A",true));
        bookArr.add(new Book( "OOP Concepts", "Author B",true));
        bookArr.add(new Book( "Data Structures", "Author C",true));

        // Add 3 users
        userlist.add(new Admin( "admin", "admin123")); // Admin user
        userlist.add(new Member( "rohan", "pass123")); // Member user
        userlist.add(new Member( "neha", "12345"));    // Member user
	}
	
	public User login(ArrayList<User> userlist)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to library! Please provide your username: ");
		String username = sc.nextLine();
		System.out.println("Please provide your password: ");
		String password = sc.nextLine();
		
		for(User u : userlist)
		{
			if(u.getUserName().equals(username) && u.getPassword().equals(password))
			{
				System.out.println("Login success : ");
				return u;
			}
		}
		
		return null;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Master m = new Master();
		    User user = m.login(userlist);

		    if (user != null) {
		        LibraryOperations libops = new Library(bookArr,userlist);  // ✅ initialize library
		        user.showMenu(libops);   // ✅ pass library to user
		    } else {
		        System.out.println("System not available!");
		    }
		
	}

}
