package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {

  @Test
  public void testSum() {
    Calculate calc = new Calculate();
    assertEquals(5, calc.sum(2, 3));
    assertEquals(-1, calc.sum(2, -3));
    assertEquals(0, calc.sum(0, 0));
  }

  @Test
  public void testAverage() {
    Calculate calc = new Calculate();
    assertEquals(2, calc.average(2, 3));
  }

  @Test
  public void testSumRange() {
    Calculate calc = new Calculate();
    assertEquals(55, calc.sumRange(1, 10));
    assertEquals(0, calc.sumRange(-5, 5));
    assertEquals(1, calc.sumRange(1, 1));
  }

  @Test
  public void testAverageRange() {
    Calculate calc = new Calculate();
    assertEquals(5, calc.averageRange(1, 10));
    assertEquals(0, calc.averageRange(-5, 5));
    assertEquals(1, calc.averageRange(1, 1));
  }

  @Test
  public void testSumOddRange() {
    Calculate calc = new Calculate();
    assertEquals(25, calc.sumOddRange(1, 10));
    assertEquals(-25, calc.sumOddRange(-10, -1));
    assertEquals(0, calc.sumOddRange(2, 2));
  }

  @Test
  public void testSumEvenRange() {
    Calculate calc = new Calculate();
    assertEquals(30, calc.sumEvenRange(1, 10));
    assertEquals(-30, calc.sumEvenRange(-10, -1));
    assertEquals(2, calc.sumEvenRange(2, 2));
  }
}
