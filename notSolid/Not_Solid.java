package com.notSolid;

interface Transaction {
	public void doTransaction(double amount);
}
class notification_Service implements Transaction{
	
	public void notify(String typeOfNotification) {
		if(typeOfNotification.equalsIgnoreCase("email")) {
			System.out.println("Notification sent through email.");
		}
		else if(typeOfNotification.equalsIgnoreCase("post")) {
			System.out.println("Notification sent through post.");
		}
	}

	@Override
	public void doTransaction(double amount) {
		System.out.println("not applicable");
	}
}
class Library_Management extends notification_Service {
	public void resetPassword(String password) {
		System.out.println("Password has been reset to:"+password);
	}
	
	public void addBook(String name) {
		System.out.println("Added book "+name+" to catalog");
	}
}


class creditCardPayment {
	public void doTransaction(double amount) {
		System.out.println("Fine paid using Credit card:");
		System.out.println(amount);
	}

}
class debitCardPayment{
	public void doTransaction(double amount) {
		System.out.println("Fine paid using Debit card:");
		System.out.println(amount);
	}
}
class FineTransaction{
	private creditCardPayment c;

    public FineTransaction(creditCardPayment c) {
        this.c = c;
    }

    public void payFine(double amount){ 
        c.doTransaction(amount);
    }
}

public class Not_Solid {
	public static void main(String[] args) {
		Library_Management obj = new Library_Management();
		obj.resetPassword("jhbvkv");
		obj.addBook("Harry Potter");
		obj.notify("email");
		obj.doTransaction(500);
		
		creditCardPayment cc = new creditCardPayment();
		FineTransaction fine = new FineTransaction(cc);
		fine.payFine(500);
		
	}
}
