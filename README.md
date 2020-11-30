This repo is the solution to two exercises from the Book "Introduction to Java Programming: Comprehensive version - 10th Edition written by Y Daniel Liang. Class Account is an attempt to propose a solution to exercise 9.7 of Chapter 9, and the Class ATM is an attempt to create the ATM Machine App suggested in Exercise 10.7 of chapter 10.

Requirement for exercise 9.7

(The Account Class) Design a class named Account that contains:
A private int data field named id for the account (default 0 ).
A private double data field named balance for the account (default 0 ).
A private double data field named annualInterestRate that stores the cur-
rent interest rate (default 0 ). Assume all accounts have the same interest rate.
A private Date data field named dateCreated that stores the date when the account was created.
A no-arg constructor that creates a default account.
A constructor that creates an account with the specified id and initial balance.
The accessor and mutator methods for id , balance , and annualInterestRate .
The accessor method for dateCreated .
A method named getMonthlyInterestRate() that returns the monthly interest rate.
A method named getMonthlyInterest() that returns the monthly interest.
A method named withdraw that withdraws a specified amount from the account.
A method named deposit that deposits a specified amount to the account.

Draw the UML diagram for the class and then implement the class. (Hint: The
method getMonthlyInterest() is to return monthly interest, not the interest rate.
Monthly interest is balance * monthlyInterestRate . monthlyInterestRate is annualInterestRate / 12 . Note that annualInterestRate is a percentage,
e.g., like 4.5%. You need to divide it by 100.)
Write a test program that creates an Account object with an account ID of 1122, a balance of $20,000, and an annual interest rate of 4.5%. Use the withdraw
method to withdraw $2,500, use the deposit method to deposit $3,000, and print the balance, the monthly interest, and the date when this account was created

Requirements for Exercise 10:7 of Chapter 10.

Use the Account class created in Programming Exercise 9.7 to simulate an ATM machine. Create ten accounts in an array with id 0, 1, ..., 9, and
initial balance $100. The system prompts the user to enter an id. If the id is entered incorrectly, ask the user to enter a correct id. Once an id is
accepted, the main menu is displayed as shown in the sample run. You can enter a choice 1 for viewing the current balance, 2 for withdrawing money,
3 for depositing money, and 4 for exiting the main menu. Once you exit, the system will prompt for an id again. Thus, once the system starts, it will
not stop.
