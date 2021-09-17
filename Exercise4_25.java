import java.util.Scanner;
public class Exercise4_25{ 
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        int n;
        int sum = 0;

        System.out.println("Enter a number : ");
        n = input.nextInt();
        
        for(int i = 1; i<=n; i++){
            sum = sum + i;
        }
        System.out.println("The sum is " + sum);
        
        }
    }

