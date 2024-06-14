package org.lessons.java.snacks;

public class ContoBancario {
	
	private int accountNumber;
	private int accountBalance;
	
	public ContoBancario(int accountNumber) {
		this.accountNumber = accountNumber;
		this.accountBalance = 0;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public int getAccountBalance() {
		System.out.println("Il tuo credito attuale è €" + this.accountBalance);
		return accountBalance;
	}

	public void depositCash(int deposit) {
		this.accountBalance += deposit;
		System.out.println("Hai depositato €" + deposit);
	}
	public void whitdrawCash(int whitdraw) {
		this.accountBalance -= whitdraw;
		System.out.println("Hai prelevato €" + whitdraw);
	}

}
