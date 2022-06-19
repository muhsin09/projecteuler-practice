package mhsn.kata.euler50;

/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which, a^2 + b^2 = c^2
 *
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 *
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000. Find the product abc.
 */
public class SpecialPythagoreanTriplet {

  public int calculate() {

    double a;
    double b;

    for (a = 1; a < 1_000; a++) {
      for (b = a + 1; b < 1_000; b++) {

        double c = 1_000.0 - a - b;

        if (Math.pow(a,2)+ Math.pow(b,2) == Math.pow(c,2)) {
          System.out.println(a);
          System.out.println(b);
          System.out.println(c);
          System.out.println(String.valueOf(a*b*c));
          break;
        }
      }

    }
    return 0;

  }
}
