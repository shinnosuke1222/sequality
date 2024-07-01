package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {

  @Test
  public void testSum() {
    Calculate calc = new Calculate();
    assertEquals(5, calc.sum(2, 3));
  }

  @Test
  public void testAverage() {
    Calculate calc = new Calculate();
    assertEquals(3, calc.average(2, 4));
  }

  @Test
  public void testSumRange() {
    Calculate calc = new Calculate();
    assertEquals(55, calc.sumRange(1, 10));
  }

  @Test
  public void testAverageRange() {
    Calculate calc = new Calculate();
    assertEquals(5, calc.averageRange(1, 10));
  }

  @Test
  public void testSumOddRange() {
    Calculate calc = new Calculate();
    assertEquals(25, calc.sumOddRange(1, 10));
  }

  @Test
  public void testSumEvenRange() {
    Calculate calc = new Calculate();
    assertEquals(30, calc.sumEvenRange(1, 10));
  }
}
