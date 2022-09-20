package Test;

import java.util.Scanner;

public class MaxandMin {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("첫번째 수를 입력하시오. ");
        int first_number = scan.nextInt();
        System.out.println("두번째 수를 입력하시오. ");
        int second_number = scan.nextInt();

        if (first_number > second_number){
            System.out.println("최솟값은 :" + second_number + " 최댓값은 : " + first_number + " 입니다.");

        }
        else if (first_number < second_number){
            System.out.println("최솟값은 :" + first_number + " 최댓값은 : " + second_number + " 입니다.");

        }
        else {
            System.out.println("두 수가 같습니다.");
        }

    }
}
