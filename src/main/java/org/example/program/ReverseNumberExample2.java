package org.example.program;

public class ReverseNumberExample2 {
     public static void main(String[] args) {
//        int a=123456789,reverse=0;
//        for(;a!=0; a=a/10){
//            int remainder=a%10;
//            reverse=reverse*10+remainder;
//        }
//        System.out.println(":"+reverse);
//    }
  int b=123496,reverse=0;
  for(;b!=0;){
      int remainder=b%10;
      reverse=reverse*10+remainder;
      b=b/10;
  }
         System.out.println(":"+reverse);
}
}
