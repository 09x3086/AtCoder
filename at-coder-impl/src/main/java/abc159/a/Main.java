package abc159.a;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * A - The Number of Even Pairs class.
 */
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    List<Integer> integerList = new ArrayList<>();

    for (int i = 0; i < Integer.parseInt(scanner.next()); i++) {
      integerList.add(i, 2);
    }

    for (int i = 0; i < Integer.parseInt(scanner.next()); i++) {
      integerList.add(i, 1);
    }

    int count = 0;

    for (int i = 0; i < integerList.size(); i++) {
      Integer integer = integerList.get(i);
      for (int j = i + 1; j < integerList.size(); j++) {
        if (integer + integerList.get(j) % 2 == 0) {
          count++;
        }
      }
    }

    System.out.println(count);
  }
}
