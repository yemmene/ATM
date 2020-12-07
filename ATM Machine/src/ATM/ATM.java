package ATM;


import java.util.Scanner;

	public class ATM {
	    private static final Scanner in = new Scanner(System.in);
//Create ten accounts in an array with id 0, 1, ..., 9, and initial balance $100;
	    public static void main(String[] args) {
	        Account[] accounts = new Account[10];
	        for (int i = 1; i < 11; i++) {
	            accounts[i - 1] = new Account(i, 100.0);
	        }
//The system prompts the user to enter an id.
	        System.out.print("Enter an id (1 - 10): ");
	        int id = in.nextInt();
//If the id is entered incorrectly, ask the user to enter a correct id.
	        if (id < 1 || id > 10) {
	            id = incorrectId(id);
	        }
//Once an id is accepted, the main menu is displayed as shown in the sample run.
	        
	        while (true) {
	            menuDisplay();
	            System.out.print("Enter a choice: ");
	            int choice = in.nextInt();

	            if (choice == 4) {
	                System.out.printf("%nEnter an id (1 - 10): ");
	                id = in.nextInt();

	                if (id < 1 || id > 10) {
	                    id = incorrectId(id);
	                }
	            }
	            performChoice(id, choice, accounts);
	        }
	    }

	    public static int incorrectId(int id) {
	        //Scanner in = new Scanner(System.in);
	        while (id < 1 || id > 10) {
	            System.out.print("Please enter a valid id: ");
	            id = in.nextInt();
	            System.out.println();
	        }
	        return id;
	    }

	    public static void performChoice(int id, int choice, Account[] accounts) {
	        //Scanner in = new Scanner(System.in);
	        switch (choice) {
	            case 1: 
	                System.out.printf("The balance is $%.1f%n",
	                                 accounts[id - 1].getBalance());
	                break;
	            case 2:
	                System.out.print("Enter the amount to withdraw: ");
	                accounts[id - 1].withdraw(in.nextDouble());
	                break;
	            case 3:
	                System.out.print("Enter the amount to deposit: ");
	                accounts[id - 1].deposit(in.nextDouble());
	                break;
	            default:
	                break;
	        }
	    }
/*You can enter a choice 1 for viewing the current balance, 2 for withdrawing money, 3 for
	    depositing money, and 4 for exiting the main menu*/
	    
	    public static void menuDisplay() {
	        System.out.printf("%nMain menu%n");
	        System.out.println("1: check balance");
	        System.out.println("2: withdraw");
	        System.out.println("3: deposit");
	        System.out.println("4: exit");
	    }
	} 