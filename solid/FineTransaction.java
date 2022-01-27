package com.solid;


public class FineTransaction{
	private Transaction t;

    public FineTransaction(Transaction t) {
        this.t = t;
    }

    public void payFine(double amount){
        t.doTransaction(amount);
    }
}