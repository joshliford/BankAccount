//This program is a continuation of class 'AccountLiford' using its defined data values and methods
//Note: id, initialBalance, withdraw amount, deposit amount, and AnnualInterestRate can all be changed per user request
public class TestAccountLiford {
    public static void main(String[] args) {

        AccountLiford myAccount2 = new AccountLiford(68245, 5000);
        // This line of code creates an instance of the AccountLiford class and initializes it with specific values

        System.out.print("Your initial account balance is $" + String.format("%,.2f", myAccount2.getBalance()) + ".");
        //Program outputs the users initial account balance based on the object parameters. Balance amount is then rounded to 2 decimal places.

        myAccount2.withdraw(5500);
        System.out.print("\nYour new account balance after withdraw is $" + String.format("%,.2f", myAccount2.getBalance()) + ".");
        //Program outputs the users new balance based on the amount entered to be withdrawn. Balance amount is then rounded to 2 decimal places.

        myAccount2.deposit(2000);
        System.out.print("\nYour new account balance after deposit is $" + String.format("%,.2f", myAccount2.getBalance()) + ".");
        //Program outputs the users new balance based on the amount entered to be deposited. Balance amount is then rounded to 2 decimal places.

        myAccount2.setAnnualInterestRate(3.5);
        System.out.print("\nYour monthly interest rate is " + Math.round(myAccount2.getMonthlyInterestRate() * 100.0) / 100.0 + "%.");
        //Program outputs the users monthly interest rate based on the amount entered. Interest rate is rounded to the nearest Hundredths place

        System.out.print("\nYour earned monthly interest based on your annual interest rate is $" + String.format("%,.2f", myAccount2.getMonthlyInterest()) + ".");
        //Program outputs the users earned monthly interest. Amount is then rounded up 2 decimal places.

        java.util.Date date = new java.util.Date();
        System.out.print("\nDate Opened: " + date.toString());
        //Program prints the date the account was open including day, month, time, timezone, and year

        System.out.print(myAccount2);
        //Program calls the myAccount2 object to output information stored in that object
    }
}
