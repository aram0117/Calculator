package LV2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /* Calculator 인스턴스 생성 */
        Calculator calculator = new Calculator();

        /* 반복문 시작 */
        while (true) {
            // 정수와 부호를 입력받는 인자를 매개변수로 넘겨 연산결과 실행
            System.out.println("[계산기] (+,-,*,/)");
            System.out.println("*****************");
            System.out.print("첫 번째 숫자를 입력하세요 : ");
            int a = sc.nextInt();
            System.out.println("-------------------------");
            System.out.print("사칙연산 기호를 입력하세요 : ");
            char sign = sc.next().charAt(0);
            System.out.println("-------------------------");
            System.out.print("두 번째 숫자를 입력하세요 : ");
            int b = sc.nextInt();
            System.out.println("-------------------------");

            // 계산 결과
            System.out.println(calculator.calculate(a, b, sign));
            System.out.println("-------------------------");

            //게산이 끝난 후 종료
            System.out.println("exit를 입력하면 종료됩니다");
            System.out.println("-------------------------");
            String input = sc.next();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("-------------------------");
                System.out.println("계산기를 종료합니다");
                break;
            }
        }
    }
}








