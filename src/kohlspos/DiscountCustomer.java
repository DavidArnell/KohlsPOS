package kohlspos;

public class DiscountCustomer implements DiscountStrategy {

    
    private double customerDiscount;
    private double discountedPrice;
    private double itemCost;
    
    
    @Override
    public double getDiscount(double itemCost) {
        this.itemCost = itemCost;
        discountedPrice = itemCost - customerDiscount * itemCost;
        return itemCost;
    }    
    
    public double getCustomerDiscount() {
        return customerDiscount;
    }

    public void setCustomerDiscount(double customerDiscount) {
        this.customerDiscount = customerDiscount;
    }
    



}
