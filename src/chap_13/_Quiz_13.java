package chap_13;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class _Quiz_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 속담 퀴즈 프로그램을 작성하시오.
        // 조건
        // 1) 퀴즈 내용은 saying.txt 라는 이름의 파일로 제공
        // 2) 퀴즈는 문제와 정답이 각각 한 줄로 구성 (퀴즈 3개인 경우 총 6줄)
        // 3) 사용자로부터 값을 입력받아 정답여부 확인
        // 4) 오답인 경우 정답 안내
        // 5) 퀴즈 내용이 더 이상 없을 때까지 반복
        System.out.println("속담 퀴즈입니다. 빈 칸에 알맞은 말을 입력하시오. (주관식)");
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("saying.txt", true))) {

            System.out.println("(문제) 세 살 _ 여든까지 간다");
            bw.write("(문제) 세 살 _ 여든까지 간다");
            bw.newLine();

            System.out.print("정답 입력 => ");
            String lang = sc.next();
            if(sc.next() == "버릇") {
                System.out.println("정답입니다!!");
            } else {
                System.out.println("틀렸습니다. 정답은 버릇입니다.");
            }
            bw.write(lang);
            bw.newLine();



            System.out.println("(문제) 소 잃고 _ 고친다");
            bw.write("(문제) 소 잃고 _ 고친다");
            bw.newLine();

            System.out.print("정답 입력 => ");
            bw.write(sc.next());
            bw.newLine();

            if(sc.next() == "외양간") {
                System.out.println("정답입니다!!");
            } else {
                System.out.println("틀렸습니다. 정답은 외양간입니다.");
            }

            System.out.println("천 리 길도 한 _부터");
            bw.write("천 리 길도 한 _부터");
            bw.newLine();

            System.out.print("정답 입력 => ");
            bw.write(sc.next());
            bw.newLine();

            if(sc.next() == "걸음") {
                System.out.println("정답입니다!!");
            } else {
                System.out.println("틀렸습니다. 정답은 걸음입니다.");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
