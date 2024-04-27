package 알고리즘문제풀이;
import java.util.Scanner;

public class Decimal {
    public static void main(String[] args) {
        int n;
        System.out.print("정수를 입력 하세요 : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("소수 : " + func(n));
    }

    static boolean func(int n) {
        for (int i = 2; i < n; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}
