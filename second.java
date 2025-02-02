import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int len = word.length();
        int sum = 0;
        for(int i=0;i<len / 2 ;i++){
            char n = word.charAt(i);
            char m = word.charAt(len - i - 1);
            sum += Math.min((int) n,(int) m);
        }
        System.out.println(sum);
    }
}
