package 알고리즘문제풀이;

import java.util.Scanner;

public class Microwave {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("최소 요리시간을 입력해주세요(초),(1<=T<=10000) : ");
        int num = sc.nextInt();
        int min1,min2,min3;
        int[] std = {300,60,10};
        // 5분,1분,10초 최소 몇 번?
        int cnt = 0;
        int[] cnt_rest = new int[2];
        cnt_rest = Cul(num,cnt,std[0]);
        min1 = cnt_rest[1];
        System.out.print("A버튼 입력횟수 : " + (cnt_rest[1])+ " ");
        cnt_rest = Cul(cnt_rest[0],cnt_rest[1],std[1]);
        min2 = cnt_rest[1];
        System.out.print("B버튼 입력횟수 : " + (cnt_rest[1]-min1)+ " ");
        cnt_rest = Cul(cnt_rest[0],cnt_rest[1],std[2]);
        System.out.println("C버튼 입력횟수 : " + (cnt_rest[1]-min2));
        if(cnt_rest[0] == 0) System.out.println("최소버튼:" + cnt_rest[1]);
        else System.out.print("-1");


    }
    static int[] Cul(int T,int cnt, int std){
        int[] store_num = {T,cnt};
        while(store_num[0] >=std)
        {
            store_num[0] -= std;
            store_num[1] += 1;

        }
        return store_num;
    }
}


