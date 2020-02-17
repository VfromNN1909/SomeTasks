import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class Solution {

    public static int[] numbersFromString(String str){
        Pattern p = Pattern.compile("-?\\d+");
        Matcher m = p.matcher(str);
        int[] arr = new int[2];
        int i = 0;
        while (m.find()) {
            arr[i] = Integer.parseInt(m.group());
            i++;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextShort();
        int M = scanner.nextInt();
        String[] strings = new String[N + 1];
        boolean flag = false;

        for (int i = 0;i < N;i++){
            strings[i] = scanner.nextLine();
        }
        System.out.println();
        for (int i = 0;i < N;i++) {
            var numbers = numbersFromString(strings[i]);
            if(M >= numbers[0] && M <= numbers[0] + numbers[1]){
                flag = true;
                System.out.println(strings[i].substring(strings[i].lastIndexOf(" ") + 1));
            }
        }
        if (!flag){
            System.out.println("NO SOLUTION");
        }
    }
}

