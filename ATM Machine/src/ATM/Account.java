package ATM;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0.0;
    private static double annualInterestRate = 0.0;
    private java.util.Date dateCreated;
	private ArrayList<Object> transactions;

    public Account() {
        dateCreated = new java.util.Date();
        setTransactions(new ArrayList<>());
        
    }

    public Account(int id, double balance) {
        this();
        this.id = id;
        this.balance = balance;
        annualInterestRate = 0.0;
        dateCreated = new Date();

        
    }

    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public String getDateCreated() {
        return this.dateCreated.toString();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12 ;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

	public ArrayList<Object> getTransactions() {
		return transactions;
	}

	public void setTransactions(ArrayList<Object> transactions) {
		this.transactions = transactions;
	}
} 