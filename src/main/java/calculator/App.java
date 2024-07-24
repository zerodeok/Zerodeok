package calculator;

import java.sql.SQLOutput;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inquiry = new int[10];
        int index = 0;
        while(true) {
            System.out.println("양의 정수 2개를 입력해주세요");
            System.out.println("첫 번째 숫자를 입력하세요: ");
            int firstInt = sc.nextInt();
            System.out.println("두번째 숫자를 입력해주세요: ");
            int secondInt = sc.nextInt();

            System.out.println("사칙연산 기호를 입력하세요: ");
            char ch = sc.next().charAt(0);
            int result =0;
            switch (ch) {
                case '+':
                    result = firstInt + secondInt;
                    System.out.println(result);
                    inquiry[index] = result;
                    index++;
                    if(index == 9){
                        for(int i = 0;i<10;i++){
                            inquiry[i] = inquiry[i+1];
                        }
                    }
                    break;

                case '-':
                    result = firstInt - secondInt;
                    System.out.println(result);
                    inquiry[index] = result;
                    index++;
                    if(index == 9){
                        for(int i = 0;i<10;i++){
                            inquiry[i] = inquiry[i+1];
                        }
                    }
                    break;

                case '*':
                    result = firstInt * secondInt;
                    System.out.println(result);
                    inquiry[index] = result;
                    index++;
                    if(index == 9){
                        for(int i = 0;i<10;i++){
                            inquiry[i] = inquiry[i+1];
                        }
                    }
                    break;

                case '/':
                    if (secondInt > 0) {
                        result = firstInt / secondInt;
                        System.out.println(result);
                        inquiry[index] = result;
                        index++;
                    } else {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    }
                    if(index == 9){
                        for(int i = 0;i<10;i++){
                            inquiry[i] = inquiry[i+1];
                        }
                    }
                    break;

                case '%':
                    result = firstInt % secondInt;
                    System.out.println("결과: "+result);
                    inquiry[index] = result;
                    index++;
                    if(index == 9){
                        for(int i = 0;i<10;i++){
                            inquiry[i] = inquiry[i+1];
                        }
                    }
                    break;
            }
            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String inquiryStr = sc.next();
            if(inquiryStr.equals("inquiry")){
                for( int i : inquiry ){
                    System.out.println(i);
                }
            }
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exitStr = sc.next();
            if(exitStr.equals("exit")){
                break;
            }

        }

    }
}
