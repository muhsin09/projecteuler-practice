package mhsn.kata.euler50;

/**
 * The sum of the squares of the first ten natural numbers is, 1^2 + 2^2 + 3^2 + 4^2 + 5^2  .. 10^2 = 385 The square of the sum of the first
 * ten natural numbers is, (1+2+3...+10)^2 = 3025 Hence the difference between the sum of the squares of the first ten natural numbers and
 * the square of the sum is 3025-385 = 2640.
 *
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class SumSquareDifference {

  static long calculate(int number) {

    long sumOfTheSquares = 0l;
    long squareOfTheSum = 0l;

    for (int i = 1; i < number + 1; i++) {
      sumOfTheSquares += Math.pow(i, 2);
    }
    final long sum = number * (number + 1) / 2;
    squareOfTheSum = (long) Math.pow(sum, 2);

    return squareOfTheSum - sumOfTheSquares;
  }

}
