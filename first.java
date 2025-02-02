import java.util.*;

class Main {
    public static void forgettenOperator(int a,int b){
        int res = a - (b * (a / b));
        System.out.println(res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        forgettenOperator(a,b);
    }
}
