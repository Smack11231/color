public class LunchAccountTester {
    public static void main( String[] args ) {
      LunchAccount accountone = new LunchAccount();
      LunchAccount accountonee = new LunchAccount();
      LunchAccount accounttwo = new LunchAccount(35);

      System.out.println(accountone.getId());
      System.out.println(accountonee.getId());
      System.out.println(accounttwo.getId());

      System.out.println(accountone.getBalance());
      System.out.println(accounttwo.getBalance());

      accountone.addBalance(25);
      System.out.println(accountone.getBalance());

      System.out.println(accountone.toString());
      accountone.eatLunch(13);
      System.out.println(accountone.toString());
    }
  }