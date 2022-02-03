package site.metacoding.ex23;

public class StringCollectionEx01 {
    public static void main(String[] args) {

        String s = "안녕";
        s = s + "하이";
        s = s + "하이";
        s = s + "하이";
        s = s + "하이";
        s = s + "하이";
        s = s + "하이";
        s = s + "하이";

        // 긴문자열을 저장할 때 쉽게 하는 법 StringBuffer 만 써!
        // string buffer는 동시 접근 불가능. 동기화적용되어있따. synchronized스레드.
        // 문자열을 차곡차곡 저장할 때는 stringbuffer를 쓰는게 좋다 > 가독성이 좋고, 메모리 공간을 효율적으로 쓸 수 있다. > 동기화
        // 시켜서 데이터가 섞이지 않게 하기 위해 ㅎㅎ

        StringBuffer sb = new StringBuffer();
        sb.append("http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst?");
        sb.append(
                "serviceKey=wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3%3D&");
        sb.append("numOfRows=10&");
        sb.append("pageNo=1&");
        sb.append("dataType=JSON&");
        sb.append("base_date=20220126&");
        sb.append("base_time=1700&");
        sb.append("nx=97&");
        sb.append("ny=75");

        System.out.println(sb.toString());
    }
}
