
public class Exercise5_5{
   
     
        public static void displayLargestNumber(double num1 , double num2 , double num3){
            double temp;
            if(num1 >= num2){
                temp = num1;
            } else { 
                temp = num2;
            } 
            
            if (temp >= num3){
                temp = num1;
            }else{
                temp = num3;
            }
        
            System.out.println("The largest number is " + temp);
        
    
    }
}