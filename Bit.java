import java.util.*;

public class Bit {

    /*
    x++ -> x + 1
    ++x -> x + 1
    x-- -> x - 1
    --x -> x - 1
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int result = 0;
        for (int i=0; i<n; i++) { 
            String operation = input.next();
            if (operation.charAt(1) == '+')
                result++;
            else 
                result--;
        }
        System.out.println(result);
    }

}
