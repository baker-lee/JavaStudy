package me.java.practice.day2;

public class test5 {
    public static void main (String[] args){
        int num1 = 1234567890;
        int num2 = 1234567890;

        float num3 = num2; //실수형
        num2 = (int) num3;

        System.out.println(num3);
        System.out.println(num2);

        int result = num1 - num2;
        System.out.println(result);
    }

}
