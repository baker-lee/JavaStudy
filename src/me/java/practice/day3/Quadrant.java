package me.java.practice.day3;

import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args){
        double x, y;
        Scanner scan = new Scanner(System.in);
        System.out.println("x랑 y를 입력하세요");
        x = scan.nextDouble();
        y = scan.nextDouble();

        if (x<0 && y>0){
            System.out.println("1 사분면");
        }
        else if(x>0 && y>0){
            System.out.println("2 사분면");
        }
        else if(x<0 && y<0){
            System.out.println("3 사분면");
        }
        else if(x>0 && y<0){
            System.out.println("4 사분면");
        }
        else if(x==0){
            System.out.println("x 축 위에 있음");
        }
        else{
            System.out.println("y 축 위에 있음");
        }
    }
}
