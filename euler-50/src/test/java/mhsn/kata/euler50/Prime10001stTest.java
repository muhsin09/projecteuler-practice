package mhsn.kata.euler50;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Prime10001stTest {

  @Test
  public void sixthPrimeis13(){
    final int result = Prime10001st.calculate(6);
    Assertions.assertEquals(result,13);
  }
}