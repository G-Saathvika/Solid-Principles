package com.solid;

public class LibraryManagement {
	public static void main(String[] args) {
		
		ResetPassword new_password = new ResetPassword("12345");
		new_password.reset();
		
		NotificationService service = new EmailNotification();
		service.sendNotification();
		
		Transaction amount = new CreditCard();
		FineTransaction fine = new FineTransaction(amount);
		fine.payFine(1000);
		
	}
}
