public class LunchAccount {
    private String name = "";
    private int balance = 0;
    private static int userId = 1000;
    private int id = 1000;
    private int lunchesSold = 0, lunchTotalCost = 0;
    private int lunchesBought = 0;
    private boolean isFirst = false;

    public LunchAccount() {
        this.userId = id;
        id++;
        if (id<1100) {
            this.balance += 20;
            isFirst = true;
        }
    }

    public LunchAccount(int balance) {
        this.balance = balance;
        this.userId = id;
        id++;
        if (id<1100) {
            this.balance += 20;
            isFirst = true;
        }
    }

    public void addBalance(int amount) {
        this.balance += amount;
        if (isFirst == false) {
            balance += 20;
            isFirst = true;
        }
    }

    public int getBalance() {
        return balance;
    }

    public void eatLunch(int cost) {
        this.balance -= cost;
        lunchesSold++;
        lunchTotalCost += cost;
    }

    public int getId() {
        return userId;
    }
}