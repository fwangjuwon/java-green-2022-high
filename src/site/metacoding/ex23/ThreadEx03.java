package site.metacoding.ex23;

// 익명 클래스를 만들어보자. 
//추상 클래스와 인터페이스를 new할 수 없는 이유는?
// 개념적으로는 추상적이기 때문이다. 
//문법적으로는 추상 메소드를 갖고 있기 때문에. 

public class ThreadEx03 {
    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() { // 이렇게 익명으로 쓰는 이유? 클래스를 하나 만들지 않고?? : 사실 코드의 가독성은 좋지 않다.
            // 람다라는 문법을 이해할 수 있기 때문에....

            @Override
            public void run() {
                for (int i = 1; i < 6; i++) {
                    try {
                        System.out.println("새로운 쓰레드: " + i);
                        Thread.sleep(1000);

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t1.start();
        System.out.println("메인쓰레드 종료"); // 이게 메인 쓰레드
    }
}
