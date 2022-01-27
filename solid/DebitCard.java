package com.solid;

public class DebitCard implements Transaction{
	@Override
	public void doTransaction(double amount) {
		System.out.println("Fine paid using Debit card:");
		System.out.println(amount);
	}
}
