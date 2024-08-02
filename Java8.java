// Lab 5

// Declaring Class BankAccount
class BankAccount{

	// Instance variables
	private String accountNumber = new String("");
	private String accountHolderName = new String();
	private double balance;
	private String accountDetails;
	private static int accountID = 0;

	// Parameterless constructor
	BankAccount(){
		accountHolderName = "Unkown";
		balance = 0.0;
		accountDetails = "";
		accountID++;
		accountNumber += "SBIICHDD"+accountID;
	}

	// Copy constructor
	BankAccount(BankAccount acc){
		accountHolderName = acc.accountHolderName;
		balance = acc.balance;
	}

	// Parameterised constructor
	BankAccount(String name,double amount){
		accountHolderName = name;
		balance = amount;
		accountID++;
		accountNumber += "SBIICHDD"+accountID;
	}

	// Deposite to add funds to the balance
	public void deposite(double amount){
		balance += amount;
	}

	//  Withdraw to subrtact funds 
	public void withdraw(double amount){
		if(amount<=balance){
			balance -= amount;
			System.out.println("Amount withdrawed : "+amount);
			System.out.println("Current balance : "+balance);
		}else{
			System.out.println("Insufficient Balance.");
		}
	}

	public String getAccountDetails(){
		accountDetails = "Account Number : "+accountNumber+"\nAccount Holder Name : " + accountHolderName+" \nAmount :  "+balance;
		// Double.toString(balance);
		return accountDetails;
	}
}

public class Java8{
	public static void main(String[] args){
		// Calling parameterless constructor
		BankAccount acc1 = new BankAccount();
		// Copy constructor
		BankAccount acc2 = new BankAccount(acc1);
		// Parameterised cusntructor
		BankAccount acc3 = new BankAccount("Sohal",9999.99d);
		System.out.println("Account Details : \n"+acc3.getAccountDetails());
		acc3.withdraw(5000d);
		System.out.println("Account Details : \n"+acc1.getAccountDetails());
		System.out.println("Account Details : \n"+acc3.getAccountDetails());
	}
}
