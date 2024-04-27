package 알고리즘문제풀이;
import java.util.Scanner;

public class IntInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.print("몇개의 정수를 입력 받으시겠습니까? : ");
        int count = sc.nextInt();
        int sum = 0;
        System.out.println("정수를 차례로 입력해주세요 : ");
        for(int i = 0 ; i < count ;i++)
        {
//            int num = sc.nextInt();
//            sum +=num;
             sum+=sc.nextInt();
        }
        System.out.println("입력된 값의 총합은 "+sum+"입니다.");

    }
}
