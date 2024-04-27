package 알고리즘문제풀이;

import java.util.Scanner;

public class Decimal_alpa {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] split_str = str.split("");
        int[] result_asc = new int[split_str.length];
        int sum = 0;
        for (int i = 0;i<split_str.length;i++)
        {
            int num = split_str[i].charAt(0);
            if(num >96) result_asc[i] = num-96;
            else if(num<91) result_asc[i] = num-38;
            else
            {
                System.out.println("영어를 입력해주세요.");
                return;
            }
            sum += result_asc[i];
        }
        if(func(sum)) System.out.println("It is a prime word.");
        else System.out.println("It is not a prime word.");

    }
    static boolean func(int n)
    {
        for (int i = 2; i < n/2 ;i++)
        {
            if(n%i == 0) return false;
        }
        return true;
    }
}



