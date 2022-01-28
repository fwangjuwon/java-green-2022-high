package site.metacoding.ex21;

import java.util.Scanner;

public class DivideByZero2 {
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);

            // InputMismatchException
            // 통신, 사용자 입력은 예외처리!! try/catch
            while (true) {
                try {
                    int x = sc.nextInt(); // 무조건 string으로 받으면 다 받음
                    System.out.println("받은 값: " + x);

                } catch (Exception e) {
                    // 프로그램을 끝내기를 원하면,
                    System.out.println("---------------");
                    System.out.println(e.getMessage());
                    System.out.println("---------------");
                    e.printStackTrace();

                    System.out.println("정수를 다시 적어주세여");
                    sc.nextLine(); // 버퍼 비워!!
                }
            }
        }

    }
}
