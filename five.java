
import java.util.*;

class main {

    public static void maths(String numStr) {
        String[] num = numStr.split("\\+|\\*|\\-|\\/");
        int numLen = num.length;
        int[] arrNum = new int[numLen];
        for (int i = 0; i < numLen; i++) {
            arrNum[i] = Integer.parseInt(num[i].trim());
        }
        String[] symbols = numStr.split("[0-9]+");
        List<String> operators = new ArrayList<>();

        for (int i = 1; i < symbols.length; i++) {
            operators.add(symbols[i]);
        }
        List<Integer> numList = new ArrayList<>();
        List<String> opList = new ArrayList<>(operators);

        numList.add(arrNum[0]);

        for (int i = 0; i < operators.size(); i++) {
            if (operators.get(i).equals("*")) {
                int lastNum = numList.remove(numList.size() - 1);
                numList.add(lastNum * arrNum[i + 1]);
            } else if (operators.get(i).equals("/")) {
                int lastNum = numList.remove(numList.size() - 1);
                numList.add(lastNum / arrNum[i + 1]);
            } else {
                numList.add(arrNum[i]);
                opList.add(operators.get(i));
            }
        }
        int result = numList.get(0);
        int index = 1;
        for (String op : opList) {
            if (op.equals("+")) {
                result += numList.get(index);
            } else if (op.equals("-")) {
                result -= numList.get(index);
            }
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numStr = sc.nextLine();
        maths(numStr);
    }
}
