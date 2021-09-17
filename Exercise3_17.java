
import java.util.Scanner;
import java.util.Random;

public class Exercise3_17{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("scissor (0) , rock (1) , paper (2) :  ");
        
        int user = input.nextInt();
        
        int comp = (int)(Math.random()*3);

        int scissor = 0;
        int rock = 1;
        int paper = 2;

        if(comp == 0){
            if(user ==0){
                System.out.println("The computer is scissor. You are scissor too. It's a draw");
            } else if(user == 1){
                System.out.println("The computer is scissor. You are rock. You won");
            } else {
                System.out.println("The computer is scissor. You are paper. You lost");
            } 
        } else if(comp == 1){
            if(user == 0){
                System.out.println("The computer is rock. You are scissor. You lost");
            }else if(user == 1){
                System.out.println("The computer is rock. You are rock too. It's a draw");
            } else {
                System.out.println("The computer is rock. You are paper. You won");
            } 
        } else {
            if(user == 0){
                System.out.println("The computer is paper. You are scissor. You won");
            }else if(user == 1){
                System.out.println("The computer is paper. You are rock. You lost");
            } else {
                System.out.println("The computer is paper. You are paper too. It's a draw");
            } 
        }
    }
}
