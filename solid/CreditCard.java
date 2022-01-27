package com.solid;

public class CreditCard implements Transaction{

	@Override
	public void doTransaction(double amount) {
		System.out.println("Fine paid using Credit card:");
		System.out.println(amount);
	}

}
