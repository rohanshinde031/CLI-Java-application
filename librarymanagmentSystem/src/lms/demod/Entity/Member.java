package lms.demod.Entity;

import java.util.Scanner;

import lms.demod.Service.LibraryOperations;

public class Member extends User {

	
	//private Library library; 
	
	public Member(String userName, String password) {
		super(userName, password, Role.Member);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showMenu(LibraryOperations library) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		    int choice;

		    do {
		        System.out.println("\n===== Member Menu =====");
		        System.out.println("1. view Books");
		        System.out.println("2. brrow Book");
		        System.out.println("3. return book");
		        System.out.println("0. Logout");
		        System.out.print("Enter choice: ");
		        choice = sc.nextInt();

		        switch (choice) {
		            case 1:
		                System.out.println("view books...");
		                 library.viewBooks();
		                break;

		            case 2:
		                System.out.println("brrow book...");
		                System.out.println("Enter Book Name ");
		                String str= sc.nextLine();
		                library.brrowBook(str);
		                break;

		            case 3:
		                System.out.println("return book...");
		                System.out.println("Enter Book Name ");
		                String str1= sc.nextLine();
		                library.returnBook(str1);
		                break;

		            case 0:
		                System.out.println("Logging out...");
		                break;

		            default:
		                System.out.println("Invalid choice, try again!");
		        }

		    } while (choice != 0);
	}


}
