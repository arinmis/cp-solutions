import java.util.*;
 
public class Watermelon { 
 
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        int weight = input.nextInt();
        if(isPossible(weight))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
 
    // t != c + c
    // 7 = 2 + 5
    // 2 = 1 + 1
    public static boolean isPossible(int weight) {
        if(weight % 2 == 0 && weight != 2)
            return true;
        return false;
    }
 
}
