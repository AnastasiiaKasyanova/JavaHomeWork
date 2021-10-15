package com.pb.kasyanova.hw2;
import java.util.Scanner;
public class Interval {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int x;
        System.out.print("Введите целое число: ");
    x = scan.nextInt();
        if (x >=0 && x <=14) {
            System.out.print("число попадает в промежуток от 0 до 14");
        }
        if (x >=15 && x <=35) {
            System.out.print("число попадает в промежуток от 15 до 35");
        }
        if (x >=36 && x <=50) {
            System.out.print("число попадает в промежуток от 36 до 50");
        }
        if (x >=51 && x <=100) {
            System.out.print("число попадает в промежуток от 51 до 100");
        }
        if (x <0 || x >100) {
            System.out.print("число не попадает в промежуток от 0 до 100");
        }
    }
}
