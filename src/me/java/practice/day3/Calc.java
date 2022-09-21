package me.java.practice.day3;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args){
        int num1, num2, result;
        char c;

        Scanner scan = new Scanner(System.in);

        System.out.println("정수를 두 개 입력하세요");

        num1 = scan.nextInt();
        num2 = scan.nextInt();
        System.out.println("문자를 입력하세요");
        c = scan.next().charAt(0);

        switch (c){
            case '+':
                result = num1 + num2;
                System.out.println("결과는 " + result + " 입니다.");
                break;
            case '-':
                result = num1 - num2;
                System.out.println("결과는 " + result + " 입니다.");
                break;
            case '*':
                result = num1 * num2;
                System.out.println("결과는 " + result + " 입니다.");
                break;
            case '/':
                result = num1 / num2;
                System.out.println("결과는 " + result + " 입니다.");
                break;
            case '%':
                result = num1 % num2;
                System.out.println("결과는 " + result + " 입니다.");
                break;
            default:
                System.out.println("연산자가 유효하지 않습니다.");
        }
    }
}
