package com.jetprogramming.services.impl;

import org.springframework.stereotype.Service;

import com.jetprogramming.services.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Override
	public boolean isUserValid(String user, String password) {
		return user.equals("jet");
	}

}
