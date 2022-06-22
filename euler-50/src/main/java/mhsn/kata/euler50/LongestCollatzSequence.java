package mhsn.kata.euler50;

import java.util.HashMap;

/**
 * Longest Collatz sequence Problem 14
 *
 * The following iterative sequence is defined for the set of positive integers:
 *
 * n → n/2 (n is even) n → 3n + 1 (n is odd)
 *
 * Using the rule above and starting with 13, we generate the following sequence: 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 *
 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz
 * Problem), it is thought that all starting numbers finish at 1.
 *
 * Which starting number, under one million, produces the longest chain?
 *
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 */
public class LongestCollatzSequence {

  public static HashMap<Long, Long> numbersAndTermsNumber = new HashMap<Long, Long>();

  public static void main(String[] args) {

    final long start = System.currentTimeMillis();

    simpleSolution();

    final long middle = System.currentTimeMillis();

    System.out.println(middle-start);
    solutionEnis();

    System.out.println(System.currentTimeMillis()-middle);
  }

  private static void simpleSolution() {
    final int number = 19_000_000;

    // what happens when  use int instead of long
    long sequenceLength = 0;
    long startingNumber = 0;
    long sequence = 0;

    for (int i = 2; i <= number; i++) {
      int length = 1;
      sequence = i;
      while (sequence != 1) {
        sequence = f(sequence);
        length++;
      }

      //Check if sequence is the best solution
      if (length > sequenceLength) {
        sequenceLength = length;
        startingNumber = i;
      }
    }

    System.out.println(sequenceLength);
    System.out.println(startingNumber);
  }

  private static void solutionEnis() {
    for (int n = 2; n < 19_000_000; n++) {
      getTermCount(n);
    }
    final Long key = numbersAndTermsNumber.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get()
        .getKey();
    System.out.println("çözüm: " + key + " " + numbersAndTermsNumber.get(key));
    System.out.println(numbersAndTermsNumber.size());

  }


  private static long getTermCount(int k) {
    long termCount = 1;

    long n = k;
    while (n != 1) {
      n = f(n);
      if (numbersAndTermsNumber.containsKey(n)) {
        termCount = numbersAndTermsNumber.get(n) + termCount;
        break;
      }

      termCount++;
    }

    numbersAndTermsNumber.put(Long.valueOf(k), termCount);

    return termCount;
  }


  public static long f(long n) {
    long
        newN;

    if (n == 1) {
      newN = 1;
    } else if (n % 2 == 0) {
      newN = n / 2;
    } else {
      newN = 3 * n + 1;
    }
    return newN;
  }

}
