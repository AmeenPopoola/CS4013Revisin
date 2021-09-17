
import java.util.Scanner;

public class Exercise2_25{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter employee's name: ");
        String name = input.next();
        
        System.out.println("Enter number of hours worked in a week: ");
        double noOfHours = input.nextDouble();
        
        System.out.println("Enter hourly of pay rate: ");
        double hourlyPay = input.nextDouble();
        
        System.out.println("Enter federal tax withholding rate: ");
        double federalTaxWithholdingRate = input.nextDouble();
        
        System.out.println("Enter state tax withholding rate: ");
        double stateTaxWithholdingRate = input.nextDouble();
        
        double grossPay = noOfHours * hourlyPay;
        double fedMoney = federalTaxWithholdingRate * grossPay;
        double stateMoney = stateTaxWithholdingRate * grossPay;
        double netPay = grossPay - fedMoney - stateMoney;
        
        System.out.println("Employee Name : " + name);
        System.out.println("Hours Worked : " + noOfHours);
        System.out.println("Pay Rate : " + hourlyPay);
        System.out.println("Gross Pay : " + grossPay );
        System.out.println("Deductions: ");
        System.out.println("   Federal Witholding "+"("+ federalTaxWithholdingRate + ") : "  + fedMoney);
        System.out.println("   State Withholding "+"("+ stateTaxWithholdingRate + ") : " + stateMoney);
        System.out.println("Net Pay : " + netPay );
    }
}
    