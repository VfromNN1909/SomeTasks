import java.util.Scanner;

public class JustNumber {

    public static int sumOfDigits(int number){
        String s = String.valueOf(number);
        return s.chars().map(c -> Character.digit(c, 10)).sum();
    }
    public static boolean justNumber(short number) {
        for (int i = number + 1;i <= 1000;i++){
            if (i - sumOfDigits(i) == number) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        short X = scanner.nextShort();
        var res = justNumber(X);
        if (res)
            System.out.println("Yes");
        else System.out.println("No");
    }
}
