package edu.cnm.deepdive;

import java.util.Comparator;

public class TopLevel {

  private int data = 10;
  private static int moreData = 100;

  public static class NestedClass {

    private int myData = moreData;
  }

  public class InnerClass {

    private int myData = data;

    private void doSomething() {
      System.out.println(TopLevel.this.getClass().getSimpleName());

      // Anonymous class as interface implementations
      Comparator<Integer> comp = new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
          return 0;
        }
      };

      // Anonymous class as subclass
      Object obj = new Object() {
        {System.out.println(this.getClass().getSimpleName());}
      };
      class LocalClass {

      }
      // Local class
      LocalClass lc = new LocalClass();

      Comparator<Integer> comp2 = (val1, val2) -> {
        System.out.println(this.getClass().getSimpleName());
        return Integer.compare(val1, val2);
      };
    }
  }

}