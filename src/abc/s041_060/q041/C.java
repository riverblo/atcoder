package abc.s041_060.q041;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class C {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int N = scan.nextInt();

    Map<Integer, Integer> map = new HashMap<>(N, 2);
    for (int i = 1; i <= N; i++) {
      map.put(scan.nextInt(), i);
    }

    Map<Integer, Integer> sorted = new TreeMap<>(Collections.reverseOrder());
    sorted.putAll(map);

    for (Integer i : sorted.values()) {
      System.out.println(i);
    }
  }
}
