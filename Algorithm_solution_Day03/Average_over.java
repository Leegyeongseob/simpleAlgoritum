package 알고리즘문제풀이;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Average_over {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int student = sc.nextInt(); // 학생 수 입력
        Double[] student_case = new Double[student];
        List<Double> average_list = new ArrayList<>();
        List<Double> score = new ArrayList<>();
        for(int i = 0;i < student;i ++)
        {
            int sum = 0 ;
            student_case[i] = sc.nextDouble(); // 시험 갯수 입력
            for(int j =0;j<student_case[i];j++)
            {
                score.add(sc.nextDouble());
                sum += score.get(j); // 시험 총합
            }
            double average = sum/student_case[i];
            int cnt = 0;
            for(int k = 0 ;k <student_case[i];k++)
            {
                if(score.get(k) > average ) cnt+=1;
            }
            average_list.add((cnt/student_case[i]));
            score.clear();
        }
        for(int i = 0;i<average_list.size();i++)
        {
            System.out.println(String.format("%.3f",average_list.get(i)*100) + "%");
        }

    }

}
