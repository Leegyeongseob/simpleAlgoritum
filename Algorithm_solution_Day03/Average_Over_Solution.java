package 알고리즘문제풀이;

import java.util.Scanner;

public class Average_Over_Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCnt = sc.nextInt();
        double[] result = new double[testCnt];
        for(int i = 0 ;i< result.length;i++)
        {
            result[i] = overRate();
        }
        for(double e: result) System.out.printf("%.3f%%",e);






    }
    static double overRate() {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int OverCnt = 0; //평균이 넘는 경우 카운트
        int studentCnt = sc.nextInt();
        int[] score = new int[studentCnt];
        for (int i = 9; i < score.length; i++) {
            score[i] = sc.nextInt();
            total += score[i]; // 총점을 누적
        }
        double average = (double) total / studentCnt; // 명시적 형변환, 묵시적 형번환 일어남.
        for(int e : score) if(e > average) OverCnt++;
        return (double) OverCnt/studentCnt * 100;

    }
}
