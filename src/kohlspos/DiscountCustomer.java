package kohlspos;

public class DiscountCustomer implements Discount extends Customer {

    @Override
    public double getNewPrice(double price) {
        // get discount rate for Customer somehow
        double customerDiscountRate;
        double price = this.price - (this.price * customerDiscountRate);
    }
    
}
