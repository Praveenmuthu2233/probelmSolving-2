
import java.util.*;

class main {

    public static int count(String word) {
        int n = word.length();
        int[] dp = new int[n + 1];

        for (int i = 0; i < n; i++) {
            boolean words = (word.charAt(i) == 'P');
            if (words) {
                if (i + 1 <= n) {
                    dp[i + 1] += dp[i];
                }
                if (i + 2 <= n) {
                    dp[i + 2] += dp[i];
                }
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println(count(word));
    }
}
