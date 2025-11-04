package PROJECT;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Morgeshcalcutor {
    public static void main (String [] arg){

       Scanner input = new Scanner(System.in);

       System.out.println("== Mortgage Calculator ==");

       System.out.print("Enter loan amount: ");

       double principal = input.nextDouble();

       System.out.print("Enter annual interest rate (e.g., 8.5 for 8.5%): ");

       double annualInterestRate = input.nextDouble();

       System.out.print("Enter loan period (in years): ");

       int years = input.nextInt();

       double monthlyInterestRate = (annualInterestRate / 100) / 12;

       int numberOfPayments = years * 12;

       double monthlyPayment = (principal * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))

               / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

       double totalPayment = monthlyPayment * numberOfPayments;

       double totalInterest = totalPayment - principal;

   
   }

}
 





   


 













    
    

