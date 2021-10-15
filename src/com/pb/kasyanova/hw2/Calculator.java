package com.pb.kasyanova.hw2;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1;
        int operand2;
        String sign;
        System.out.print("Введите цифру: ");
        operand1 = scan.nextInt();
        System.out.print("Введите вторую цифру: ");
        operand2 = scan.nextInt();
        System.out.print("Введите знак арифметической операции -,+,*,/: ");
        sign = scan.next();
        switch (sign) {
            case "+":
                System.out.println("Ваш ответ " +(operand1 + operand2) );
                break;
            case "-":
                System.out.println("Ваш ответ " +(operand1 - operand2) );
                break;
            case "*":
                System.out.println("Ваш ответ " +(operand1 * operand2) );
                break;
            case "/":
                if (operand2 == 0){
                    System.out.println("братан, на 0 делить нельзя");
                }
                else
                System.out.println("Ваш ответ " +(operand1 / operand2) );
                break;
            default:
                System.out.println("что-то не вышло");
        }
    }
}
