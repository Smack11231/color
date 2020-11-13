public class LunchAccount {
    private String name = "";
    private int balance = 0;
    private int userId;
    private int id = 1000;
    private int lunchesSold = 0, lunchTotalCost = 0;
    private int lunchesBought = 0;
    private boolean isFirst = false;

    public Lunch() {
        this.userId = id;
        id++;
        if (id<1100) {
            this.balance += 20;
            isFirst = true;
        }
    }

    public Lunch(int balance) {
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
        return id;
    }
}