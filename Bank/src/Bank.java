import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;
    private List<Customer> customers;

    private static Bank instance = new Bank();

    private Bank() {
        this.accounts = new ArrayList<>();
        this.customers = new ArrayList<>();
    }

    public static Bank getInstance() {
        return instance;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public Customer findCustomer(String name) {
        return customers.stream()
                .filter(customer -> customer.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account findAccount(String accountNumber) {
        return accounts.stream()
                .filter(account -> account.getAccountNumber().equals(accountNumber))
                .findFirst()
                .orElse(null);
    }
}