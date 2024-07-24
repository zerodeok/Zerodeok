package calculator;

import java.sql.SQLOutput;
import java.util.*;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = 0;
        LinkedList<Integer> inquiry = new LinkedList<>();
        while(true) {
            System.out.println("양의 정수 2개를 입력해주세요");
            System.out.println("첫 번째 숫자를 입력하세요: ");
            int firstInt = sc.nextInt();
            System.out.println("두번째 숫자를 입력해주세요: ");
            int secondInt = sc.nextInt();

            System.out.println("사칙연산 기호를 입력하세요: ");
            char ch = sc.next().charAt(0);
            if(!(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch =='%')){
                System.out.println("사칙연산 기호를 잘못 입력하였습니다.");
                return;
            }
            int result =0;

            switch (ch) {
                case '+':
                    result = firstInt + secondInt;
                    System.out.println(result);
                    inquiry.add(index,result);

                    break;

                case '-':
                    result = firstInt - secondInt;
                    System.out.println(result);
                    inquiry.add(index,result);
                    break;

                case '*':
                    result = firstInt * secondInt;
                    System.out.println(result);
                    inquiry.add(index,result);

                    break;

                case '/':

                    if (secondInt > 0) {
                        result = firstInt / secondInt;
                        System.out.println(result);
                        inquiry.add(index,result);
                    } else {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    }

                    break;

                case '%':
                    result = firstInt % secondInt;
                    System.out.println("결과: "+result);
                    inquiry.add(index,result);
                    break;
            }
            index++;
            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String inquiryStr = sc.next();

            if(inquiryStr.equals("inquiry")){
                for( Integer i : inquiry ){
                    System.out.println(i);
                }
            }


            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String removeStr = sc.next();
            if(removeStr.equals("remove")){
                inquiry.remove(0);
                index--;
            }
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exitStr = sc.next();
            if(exitStr.equals("exit")){
                break;
            }

        }

    }
}
