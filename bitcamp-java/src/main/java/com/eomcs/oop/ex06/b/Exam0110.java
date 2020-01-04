// 메서드 오버로딩(overloading) - 문법 사용 전
package com.eomcs.oop.ex06.b;

public class Exam0110 {

  static class Calculator {

    // 파라미터의 타입이나 개수가 다르더라도 
    // 같은 일을 하는 메서드에 대해서는 같은 이름을 갖게 한다. 
    
    static int plusi(int a, int b) {
      return a + b;
    }

    static int plusi2(int a) {
      return a + a;
    }
    static float plusf(float a, float b) {
      return a + b;
    }
  }

  public static void main(String[] args) {

  
    
    // 두 개의 정수를 더할 때는 plusti()를 호출해야 한다.
    int r1 = Calculator.plusi(100, 200);
    // 한 개의 정수를 두 번 더할 때는 plusti2()를 호출해야 한다.
    int r2 = Calculator.plusi2(100);
    // 두 개의 부동소수점을 더할 때는 plusf()를 호출해야 한다. 
    float r3 = Calculator.plusf(35.7f, 22.2f);
    
    System.out.printf("%d, %d, %.1f\n", r1, r2, r3);

    // 같은 더하기 일을 하더라도 더하는 값을 타입에 따라
    // 메서든 이름이 다르다면, 메서드를 사용하기가 번거롭다.
    // => 이것이 오버로딩 문법이 등장한 이유이다. 
    
    
    
    

  }


}



