import java.util.*;

public class Exercise6_13 {
    public static int getRandom(int... numbers){
        int randomNum = (int)(1 + Math.random() * 54);
        for(int num : numbers){
            if(randomNum == num) {
                return getRandom(numbers);
            }
        }
        return randomNum;
    }

    
}
