package me.java.practice.day2;

import java.util.Scanner;

public class PosiNega {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("정수를 입력하세요. ");
        int number = scan.nextInt();

        if (number > 0){
            System.out.println("양수");
        }
        else if (number < 0){
            System.out.println("음수");
        }
        else {
            System.out.println("0");
        }
    }
}
