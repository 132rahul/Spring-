package com.plash.test.Model;

public class Authenticator {

	public String authenticate(String username, String password) {
		if (("prasad".equalsIgnoreCase(username))
				&& ("password".equals(password))) {
			return "success";
		} else {
			return "failure";
		}
	}
}

//Here we need to connect a database..!