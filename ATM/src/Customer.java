public class Customer {
    private String name;
    private Account account;
    private Card card;

    public Customer(String name, Account account, Card card) {
        this.name = name;
        this.account = account;
        this.card = card;
    }

    public Account getAccount() {
        return account;
    }

    public Card getCard() {
        return card;
    }
}