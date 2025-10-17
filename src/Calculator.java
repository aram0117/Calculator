import java.util.Scanner;

public class Calculator {
    // 사용자로부터 입력받은 두 정수 사칙연산 실행
    public void calculate {
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
            int div = a / b;
            System.out.println("정답 = " + div);
        }
    }

    public void restart() {
        Scanner scanner = new Scanner(System.in);

        //게산이 끝난 후 재실행 여부입력
        System.out.println("restart : [restart를 입력하면 계산기가 재실행됩니다], exit : [restart외에 모든 문자 입력시 종료됩니다]+");
        String input = scanner.next();

        // 계산기 재실행
        if (input.equalsIgnoreCase("restart")) {
            App();
            restart();
        }
    }
}







