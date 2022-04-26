public class Literal {

    public static void main(String[] args) {


        // 리터럴이란 프로그램에 직접 표현한 값
        // 정수, 실수, 문자, 논리, 문자열 타입 모두 리터럴이 있다.
        // ex) 1, 1.1, '!', true, "1"

        long a = 1L; // long 타입 지정 시 L 또는 l 붙임

        double b = 0.1234;
        double c = 1234E-4; // 1234 x 10^-4 = 0.1234
        float d = 0.1234f; // 강제 변환
        double e = .1234D; // 강제 변환

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
