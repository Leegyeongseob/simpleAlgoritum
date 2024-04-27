package 알고리즘문제풀이;
import java.util.Scanner;

public class Phone_rate_plan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int Y_sum = 0;
        int M_sum = 0;
        for (int i = 0;i<count;i++)
        {
            int cost = sc.nextInt();
            Y_sum += ((int)(cost/30+1)) * 10;
            M_sum += ((int)(cost/60)+1) * 15;

        }
        if (Y_sum < M_sum){
            System.out.print("Y "+ Y_sum);

        }
        else{
            System.out.print("M "+ M_sum);
        }

    }
}
