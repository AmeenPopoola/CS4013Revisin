import java.util.Scanner;

public class Exercise2_13{
   public static void main(String[]args){
       Scanner input = new Scanner(System.in);
       
       System.out.println("Enter a number for monthly amount: ");
       double monthlyDeposits = input.nextDouble();
       double monthlyInterestRate = 0.05/ 12 ;
       double interestFactor = 1 + monthlyInterestRate;
       
       int count = 6;
       double total = 0;
       
       while(count !=0){
           total = total + monthlyDeposits * interestFactor;
           --count;
        }
       
       System.out.print("After six months there is " + total + " in your savings account");
        
       
       
       
    }
}