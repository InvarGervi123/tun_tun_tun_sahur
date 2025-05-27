public class Formulas {

  public Formulas() {}

  public static float slope(int x2, int y2, int x1, int y1) {
    return (float) (y2 - y1) / (x2 - x1);
  }

  public static float[] calcQuadraticEquation(int a, int b, int c) throws NoSolutionException {
    final float[] answers = new float[2];
    float delta = (float) (b * b) - 4 * a * c;
    float x1 = 0;
    float x2 = 0;

    if (delta < 0) {
      throw new NoSolutionException(
          "There's no solution for the equation: " + a + "x^2 + (" + b + ") + (" + c + ")");
    } else if (delta == 0) {
      x1 = (float)(-b + Math.sqrt(delta) / (2 * a));
    } else {
      x1 = (float)(-b + Math.sqrt(delta) / (2 * a));
      x2 = (float)(-b - Math.sqrt(delta) / (2 * a));
    }

    answers[0] = x1;
    answers[1] = x2;
    return answers;
  }


}
