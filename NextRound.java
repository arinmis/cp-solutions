import java.util.*;

public class NextRound {

    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int advancedIndex = input.nextInt() - 1;
        int[] scores = new int[n];
        for(int i=0; i<n; i++)
            scores[i] = input.nextInt();
        int numberOfPassed = scores.length - countNumOfFailed(scores, advancedIndex);
        System.out.println(numberOfPassed);
    }

    // calculate number of failed participant
    public static int countNumOfFailed(int[] scores, int index) {
        int count = 0;
        for(int i=scores.length - 1; i>=0; i--) {
            if(scores[i] < scores[index] || scores[i] == 0)
                count++;
            else
                break;
        }
        return count;
    }

}
