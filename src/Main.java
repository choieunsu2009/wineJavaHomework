public class Main {
    public static void main(String[] args) {
        variable(); //2강 - 변수
    }
    public static void variable(){ //2강 변수 정리
        //1번 코드
        int var = 10;
        String str = "문자열을 사용하기 위해 저장";
        str = "문자열을 다시 사용하기 위해 저장";

        //변수명으로 예약어 못씀 $, _ 제외한 나머지 특수기호 사용 못함

        long number = 21000000000000L;
        short number2 = 3200;
        byte number3 = -128;
        boolean valid = true;
        float flt = 31.05f; // float값은 끝에 f 붙이세요


        System.out.println("내가 저장한 값은?"+str);

        //2번 코드
        int money = 500;
        System.out.println("숫자"+money);
        money = 1100;
        System.out.println("숫자"+money);

        //3번 코드
        String str1 = "12345";
        int num = 0;

        num = Integer.parseInt(str1);
        System.out.println("저장된 값"+num);

        int num2 = 12345;
        String str2 = "";

        str2 = String.valueOf(num2);
        System.out.println(str2);
    }
}