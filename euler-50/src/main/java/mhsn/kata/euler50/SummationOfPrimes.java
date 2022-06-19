package mhsn.kata.euler50;

import mhsn.kata.euler50.util.EulerUtilities;

/**
 *

 The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

 Find the sum of all the primes below two million.

 */
public class SummationOfPrimes {

  public long calculate(int max){
    // TODO: calculate in parallel
    long sumOfPrimes = 0;
    for (int number = 0; number < max; number++) {
        if (EulerUtilities.isPrime(number)){
          System.out.println(number);
          sumOfPrimes += number;
        }
    }
    return sumOfPrimes;
  }

}
