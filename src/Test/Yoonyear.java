package Test;

import java.util.Scanner;

public class Yoonyear {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("연도를 입력하세요.");
        int year = scan.nextInt();

        if (year % 400 == 0){
            System.out.println("윤년입니다.");
        }
        else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("윤년입니다.");
        }
        else {
            System.out.println("평년입니다.");
        }
    }
}
