package lms.demod.Entity;

import lms.demod.Service.LibraryOperations;

public abstract class User<Role> {
	
	private static int userId=1;
	private String userName;
	private String password;
	private Role role;

	public User(String userName, String password, Role role) {
		super();
		this.userName = userName;
		this.password = password;
		this.role = role;
	}

	public int getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public abstract void showMenu(LibraryOperations libops);

	@Override
	public String toString() {
		return "User [userName=" + userName +   "]";
	}
	


}
