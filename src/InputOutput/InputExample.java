package InputOutput;

import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String name;
        int age;
        double height;

        System.out.println("이름을 입력하세요: ");
        name = scan.next();
        System.out.println("나이를 입력하세요: ");
        age = scan.nextInt();
        System.out.println("키를 입력하세요: ");
        height = scan.nextDouble();

        System.out.println("이름은 " + name + " 나이는 " + age + " 키는 " + height + "입니다.");
    }

}
