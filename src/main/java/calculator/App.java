package calculator;


import java.util.*;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = 0;
        Calculator calculator = new Calculator();


        while(true) {
            System.out.println("양의 정수 2개를 입력해주세요");
            System.out.println("첫 번째 숫자를 입력하세요: ");
            int firstNum = sc.nextInt();
            System.out.println("두번째 숫자를 입력해주세요: ");
            int secondNum = sc.nextInt();
            System.out.println("사칙연산 기호를 입력하세요: ");

            char ch = sc.next().charAt(0);
            if(!(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch =='%')){
                System.out.println("사칙연산 기호를 잘못 입력하였습니다.");
                return;
            }

            try {
               calculator.calculate(firstNum,secondNum,ch);
            }catch (BadException e){
                System.out.println(e.getMessage());
            }

            index++;
            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String inquiryStr = sc.next();

            if(inquiryStr.equals("inquiry")){
                calculator.inquiryResults();
            }

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String removeStr = sc.next();
            if(removeStr.equals("remove")){
                calculator.removeResult();
            }
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exitStr = sc.next();
            if(exitStr.equals("exit")){
                break;
            }

        }

    }
}
