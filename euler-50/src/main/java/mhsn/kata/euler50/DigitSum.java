package mhsn.kata.euler50;

/**
 * Power digit sum
 *
 * Problem 16
 *
 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 *
 * What is the sum of the digits of the number 2^1000?
 */
public class DigitSum {

  public int calculate(int base, int power) {

    if (base > 9) {
      throw new IllegalStateException("base must be a digit");
    }

    String result = "1";

    for (int i = 0; i < power; i++) {
      result = multiplyWithString(result, base);
    }

    System.out.println(base + "^" + power + " = " + result);
    return sumStringNumberDigits(result);
  }

  private int sumStringNumberDigits(String result) {
    int sumResult = 0;
    for (int index = 0; index < result.length(); index++) {
      sumResult += Integer.parseInt(result.substring(index, index + 1));
    }
    return sumResult;
  }

  private String multiplyWithString(String result, int base) {

    int remainder = 0;
    String multiplyResult = "";
    int tempResult = 0;
    for (int i = result.length() - 1; i >= 0; i--) {
      tempResult = Integer.parseInt(result.substring(i, i + 1)) * base + remainder;
      remainder = tempResult / 10;
      multiplyResult = (tempResult % 10) + multiplyResult;
    }
    if (remainder == 0) {
      return multiplyResult;
    } else {
      return remainder + multiplyResult;
    }

  }
}