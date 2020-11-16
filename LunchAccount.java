public class LunchAccount {
    private String name = "";
    private int balance = 0;
    private static int userId = 0;
    private int id;
    private static int lunchesSold = 0;
    public int lunchTotalCost = 0;
    private boolean isFirst = false;

    public LunchAccount() {
        this.id = userId + 1000;
        this.userId++;
        if (id<1100) {
            this.balance += 20;
            isFirst = true;
        }
    }

    public LunchAccount(int balance) {
        this.id = userId + 1000;
        this.userId++;
        this.balance += balance;
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
        this.lunchesSold++;
        this.lunchTotalCost += cost;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "Student " + id + " has $" + balance + " in their account. " + lunchesSold + " lunches have been sold at the total cost of $" + lunchTotalCost;
    }
}