package mhsn.kata.euler50;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DigitSumTest {

  DigitSum digitSum;

  @BeforeEach
  public void init() {
    digitSum = new DigitSum();
  }

  @Test
  public void testDigitSum() {

    Assertions.assertEquals(4, digitSum.calculate(2, 2));
    Assertions.assertEquals(7, digitSum.calculate(2, 4));
    Assertions.assertEquals(7, digitSum.calculate(2, 10));

    //2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
    Assertions.assertEquals(26, digitSum.calculate(2, 15));

    digitSum.calculate(2, 100);
    digitSum.calculate(2, 101);
    digitSum.calculate(2, 102);
    digitSum.calculate(2, 103);
    digitSum.calculate(2, 104);
    digitSum.calculate(2, 361);
  }

}