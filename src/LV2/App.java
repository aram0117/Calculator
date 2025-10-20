package LV2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /* Calculator 인스턴스 생성 */
        Calculator calculator = new Calculator();

        /* 반복문 시작 */
        while (true) {
            // 정수와 부호를 입력받는 인자를 매개변수로 넘김
            System.out.println("[계산기] (+,-,*,/)");
            System.out.println("*****************");
            System.out.print("첫 번째 숫자를 입력하세요. : ");
            int a = sc.nextInt();
            System.out.println("-------------------------");
            System.out.print("사칙연산 기호를 입력하세요. : ");
            char sign = sc.next().charAt(0);
            System.out.println("-------------------------");
            System.out.print("두 번째 숫자를 입력하세요. : ");
            int b = sc.nextInt();
            System.out.println("-------------------------");

            // 인자를 받은 매개변수의 계산 결과
            System.out.println("<결과>");
            System.out.println(calculator.calculate(a, b, sign));
            // 결과 값을 콜렉션에 저장
            calculator.addResult();
            System.out.println("-------------------------");

            // 게터로 컬렉션 조회
            System.out.println("<계산결과 컬렉션>");
            System.out.println(calculator.getResult());

            // 세터로 수정
            calculator.setResult(5);
            System.out.println("<수정>");
            System.out.println(calculator.getResult());

            //
            // 결과 삭제
            calculator.removeResult();
            System.out.println("<삭제>");
            System.out.println(calculator.getResult());

            //게산이 끝난 후 종료
            System.out.println("-------------------------");
            System.out.println("exit를 입력하면 종료됩니다.");
            System.out.println("-------------------------");
            String input = sc.next();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("-------------------------");
                System.out.println("계산기를 종료합니다.");
                break;
            }
        }
    }
}








