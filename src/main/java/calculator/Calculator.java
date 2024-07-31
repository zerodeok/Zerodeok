package calculator;

import java.util.LinkedList;
import java.util.List;


public class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */
    private List<Double> inquiry;
    double result;
    /* static, final 활용 */
    final double pi = 3.141592;  //pi값은 변하지 않는 수 이기 때문에 final로 변수를 선언.
    /* 원의 넓이 결과를 저장하는 컬렉션 타입의 필드 선언 및 생성 */

    /* 생성자 수정 */
    public Calculator(){
        inquiry = new LinkedList<>();
    }

    /* 원의 넓이를 구하는 메서드 선언*/


    public void CircleCalculate(double r){
        result = pi * r * r;
        System.out.println("결과 : " + result);
        inquiry.add(result);
    }





    public List<Double> getResult (){
        return inquiry;
    }

    public List<Double> setResult(Double number,int index){
        inquiry.set(index,number);
        return inquiry;
    }
    public void removeResult() {
        inquiry.remove(0);
    }
    public void inquiryResults() {
        for( int i =0 ; i<inquiry.size();i++){
            System.out.println(i+1+"번째 : "+inquiry.get(i));
        }
    }





    public void calculate (double firstNum, double secondNum, char ch) throws BadException {
        /* 위 요구사항에 맞게 구현 */
        /* return 연산 결과 */

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
                if( secondNum == 0){
                    throw new BadException();
                }
                result = firstNum / secondNum;
                System.out.println(result);
                inquiry.add(result);
                break;

        }
    }
}
