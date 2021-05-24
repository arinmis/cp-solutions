import java.util.*;
 
public class Abbreviation { 
 
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=0; i<n; i++) { 
            String word = input.next();
            word = abbreviate(word);
            System.out.println(word);
        }
    }
 
 
    public static String abbreviate(String str) { 
        if(str.length() <= 10)
            return str;
        return str.substring(0, 1) + str.substring(1, str.length() - 1).length() 
          + str.substring(str.length() - 1);
    }
 
}
