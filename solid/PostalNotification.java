package com.solid;

public class PostalNotification extends NotificationService{

	@Override
	public void sendNotification() {
		System.out.println("Sent notification through post.");
	}

}
