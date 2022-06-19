package mhsn.kata.euler50;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SumSquareDifferenceTest {

  @Test
  public void testFor10(){
    final long result = SumSquareDifference.calculate(10);
    Assertions.assertTrue(result == 2640l);
  }

  @Test
  public void testFor100(){
    final long result = SumSquareDifference.calculate(100);
    System.out.println(result);
  }
}