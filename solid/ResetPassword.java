package com.solid;

public class ResetPassword {
	String password;
	public ResetPassword(String password) {
		this.password=password;
	}
	public void reset() {
		System.out.println("Reset password to:"+password);
	}
}
