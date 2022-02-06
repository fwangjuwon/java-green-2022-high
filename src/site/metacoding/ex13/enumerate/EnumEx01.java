package site.metacoding.ex13.enumerate;

interface Direction {
    String LEFT = "Left"; // 인터페이스에 변수를 적으면 public, static, final이 생략돼잇따.
    String RIGHT = "Right";
}

public class EnumEx01 {

    public static void add(String direction) {

        // "left" ,"right" 만 들어올 수 있따.
        if (direction.equals("Left") || direction.equals("Right")) {
            System.out.println("잘 들어왔따");
        } else {
            System.out.println("잘못입력했어");
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        add(Direction.LEFT);
    }
}
