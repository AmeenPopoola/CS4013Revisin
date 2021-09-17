import java.util.Scanner;

public class Exercise7_1{

    public static double[][] getMatrix() {
        Scanner input = new Scanner(System.in);
        int rows = 3;
        int columns = 4;
        double[][] m = new double[rows][columns];

        System.out.println("Enter a 3x4 Matrix Row by Row");
        for(int row = 0; row < m.length; row++){
            for(int col = 0; col < m[row].length; col++){
                m[row][col] = input.nextDouble();

            }
        }
        return m;
    }

    public static double sumColumn(double[][] m , int columnIndex){
        double sum = 0;
        for(int row = 0; row < m.length; row++){
            sum = sum + m[row][columnIndex];
        }
        return sum;
    }

    public static void main(String[]args) {
        double [][] matrix = getMatrix();

        for(int col = 0; col < matrix[0].length; col++){
            System.out.println("The sum of the elements in column " + col + " is "+ sumColumn(matrix , col));
        }
    }
}

