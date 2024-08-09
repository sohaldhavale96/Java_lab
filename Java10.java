// Lab 7
import java.util.Scanner;

class Saving_Account{
    // members : annualintrate(static),savingbalance(int)
    private static double annualIntrestRate = 12/100d;
    private double savingBalance;
    // methods : savingBalance,monthlyintrest,modifyintrest(static),getsavingbalance
    Saving_Account(){
        setSavingBalance(500d);
    }
    Saving_Account(double balance){
        setSavingBalance(balance);
    }
    public void setSavingBalance(double Balance){
        savingBalance = Balance;
    }
    public final double getSavingBalance(){
        return savingBalance;
    }
    public final double CalculateMonthlyIntrestRate(){
        double monthlyIntrest = savingBalance*getMonthlyIntrestRate();
        // savingBalance += monthlyIntrest;
        return monthlyIntrest;
    }
    public final double MonthlyAmount(){
        return getSavingBalance()+CalculateMonthlyIntrestRate();
    }
    public final static void ModifyIntrest(double NewRate){
        annualIntrestRate = NewRate;
    }
    public final double getannualIntrestRate(){
        return annualIntrestRate;
    }
    public final double getMonthlyIntrestRate(){
        return annualIntrestRate/12d;
    }
    public final void status(){
        System.out.println("Current balance in account : "+savingBalance);
        System.out.println("Annual Intrest rate : "+getannualIntrestRate());
        System.out.println("Monthly Intrest rate : "+getMonthlyIntrestRate());
        System.out.println("Monthly balance add on balance "+getSavingBalance()+" is "+CalculateMonthlyIntrestRate());
        System.out.println("Total monthly balance "+getSavingBalance()+" is "+MonthlyAmount());
    }
}

public class Java10{
    public static void main(String[] args) {
        // Creating scanner
        Scanner sc = new Scanner(System.in);
        // Creating object1
        Saving_Account s1 = new Saving_Account(10000d);
        s1.status();
        Saving_Account.ModifyIntrest(11d);
        s1.status();
        sc.close();
    }
}