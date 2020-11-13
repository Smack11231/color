public class LunchAccountTester {
    public static void main( String[] args ) {
      LunchAccount acountone = new LunchAccount();
      LunchAccount acounttwo = new LunchAccount(35);

      System.out.println(acountone.getBalance());
      System.out.println(acountone.getBalance());

      acountone.addBalace(25);
      System.out.println(acountone.getBalance());

      System.out.println(acounttwo.getId());
      System.out.println(acounttwo.getId());
    }
  }