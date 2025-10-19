package LV2;

public class Calculator {

    /*연산 결과를 저장하는 컬렉션 타입 필드를 외부에서 직접 접근 하지 못하도록 수정*/


    // 연산 결과를 반환받는 변수
    Integer result;

    public Integer calculate(Integer a, Integer b, char sign) {
        // 1. 연산 기능
        // 지금 부호는 자료형이 char이므로 연산 할때는 정수형으로 바꿔서 정상작동
        // return으로 연산 결과 반환
        // 더하기가 입력되면 실행
        if (sign == '+') {
            result = a + b;
        }
        // 빼기가 입력되면 실행
        else if (sign == '-') {
            result = a - b;
        }
        //곱하기가 입력되면 실행
        else if (sign == '*') {
            result = a * b;
        }
        //나누기가 입력되면 실행
        //0으로 나눈 연산 예외처리
        else if (sign == '/') {
            try {
                result = a / b;
            } catch (Exception e) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.\n<이전 계산 결과>\n-------------------------");
            }
        }
        return result;
    }

    public void removeResult() {
        /* 구현 */

    }
}
