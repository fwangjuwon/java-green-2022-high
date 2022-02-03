package site.metacoding.ex23;

class NewWorker implements Runnable {// 새로운 클래스를 만드는 이유: 메인같은 메서드를 만들기 위해! ㅎㅎ //runnable 이 run이라는 추상메서드를 갖고 있어서
                                     // 오류나는것. 오버라이드 해라! alt enter해서 unemplement method해라.

    // 타겟
    @Override
    public void run() { // 왜 run일까??? 뉴워커의 타겟.
        for (int i = 1; i < 6; i++) {
            try { // try 에 내가 원하는 것들을 다 넣는게 낫다.
                System.out.println("뉴워커 스레드: " + i);
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadEx01 {

    // main thread의 타겟은 main 메서드
    public static void main(String[] args) {

        // NewWorker 생성
        Thread newWorker = new Thread(new NewWorker()); // target정해줘. 나는 내 할 일 할테니까! > 일의 순서가 없음: 비동기 프로그램
        newWorker.start(); // 얘는 타겟이 없음 생성자에 넣어줘야함 run()메소드가 호출됨.

        for (int i = 1; i < 6; i++) {
            try { // try 에 내가 원하는 것들을 다 넣는게 낫다.
                System.out.println("메인스레드: " + i);
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
