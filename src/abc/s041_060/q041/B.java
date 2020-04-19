package abc.s041_060.q041;

import java.util.Scanner;

public class B {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    long A = scan.nextLong();
    long B = scan.nextLong();
    long C = scan.nextLong();

    long result = A * B % (long) (Math.pow(10, 9) + 7) * C % (long) (Math.pow(10, 9) + 7);
    System.out.println(result);
  }
}
