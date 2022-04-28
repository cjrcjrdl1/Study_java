import java.sql.SQLOutput;
import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("총 초를 입력하시오: ");
        int time = scanner.nextInt(); // 정수 입력
        int second = time % 60; // 초
        int minute = (time / 60) % 60; // 분
        int hour = (time / 60) / 60; // 시간

        System.out.println("총 초 = " + time);
        System.out.println("시간 = " + hour);
        System.out.println("분 = " + minute);
        System.out.println("초 = " + second);
        scanner.close();
    }
}
