public class Payment {
    private Order order;

    public Payment(Order order) {
        this.order = order;
    }

    public void process() {
        System.out.println("Processing payment for order total: " + order.getTotalPrice());
    }
}