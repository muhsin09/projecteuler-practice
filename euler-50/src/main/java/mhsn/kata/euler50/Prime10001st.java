package mhsn.kata.euler50;

import mhsn.kata.euler50.util.EulerUtilities;

/**
 *

 By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

 What is the 10 001st prime number?

 */
public class Prime10001st {

  public static int calculate(int order){
    int foundPrimesNumber=0;
    int primeNumber = 0;
    int i = 2;
    for (; foundPrimesNumber != order; i++){
      if(EulerUtilities.isPrime(i)){
        foundPrimesNumber++;
        primeNumber = i;
      }
    }


    return primeNumber;
  }

}
