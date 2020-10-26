public class colortester {
  public static void main( String[] args ) {
    Color jack = new Color();
    Color jill = new Color(123, 123, 123);

    jack.summary();
    jack.randomize();
    jack.summary();
    jack.darken(10);
    jack.summary();

    jill.summary();
    jill.setRed(300);
    System.out.println("Jill's red value is now: " + jill.getRed());

  }
}