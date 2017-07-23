package com.jetprogramming.services;

public class UserValidationService {

	public boolean isUserValid(String user, String password) {
		return user.equals("jet") && password.equals("jet");
	}

}
