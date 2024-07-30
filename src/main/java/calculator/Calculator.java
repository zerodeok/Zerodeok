package calculator;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */
    private List<Double> inquiry = new LinkedList<>();
    double result;

    public List<Double> getResult (){
        return inquiry;
    }

    public List<Double> setResult(Double number,int index){
        inquiry.set(index,number);
        return inquiry;
    }






    public void calculate (double firstNum, double secondNum, char ch) throws BadException {
        /* 위 요구사항에 맞게 구현 */
        /* return 연산 결과 */
        if(ch == '/' && secondNum == 0){
            throw new BadException();
        }
        switch (ch) {
            case '+':
                result = firstNum + secondNum;
                System.out.println(result);
                inquiry.add(result);
                break;
            case '-':
                result = firstNum - secondNum;
                System.out.println(result);
                inquiry.add(result);
                break;
            case '*':
                result = firstNum * secondNum;
                System.out.println(result);
                inquiry.add(result);
                break;

            case '/':
                result = firstNum / secondNum;
                System.out.println(result);
                inquiry.add(result);
                break;

        }
    }
}
