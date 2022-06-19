package mhsn.kata.euler50;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SummationOfPrimesTest {

  @Test
  public void calculate(){
    SummationOfPrimes summationOfPrimes = new SummationOfPrimes();
    Assertions.assertEquals(summationOfPrimes.calculate(10),17l);
    System.out.println(summationOfPrimes.calculate(2_000_000));
  }
}