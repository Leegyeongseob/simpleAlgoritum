package 저항;

import java.util.Scanner;

public class ResistanceEx {
    public static void main(String[] args) {
        // 컬러값에 대한 문자열 배열 선언
        String[] color = {"black", "brown", "red", "orange", "yellow", "green",
                "blue", "violet", "grey", "white"};
        int firstIdx = 0, secondIdx = 0, thirdIdx = 0;
        Scanner sc = new Scanner(System.in);
        String firstColor = sc.nextLine();
        String secondColor = sc.nextLine();
        String thirdColor = sc.nextLine();
        for(int i = 0; i < 10; i++) {
            if(firstColor.equals(color[i])) firstIdx = i;
            if(secondColor.equals(color[i])) secondIdx = i;
            if(thirdColor.equals(color[i])) thirdIdx = i;
        }
        System.out.println((long)((firstIdx * 10) + secondIdx) * (long)(Math.pow(10, thirdIdx )));

    }
}
