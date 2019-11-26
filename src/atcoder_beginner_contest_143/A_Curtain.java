package atcoder_beginner_contest_143;

/**
 * A - Curtain
 *
 * @author 09x3086
 */
public class A_Curtain {

  private int calcOpenWindowSize(Integer windowsSize, Integer curtainSize) {

    if (windowsSize > 100 || windowsSize < 1) {
      throw new IllegalArgumentException("入力エラー");
    }

    if (curtainSize > 100 || curtainSize < 1) {
      throw new IllegalArgumentException("入力エラー");
    }

    int openWindowSize = windowsSize - (curtainSize * 2);

    return openWindowSize < 0 ? 0 : openWindowSize;
  }

  public static void main(String[] args) {

    if (args.length > 2) {
      throw new IllegalArgumentException("入力エラー");
    }

    Integer windowSize = Integer.valueOf(args[0]);

    Integer curtainSize = Integer.valueOf(args[1]);

    A_Curtain a_curtain = new A_Curtain();
    int openWindowSize = a_curtain.calcOpenWindowSize(windowSize, curtainSize);

    System.out.println(openWindowSize);
  }
}
