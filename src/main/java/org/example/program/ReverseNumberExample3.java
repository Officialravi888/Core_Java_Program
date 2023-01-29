package org.example.program;

import java.util.Scanner;

public class ReverseNumberExample3 {
        public static void reverseNumber ( int a){
            if (a < 10) {
                System.out.println(a);
                return;

            } else {
                System.out.println(a % 10);
                reverseNumber(a / 10);
            }
        }
        public static void main(String[]args){
            System.out.println("Enter the no:");
            Scanner scanner=new Scanner(System.in);
            int num= scanner.nextInt();
            System.out.println(":");
            reverseNumber(num);
    }
}