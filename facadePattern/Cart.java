package facadePattern;

public class Cart implements HotelService{
    private int numberOfCarts;

    public Cart(int numberOfCarts) {
        this.numberOfCarts = numberOfCarts;
    }

    @Override
    public void service() {
        System.out.println(requestCart(numberOfCarts));
    }

    public String requestCart(int numberOfCarts){
        return "Requesting " + numberOfCarts + "cart/s.";
    }
}
