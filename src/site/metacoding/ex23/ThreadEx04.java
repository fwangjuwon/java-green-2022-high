package site.metacoding.ex23;

public class ThreadEx04 {
    public static void main(String[] args) {
        Thread t2 = new Thread(() -> { // 이 자리에 원래 타겟 넣어야함 러너블타입 ()-> 넣으면, 문법으로 runnable을 제공해준다. 가독성이 좋아진 코드!!
            // 화살표함수: 메소드만 넘기개 해주는 문법 !! 소괄호 내부는 매개변수 자리 !!

            for (int i = 1; i < 6; i++) {
                try {
                    System.out.println("새로운 쓰레드: " + i);
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.getStackTrace();
                }
            }
        }); // 중괄호 사이를 런 메소드로 자동인식한다. 중괄호 내부: 런!!!

        t2.start();
        System.out.println("이건 메인쓰레드");
    }
}
