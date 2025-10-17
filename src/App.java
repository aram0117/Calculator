import java.util.Scanner;

public class App {

    // 1. 사용자가 입력할 수있는 입력기능
    public void input() {

        // 변수 sc에 스캐너 객체 실체를 부여
        Scanner sc = new Scanner(System.in);

        // 부호를 입력
        System.out.println("[계산기] + = * /\n연산할 부호를 입력하세요");

        // 첫번째 정수를 입력
        System.out.println("첫번째 정수를 입력하세요");


        // 두번째 정수를 입력
        System.out.println("두번째 정수를 입력하세요");
        int b = sc.nextInt();
    }
}
