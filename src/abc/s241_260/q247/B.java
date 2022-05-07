package abc.s241_260.q247;

import java.util.*;

public class B {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int N = scan.nextInt();

    List<String[]> list = new ArrayList<>(N);
    for (int i = 1; i <= N; i++) {
      String[] s = new String[2];
      s[0] = scan.next();
      s[1] = scan.next();
      list.add(s);
    }

    boolean ng1 = false;
    boolean ng2 = false;

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        if (i != j) {
          if (Arrays.asList(list.get(j)).contains(list.get(i)[0])) {
            ng1 = true;
          }
          if (Arrays.asList(list.get(j)).contains(list.get(i)[1])) {
            ng2 = true;
          }
        }
      }
    }

    if (ng1 && ng2) {
      System.out.println("No");
      return;
    }

    System.out.println("Yes");
  }

}
