//This program class will define multiple data fields and methods that can be called/used in program # 2 'TestAccountLiford.java'
import java.util.Date;

public class AccountLiford {
    private int id;//Stores the account ID with an initial value of 0
    private double balance;//Stores the account balance with an initial value of 0.0
    private double annualInterestRate;//Stores the account interest rate with an initial value of 0.0
    private Date dateCreated;//Stores the date that the account was created

    public AccountLiford() { // Non-argument constructor method that creates a default account
    id = 0;
    balance = 0.00;
    annualInterestRate = 0.0;
    dateCreated = new Date();
    }

    public AccountLiford(int id, double initialBalance) {// Overloaded construtor method that creates a unique account ID and balance
    this.id = id; // this.id pulls in the user provided ID number in the TestAccount program
    this.balance = initialBalance; // this.balance does the same as above
    annualInterestRate = 0.0;
    dateCreated = new Date();
    }

    public int getID() {// Getter method for the id variable
        return id;
    }

    public void setId(int id) {// Setter method for the id variable
        this.id = id;
    }

    public double getBalance() {// Getter method for the balance variable
        return balance;
    }

    public void setBalance(double balance) {// Setter method for the balance variable
        this.balance = balance;
    }

    public double getAnnualInterestRate() {// Getter method for the annualInterestRate variable
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {// Setter method for the annualInterestRate variable
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {// Getter method for the dateCreated variable
        return dateCreated;
    }

    public double getMonthlyInterestRate() {// Method that returns the monthly interest rate as a percentage (%)
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {// Method that returns the earned monthly interest amount as currency ($)
        return balance * (getMonthlyInterestRate() / 100);
    }

    public void withdraw(double amount) {// Method that withdraws a specific amount from the users account
        if (amount <= balance) {
            balance -= amount;
        } else
            System.out.print("\nWithdraw cancelled due to insufficient funds.");
    }

    public void deposit(double amount) {// Method that deposits a specific amount to the users account
        if (amount > 0) {
            balance += amount;
        } else
            System.out.print("\nPlease enter a valid deposit amount.");
    }

    public String toString() { // returns a string representation of the account
        return "\nAccount ID: " + id + "\n" + "Account Balance: $" + String.format("%,.2f", balance) + "\n" + "Interest Rate: " + annualInterestRate + "%" + "\n" + "Date Opened: " + dateCreated;
    }
}
