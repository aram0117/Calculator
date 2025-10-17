public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // 정수 입력란에 다른 자료형 입력시 계산기종료
        try {
            calc.App();
            calc.restart();
        } catch (Exception e) {
            System.out.println("잘못된 접근입니다 계산기를 종료합니다");
        }
    }
}


