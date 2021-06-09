import java.util.*;

public class DominoPiling {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int result = getDominoAmount(n, m);
        System.out.println(result);
    }

    public static int getDominoAmount(int n, int m) {
        if(n % 2 == 0 || m % 2 == 0)
            return n * m / 2;
        return (n * m - 1) / 2; 
    }

}
