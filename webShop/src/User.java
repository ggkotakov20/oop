public class User {
    private String username;
    private String password;
    private ShoppingCart cart;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.cart = new ShoppingCart();
    }

    public String getUsername() {
        return username;
    }

    public ShoppingCart getCart() {
        return cart;
    }

    public void addProductToCart(Product product) {
        cart.addProduct(product);
    }

    public void checkout() {
        Order order = new Order(cart.getProducts());
        Payment payment = new Payment(order);
        payment.process();
        cart.clear();
    }
}