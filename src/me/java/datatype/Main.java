package me.java.datatype;

public class Main {
    public static void main(String[] args) {
        // 리터럴 (literal): 데이터 수

        // 원시형 (primitive type) : 스택 공간
        // int(4), float(4), double(8), char(2)
        // 1byte = 8bit

        // 참조형 (reference type) : 힙공간
        // String

        byte b = (byte) 10000;
        short s = (short) 10000; // type casting (명시적 형변환)
        int i = 10;     // 정수의 기본 단위
        long l = 10;    // promotion (자동 형변환)
        float f = 3.14f;
        double d = 3.14;// 실수의 기본 단위

        byte var1 = 125;
        int var2 = 125;
        for (i = 0; i < 5; i++) {
            var1++; // var1 = var1 + 1
            var2++; // var2 = var2 + 1
            System.out.println("var1: " + var1 + "\t" + "var2: " + var2);


        }

        char ai = 'A';
        int add = ai + 1; // 'A'의 유니코드보다 1이 큰 유니코드 저장
        char aj = (char) add; // 'B'
        System.out.println(ai);
        System.out.println(aj);

        //- 오버플로우
        //    - 변수가 사용할 수 있는 데이터 범위보다 너무 큰 수를 사용할 경우
        //    - `byte b = (byte)128` -128로 출력
        //- 언더플로우
        //    - 변수가 사용할 수 있는 데이터 범위보다 너무 작은 수를 사용할 경우
        //    - `byte b = (byte)-129` 127로 출력
    }
}
