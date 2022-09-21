package me.java.practice.day3;

import java.util.Scanner;

public class PassorFail {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("국어, 수학, 영어 성적을 차례대로 입력하시오.");
        double Kor, Math, Eng, Sum, Result;

        Kor = scan.nextDouble();
        if (Kor < 0 || Kor > 100){
            System.out.println("성적이 유효하지 않습니다.");
            return;
        }
        Math = scan.nextDouble();
        if (Math < 0 || Math > 100){
            System.out.println("성적이 유효하지 않습니다.");
            return;
        }
        Eng = scan.nextDouble();
        if (Eng < 0 || Eng > 100){
            System.out.println("성적이 유효하지 않습니다.");
            return;
        }

        Sum = Kor + Math + Eng;
        Result = Sum / 3;
        System.out.println(Result);
        if (Result >=70) {
            System.out.println("합격");
        } else {
            System.out.println("불합격");
        }

    }
}
