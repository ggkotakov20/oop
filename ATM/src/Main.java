public class Main {
    public static void main(String[] args) {
        // Създаване на клиент, акаунт и карта
        Account account = new Account(12345, 5000);
        Card card = new Card(1111111111);
        Customer customer = new Customer("Иван Иванов", account, card);

        // Симулиране на банкомат
        ATM atm = new ATM(customer.getAccount());
        atm.withdraw(1000);
        atm.deposit(500);
    }
}