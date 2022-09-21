package me.java.practice.day3;

import java.util.Scanner;

public class ToUpper {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("소문자를 입력해주세요");
        char lower;
        lower = scan.next().charAt(0);

        if (lower < 97 || lower > 122) {
            System.out.println("영문자가 유효하지 않습니다.");
        } else {
            System.out.println((char)(lower - 32));
        }
    }
}
