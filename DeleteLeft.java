import java.util.*;

public class DeleteLeft{

    // est
    // est
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.next();
        String str2 = input.next();
        int totalStep = calcStep(str1, str2);
        System.out.println(totalStep);
    }

    // t 
    // w
    // 4 + 4 -  2 * 3 =  8 - 6 = 2 
    public static int calcStep(String str1, String str2) {
        int common = findCommon(str1, str2);
        return str1.length() + str2.length() - 2 * common; 
    }

    // est 
    // west
    public static int findCommon(String str1, String str2) {
        int count = 0;
        int minLength = Math.min(str1.length(), str2.length());
        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(str1.length() - i - 1) != str2.charAt(str2.length() - i - 1))
                break;
            count++;
        }
        return count;
    }

}
