package Model;

public class AccountBalance {
    private double depositAmount;
    private double withdrawAmount;
    private double balance;

    public AccountBalance() {
    }

    public AccountBalance(double depositAmount, double withdrawAmount, double balance) {
        this.depositAmount = depositAmount;
        this.withdrawAmount = withdrawAmount;
        this.balance = balance;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "AccountBalance{" +
                "depositAmount=" + depositAmount +
                ", withdrawAmount=" + withdrawAmount +
                ", balance=" + balance +
                '}';
    }
}
