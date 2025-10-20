package LV2;

import java.util.ArrayList;

public class Calculator {

    // 결과 저장
    private ArrayList<Integer> resultcolection = new ArrayList<>();
    public void addResults() {
        resultcolection.add(result);
    }
    // 게터로 캡슐화 된 컬렉션 필드를 가져오기
    // 외부에서 조회할수 있도록 public 접근제어자 사용
    public ArrayList<Integer> getResultcolection() {
       return resultcolection;
    }
    // 세터로 컬렉션 필드 수정
    public void setResult(int setresult){
        resultcolection.set(0, setresult);
    }

    // 연산 결과를 반환받는 변수
    int result;

    // 게산기능
    public int calculate(int a, int b, char sign) {
        // 더하기가 입력되면 실행argument lists d
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
        // return으로 연산 결과 반환
        return result;
    }

    // 결과 삭제
    public void removeResult() {
        // 가장 먼저 저장된 결과 삭제
        resultcolection.remove(0);
    }
}
