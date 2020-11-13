public class LunchAccountTester {
    public static void main( String[] args ) {
      LunchAccount acountone = new LunchAccount();
      LunchAccount acounttwo = new LunchAccount(35);

      System.out.println(acountone.getBalance());
      System.out.println(acounttwo.getBalance());

      acountone.addBalance(25);
      System.out.println(acountone.getBalance());

      System.out.println(acountone.getId());
      System.out.println(acounttwo.getId());
    }
  }