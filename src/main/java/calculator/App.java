package calculator;

import java.sql.SQLOutput;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("양의 정수 2개를 입력해주세요");
        System.out.println("첫 번째 숫자를 입력하세요: ");
        int firstInt = sc.nextInt();
        System.out.println("두번째 숫자를 입력해주세요: ");
        int secondInt = sc.nextInt();

        System.out.println("사칙연산 기호를 입력하세요: ");
        char ch = sc.next().charAt(0);
        int answer;
        switch (ch){
            case '+':
                answer = firstInt + secondInt;
                System.out.println(answer);
                break;

            case '-':
                answer = firstInt - secondInt;
                System.out.println(answer);
                break;

            case '*':
                answer = firstInt * secondInt;
                System.out.println(answer);
                break;

            case '/':
                if(secondInt>0) {
                    answer = firstInt / secondInt;
                    System.out.println(answer);
                }else{
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }
                break;

            case '%':
                answer = firstInt % secondInt;
                System.out.println(answer);
                break;
        }


    }
}
