package 알고리즘문제풀이;
import java.util.*;
public class Break_Even_Point {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        List<Double> list =  new ArrayList<>();
//        for(int i = 0 ; i < 3 ; i++)
//        {
//            list.add(sc.nextDouble());
//        }
////         숫자 3개 입력받아 리스트에 저장
//        if(list.get(1) >= list.get(2)) System.out.print("-1");
//        else
//        {
//            double count = 0;
//            while(true)
//            {
//
//                if((list.get(0) + (list.get(1)*count)) >= (list.get(2)*count))
//                {
//                    count+=1;
//                }
//                else {
//                    System.out.print((int)count);
//                    break;
//                }
//            }
//        }
//        list.clear();
//
//    }
//}
//    이렇게 간단하게 풀어버리네

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fixCost = sc.nextInt(); // 고정 비용
        int varCost = sc.nextInt(); // 가변(생산) 비용
        int sellPrice = sc.nextInt(); // 판매 금액
        if (varCost >= sellPrice) { // 가변 비용이 판매금액과 같거가 크면 절대 이익이 발생 할 수 없음
            System.out.println("-1");
            return; // return 하면 실행이 종료되네 와...나
        }
        System.out.println((fixCost / (sellPrice - varCost)) + 1); // else인 경우 와 이거 계산 장난아니네
    }

    // 수학적 수식을 먼저 정리하고 코딩을 하는 습관을 갖자!
}