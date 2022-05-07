package abc.s041_060.q041;

import java.util.*;

public class D {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int N = scan.nextInt();
    int M = scan.nextInt();

    ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();

    for (int i = 0; i < M; i++) {
      ArrayList<Integer> aaaaa = new ArrayList<>();
      aaaaa.add(scan.nextInt());
      aaaaa.add(scan.nextInt());
      arrayList.add(aaaaa);
    }
    Collections.sort(arrayList, new Comparator<ArrayList<Integer>>() {
      @Override
      public int compare(ArrayList<Integer> i1, ArrayList<Integer> i2) {
        return i1.get(0) - i2.get(0);
      }
    });

    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < M; i++) {
      if (arrayList.get(i).get(0) == 0) {
        continue;
      }
      int pointer = arrayList.get(i).get(1);
      Integer count = 1;
      int c = counting(arrayList.size(), i, pointer, arrayList, count);
      list.add(c);
    }

    long result = 0;
    if (list.size() == 1) {
      for (Integer i : list) {
        int hoge = N;
        long fuga = 1;
        for (int j = hoge; j > 2; j--) {
          fuga *= j;
        }
        result += fuga;
      }
      System.out.println(result);
      return;
    }
    for (Integer i : list) {
      int hoge = N - i - 1;
      long fuga = 1;
      for (long j = hoge; j > 1; j--) {
        fuga *= j;
      }
      result += fuga;
    }
    System.out.println(result);
  }

  private static int counting(int arraySize, int i, int pointer, List<ArrayList<Integer>> arrayList, Integer count) {
    ArrayList<Integer> hikaku = null;
    for (int j = 0; j < arraySize; j++) {
      if (i == j) {
        continue;
      }
      hikaku = arrayList.get(j);
      if (pointer != 0 && pointer == hikaku.get(0)) {
        pointer = hikaku.get(1);
        count = counting(arrayList.size(), j, pointer, arrayList, count);

        arrayList.set(j, new ArrayList<Integer>() {
          {
            add(0);
            add(0);
          }
        });
        return count + 1;
      }
    }
    return count;
  }
}
