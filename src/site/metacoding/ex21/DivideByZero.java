package site.metacoding.ex21;

import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // InputMismatchException

        // 통신, 사용자 입력은 예외처리!! try/catch

        try {
            int x = sc.nextInt(); // 무조건 string으로 받으면 다 받음
            int result = x / 0;
            System.out.println("받은 값: " + x);
        } catch (Exception e) {
            // 프로그램을 끝내기를 원하면,
            System.out.println("---------------");
            System.out.println("문자 넣지마렴");
            System.out.println("---------------");
            e.printStackTrace();
            // } catch (ArithmeticException e) {
            // System.out.println("---------------");
            // System.out.println("0으로 나누지 마 ");
            // System.out.println("---------------");
            // e.printStackTrace();
            // }
        }
    }
}
