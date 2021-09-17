import java.util.Scanner;

public class Exercise3_21 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter year: ");
        int year = input.nextInt();
        
        System.out.println("Enter month: 1-12: ");
        int month = input.nextInt();
        
        System.out.println("Enter the day of the month: 1-31: ");
        int q = input.nextInt();
        
        int m;
        if(month ==1){
            m = 13;
            year = year - 1;
        } else if(month == 2){
            m = 14;
            year = year - 1;
        } else { 
            m = month;
        }
            
        int j = year / 100;
        int k = year % 100;
        
        int h =(q  + ((26 * (m + 1))/10) + k + (k / 4) + (j / 4) + (5 * j)) % 7; 
        
        if(h == 0) {
            System.out.println("Day of the week is Saturday");
        } else if( h == 1) {
            System.out.println("Day of the week is Sunday");
        }else if( h == 2) {
            System.out.println("Day of the week is Monday");
        }else if( h == 3) {
            System.out.println("Day of the week is Tuesday");
        }else if( h == 4) {
            System.out.println("Day of the week is Wednesday");
        }else if( h == 5) {
            System.out.println("Day of the week is Thursday");
        }else if( h == 6) {
            System.out.println("Day of the week is Friday");
        }
        
        
    }
}
    
