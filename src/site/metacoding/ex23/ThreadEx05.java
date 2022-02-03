package site.metacoding.ex23;

//스레드가 context switching될 때는 내부적으로 0.0000000001초라도 졸고 넘어간다. (sleep thread)
//그래야 제어권이 넘어간다.
// 하나의 프로세스 안에 여러개의 스레드가 동작한다. 

// 스레드 일시정지 하는 방법

class Monster implements Runnable { // 1. 먼저 러너블로 임플리먼트 걸어줘야한다. alt,enter해서 오버라이드
    int x = 10;
    int speed = 1; // 1초마다 움직이는것.
    boolean isActive = true;

    @Override
    public void run() { // 타겟은 몬스터의 실!! 1초마다 x좌표가 1씩 증가하면되
        while (isActive) { // 4. 계속 돌아야하니 와일로 감싸!!
            try { // 2. trycatch
                x = x + speed; // 3.
                Thread.sleep(1000); // 3.
                System.out.println("몬스터의 x좌표: " + x); // 3.
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }
}

class Host implements Runnable {
    int x = 0;
    int speed = 2; // 1초마다 움직이는 것.
    boolean isActive = true;

    @Override
    public void run() {
        while (isActive) {// 4. 와일로 감싸
            try {
                x = x + speed; // 3.
                Thread.sleep(1000); // 3.
                System.out.println("호스트의 x좌표: " + x); // 3.
            } catch (Exception e) {
            }
        }
    }
}

// 실습: 호스트의 스피드를 2로 만들고, monster는 잠자지 않는다. 부딪히면 끝나는 sysout해서 만들기.
// 몬스터와 호스트는 1초마다 각자의 speed만큼 움직이는 run을 갖는다. 런 메소드 내부에 와일 돌린다.

public class ThreadEx05 {
    public static void main(String[] args) {
        Monster monster = new Monster(); // 7. 이렇게 바꿔야된다. monster.x로 접근하려고.
        Thread monsterThread = new Thread(monster); // 5. 몬스터와 호스트의 스레드 객체 생성
        monsterThread.start(); // 6. 스레드 스타트 시켜보기

        Host host = new Host();
        Thread hostThread = new Thread(host);
        hostThread.start();

        while (true) {
            if (host.x >= monster.x) {
                System.out.println("게임종료");

                // 8. 몬스터 종료
                monster.isActive = false;

                // 9. 호스트 종료
                host.isActive = false;

                // 10. 메인 종료
                break;
            } else {
                try {
                    Thread.sleep(1);
                } catch (Exception e) {
                    e.getStackTrace();
                }
            }
        }
    }
}