import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        System.out.println("이름, 거주지, 나이, 몸무게, 사람 유무 순으로 입력하시오.");
        java.util.Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        System.out.println("이름 : " + name + ", ");

        String city = scanner.next();
        System.out.println("거주지 : " + city + ", ");

        int age = scanner.nextInt();
        System.out.println("나이 : " + age + ", ");

        double weight = scanner.nextDouble();
        System.out.println("몸무게 : " + weight + ", ");

        boolean isHuman = scanner.nextBoolean();
        System.out.println("사람 유무 : " + isHuman);
        scanner.close();
    }
}
