public class Transaction {
    private Account sourceAccount;
    private Account targetAccount;
    private double amount;

    public Transaction(Account sourceAccount, Account targetAccount, double amount) {
        this.sourceAccount = sourceAccount;
        this.targetAccount = targetAccount;
        this.amount = amount;
    }

    public void processTransaction() {
        sourceAccount.transfer(targetAccount, amount);
    }
}