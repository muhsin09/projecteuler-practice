package mhsn.kata.euler50;

/**
 * Lattice paths Problem 15 Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are
 * exactly 6 routes to the bottom right corner.
 *
 *
 * How many such routes are there through a 20×20 grid?
 */
public class LatticePaths {

  public static void main(String[] args) {
    int[][] grid = new int[20][20];

//    System.out.println(solve(grid));
    System.out.println(Math.pow(2,361));
  }

  private static int solve(int[][] grid) {

    final int ROW = grid.length;
    final int COLUMN = grid[0].length;

    int result = 0;

    for (int row = 0; row < ROW; row++) {
      for (int column = 0; column < COLUMN; column++) {
        boolean isOkForLeftRight = column + 1 < COLUMN ? true : false;
        boolean isOkForDown = row + 1 < ROW ? true : false;
        if (isOkForDown && isOkForLeftRight) {
          result += 1;
        }
      }

    }
    System.out.println(result);
    return result;
  }

}