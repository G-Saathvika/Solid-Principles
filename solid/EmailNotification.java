package com.solid;

public class EmailNotification extends NotificationService{

	@Override
	public void sendNotification() {
		System.out.println("Sent notification through email.");
	}

}
