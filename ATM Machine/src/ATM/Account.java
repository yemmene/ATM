package ATM;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    // Create a private int data field named id for the account (default 0 );
	private int id = 0;
	
	// Create a private double data field named balance for the account (default 0 );
    private double balance = 0.0;
    
    //Create a private double data field named annualInterestRate that stores the cur- rent interest rate (default 0 );
    private static double annualInterestRate = 0.0;
    
    // Create a A private Date data field named dateCreated that stores the date when the account was created;
    
    private java.util.Date dateCreated;
    // A no-arg constructor that creates a default account;
	private ArrayList<Object> transactions;
	
	//Create A constructor that creates an account with the specified id and initial balance;

    public Account() {
        dateCreated = new java.util.Date();
        setTransactions(new ArrayList<>());
        
    }

    //The accessor and mutator methods for id , balance , and annualInterestRate; The accessor method for dateCreated; 
    public Account(int id, double balance) {
        this();
        this.id = id;
        this.balance = balance;
        annualInterestRate = 0.0;
        dateCreated = new Date();

        
    }
//Return id;
    public int getId() {
        return this.id;
    }
//Return Balance;
    public double getBalance() {
        return this.balance;
    }
  //Return annualInterestRate;
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
//Return dateCreate;
    public String getDateCreated() {
        return this.dateCreated.toString();
    }
//Set Id;
    public void setId(int id) {
        this.id = id;
    }
//Set balance;
    public void setBalance(double balance) {
        this.balance = balance;
    }
//Set AnnualInteresteRate
    public void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }
//A method named getMonthlyInterestRate() that returns the monthly interest rate;
    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12 ;
    }
//A method named getMonthlyInterest() that returns the monthly interest;
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }
//A method named withdraw that withdraws a specified amount from the account;
    public void withdraw(double amount) {
        this.balance -= amount;
    }
//A method named deposit that deposits a specified amount to the account
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