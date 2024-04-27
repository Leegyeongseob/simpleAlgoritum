package 알고리즘문제풀이;

import java.util.Scanner;

public class KMP_Algorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] split_str = str.split("-");
        char[] chars = new char[split_str.length];
        for (String e: split_str)
        {
            System.out.print(e.charAt(0));
        }

    }
}
