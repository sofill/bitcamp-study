// 과제 1 : 계산기 애플리케이션을 작성하라.
// - 실행
// 값1? 10
// 값2? 20
// 연산자(+,-,*,/)? +
// => 10 + 20 = 30 
//
package com.eomcs.basic.ex04.assignment.Teacher.assignment1;

import java.util.Scanner;

public class Test01_05 {
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);

    System.out.print("값1? ");
    int a = keyScan.nextInt();

    System.out.print("값2? ");
    int b = keyScan.nextInt();

    System.out.print("연산자(+,-,*,/)? ");
    String op = keyScan.next();

    keyScan.close();

    if (op.equals("+")) {
      System.out.println("+");
    } else 
      if (op.equals("-")) {
        System.out.println("-");
      } else 
        if (op.equals("*")) {
          System.out.println("*");
        } else 
          if (op.equals("/")) {
            System.out.println("/");
          } else {
            System.out.println("사용할 수 없는 연산자입니다.");
          }
        
      
    

    System.out.printf("=> %d %s %d = 30\n", a, op, b);
  }
}
