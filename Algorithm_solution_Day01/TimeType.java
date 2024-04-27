package 알고리즘문제풀이;
import java.util.Date;
import java.text.*;
import java.util.Scanner;

public class TimeType {
    public static void main(String[] args) {
//        System.out.print("시간을 00:00:00형식으로 입력하세요 : ");
//        Scanner sc = new Scanner(System.in);
//        String time = sc.next();
//        String[] time_split = time.split(":");
//        String[] temp = new String[2];
//        int[] time_int = new int[time_split.length];
//        for (int i = 0; i < time_split.length; i++) {
//            time_int[i] = Integer.parseInt(time_split[i]);
//        }
//        if (time_int[1] < 10) temp[0] = '0'+Integer.toString(time_int[1]);
//        else temp[0] = Integer.toString(time_int[1]);
//        if (time_int[2] < 10) temp[1] = '0'+Integer.toString(time_int[2]);
//        else temp[1] = Integer.toString(time_int[2]);
//        if (time_int[0] < 12) {
//            System.out.print("오전" + time_int[0] + "시" + temp[0] +"분"+temp[1]+"초");
//        } else if(time_int[0] < 24){
//            System.out.print("오후 " + (time_int[0] - 12) + "시" + temp[0] + "분" + temp[1]+"초");
//        }
//        else if(time_int[0] ==24){
//            System.out.print("오전 " +"00"+ "시" + temp[0] +"분"+temp[1]+"초");
//        }


        //피드백 : 무조건 배열을 만들면 코드만 길어진다.(가변적일때만 만들자)
        Scanner sc =  new Scanner(System.in);
        System.out.print("시간 입력 : ");
        String times = sc.next();
        String[] splitTime = times.split(":");
        int inHour = Integer.parseInt(splitTime[0]);
        int inMin = Integer.parseInt(splitTime[1]);
        int inSec = Integer.parseInt(splitTime[2]);

        if(inHour > 11){
            inHour -=12;
            System.out.printf("오후 %02d시 %02d분 %02d초",inHour,inMin,inSec);
        }
        else System.out.printf("오전 %02d시 %02d분 %02d초",inHour,inMin,inSec);


    }
    //분, 초도 예쁘게 나오게 할 수 있을까?
}



