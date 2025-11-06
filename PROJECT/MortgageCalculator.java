package PROJECT;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter Basic Salary: ");
    double basic = scanner.nextDouble();

    if(basic.nextDouble){

        System.out.println("This the amount");
    }
    else(){

        System.out.println("Enter only Numbers");
    }

    System.out.println("Enter Credit :"); 
    double Credit = scanner.nextDouble();

    if(Credit < 300 && Credit > 0){
        System.out.println("No Access");
    }
    else(Credit < 500 && Credit > 300){

        System.out.println("Access");
    }
    
    Systrem.out.println("Enter Criminal Record :");
     
    Boolean record = scanner.netBoolean;






        

        System.out.println("=== Bangladesh Mortgage Calculator (BDT) ===");

        
        System.out.print("Enter loan amount (Principal in BDT): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter annual interest rate (e.g., 8.5 for 8.5%): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter loan period (in years): ");
        int years = scanner.nextInt();

        
        double monthlyInterestRate = (annualInterestRate / 100) / 12;
        int numberOfPayments = years * 12;

       
        double mortgagePayment = principal
                * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);


        double totalPayment = mortgagePayment * numberOfPayments;
        double totalInterest = totalPayment - principal;

        
        Locale bdLocale = Locale.of("en", "BD");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(bdLocale);

        System.out.println("\n=== Mortgage Summary ===");
        System.out.println("Loan Amount: " + currencyFormatter.format(principal));
        System.out.println("Monthly Payment: " + currencyFormatter.format(mortgagePayment));
        System.out.println("Total Payment: " + currencyFormatter.format(totalPayment));
        System.out.println("Total Interest: " + currencyFormatter.format(totalInterest));

        scanner.close();
    }
}
 

