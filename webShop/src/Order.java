import java.util.List;

public class Order {
    private List<Product> products;
    private double totalPrice;

    public Order(List<Product> products) {
        this.products = products;
        this.totalPrice = calculateTotal();
    }

    private double calculateTotal() {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}