package org.example;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public double average(int x, int y) {
    return (x + y) / 2.0;
  }

  public int sumRange(int start, int end) {
    int sum = 0;
    for (int i = start; i <= end; i++) {
      sum += i;
    }
    return sum;
  }

  public double averageRange(int start, int end) {
    return sumRange(start, end) / (double) (end - start + 1);
  }

  public int sumOddRange(int start, int end) {
    int sum = 0;
    for (int i = start; i <= end; i++) {
      if (i % 2 != 0) {
        sum += i;
      }
    }
    return sum;
  }

  public int sumEvenRange(int start, int end) {
    int sum = 0;
    for (int i = start; i <= end; i++) {
      if (i % 2 == 0) {
        sum += i;
      }
    }
    return sum;
  }

  public static void main(String[] args) {
    Calculate calc = new Calculate();
    System.out.println("Sum of 2 and 3 is " + calc.sum(2, 3) + ". Average is " + calc.average(2, 3) + ".");
    System.out.println("Sum of 1 to 10 is " + calc.sumRange(1, 10) + ". Average is " + calc.averageRange(1, 10) + ".");
    System.out.println(
        "Sum of odd of 1 to 10 is " + calc.sumOddRange(1, 10) + ". Sum of even is " + calc.sumEvenRange(1, 10) + ".");
  }
}
