package lms.demod.Entity;

import java.util.Scanner;

import lms.demod.Service.LibraryOperations;

public class Admin extends User{
	

	
	public Admin( String userName, String password) {
		super(userName, password,Role.Admin);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showMenu(LibraryOperations library) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		    int choice;

		    do {
		        System.out.println("\n===== Admin Menu =====");
		        System.out.println("1. Add Book");
		        System.out.println("2. Remove Book");
		        System.out.println("3. View All Books");
		        System.out.println("4. add member");
		        System.out.println("5. remove member");
		        System.out.println("6. View All Users");
		        System.out.println("0. Logout");
		        System.out.print("Enter choice: ");
		        choice = sc.nextInt();

		        switch (choice) {
		            case 1:
		                System.out.println("Adding book...");
		                 library.addBook();
		                break;

		            case 2:
		                System.out.println("Removing book...");
		                System.out.println("Enter Book Name ");
		                String str= sc.nextLine();
		                library.removebook(str);
		                break;

		            case 3:
		                System.out.println("Listing all books...");
		                library.viewBooks();
		                break;
		            case 4:
		                System.out.println("adding user...");
		                library.addUser();
		                break;
		            case 5:
		                System.out.println("removing user");
		                System.out.println("Enter user Name ");
		                String str2= sc.nextLine();
		                library.removeUser(str2);;
		                break;
		            case 6:
		                System.out.println("Listing all users...");
		                library.viewmembers();
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
