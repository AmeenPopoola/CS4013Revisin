import java.util.Scanner;

public class Exercise4_16
{ public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int number = input.nextInt();

        while(number % 2 == 0) {
            System.out.print(2 + " ");
            number = number / 2;
        }

        for(int i=3; i <= Math.sqrt(number) ; i = i + 2){
            while(number % i == 0) {
                System.out.print(i + " ");
                number = number / i;
            } if(number >=2) { 
                System.out.println(number);
            } 
        }
    }
}