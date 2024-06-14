package org.lessons.java.snacks;

public class ContoBancario {
	
	private int accountNumber;
	private int accountBalance;
	
	public ContoBancario(int accountNumber, int accountBalance) {
		this.accountNumber = accountNumber;
		this.accountBalance = 0;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public int getAccountBalance() {
		return accountBalance;
	}

	public void depositCash(int accountBalance) {
		this.accountBalance += accountBalance;
	}
	public void whitdrawCash(int accountBalance) {
		this.accountBalance -= accountBalance;
	}

}
