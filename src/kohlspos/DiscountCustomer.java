package kohlspos;

public class DiscountCustomer implements DiscountStrategy {

    
    private double customerDiscount;
    
    @Override
    public double getDiscount(double itemCost) {
        
    }    
    
    public double getCustomerDiscount() {
        return customerDiscount;
    }

    public void setCustomerDiscount(double customerDiscount) {
        this.customerDiscount = customerDiscount;
    }
    



}
