package LV1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1.입력 기능
        Scanner sc = new Scanner(System.in);
        while (true) {
            // 부호를 입력
            System.out.println("[계산기] + = * /\n연산할 부호를 입력하세요");
            char sign = sc.next().charAt(0);
            // 첫번째 정수를 입력
            System.out.println("첫번째 정수를 입력하세요");
            int a = sc.nextInt();

            // 두번째 정수를 입력
            System.out.println("두번째 정수를 입력하세요");
            int b = sc.nextInt();

            // 2.연산 기능
            // 부호로 연산 할때 정수형으로 바꿔서 정상작동

            // 더하기가 입력되면 실행
            if (sign == '+') {
                int sum = (int) a + b;
                System.out.println("정답 = " + sum);
            }
            // 빼기가 입력되면 실행
            else if (sign == '-') {
                int sub = (int) a - b;
                System.out.println("정답 = " + sub);
            }
            //곱하기가 입력되면 실행
            else if (sign == '*') {
                int mul = (int) a * b;
                System.out.println("정답 = " + mul);
            }
            //나누기가 입력되면 실행


            else if (sign == '/') {
                try {
                    int div = (int) a / b;
                    System.out.println("정답 = " + div);
                } catch (Exception e) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }
            }
            // 3.종료 기능

            //게산이 끝난 후 종료

            System.out.println("exit를 입력하면 종료됩니다");
            String input = sc.next();
            // 계산기 재실행
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
        }
    }
}








