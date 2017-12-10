package be.pxl.multithreading.voorbeeld2;

public class BankAccount {
	private int balance;
	private String accountNumber;
	
	public BankAccount(String accountNumber, int initialBalance) {
		this.accountNumber = accountNumber;
		this.balance = initialBalance;
	}
	
	public void deposit(int amount) {
		balance += amount;
	}
	
	public void withdraw(int amount) {
		balance -= amount;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
}
