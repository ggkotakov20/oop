public class ATM {
    private Account currentAccount;

    public ATM(Account account) {
        this.currentAccount = account;
    }

    public void withdraw(double amount) {
        if (currentAccount.getBalance() >= amount) {
            currentAccount.debit(amount);
            System.out.println("Теглене успешно. Наличност: " + currentAccount.getBalance());
        } else {
            System.out.println("Недостатъчна наличност.");
        }
    }

    public void deposit(double amount) {
        currentAccount.credit(amount);
        System.out.println("Депозит успешен. Наличност: " + currentAccount.getBalance());
    }
}
