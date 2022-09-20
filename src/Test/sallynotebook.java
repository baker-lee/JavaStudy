package Test;

import java.util.Scanner;

public class sallynotebook {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("노트북의 값을 입력하시오: ");
        int notebook = scan.nextInt();
        System.out.println("Sally가 낸 돈을 입력하시오: ");
        int Sally_Money = scan.nextInt();

        int notebook_all = (int) (notebook + (notebook*0.1));

        int Sally_Change = Sally_Money - notebook_all;
        System.out.println("Sally가 받을 잔돈은 " + Sally_Change + "입니다.");




    }



}
