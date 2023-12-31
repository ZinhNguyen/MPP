package fpp;

public class ArrayHasNoZeroes {
  public static void main(String[] args) {
    int[] a;

    a = new int[] { 1, 2, 3 };
    System.out.println(arrayHasNoZeroes(a));

    a = new int[] { 1, 0, 4, 0 };
    System.out.println(arrayHasNoZeroes(a));

    a = new int[] { 1, 2, 3, 0 };
    System.out.println(arrayHasNoZeroes(a));

    a = new int[] { 0, 0, 0, 0 };
    System.out.println(arrayHasNoZeroes(a));

    a = new int[] {};
    System.out.println(arrayHasNoZeroes(a));
  }

  static int arrayHasNoZeroes(int[] a) {
    for (int i = 0; i < a.length; i++) {
      if (a[i] == 0) {
        return 0;
      }
    }
    return 1;
  }
}
