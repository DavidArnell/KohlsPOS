package kohlspos;

public interface Discount {
//    private double discountPrice(double price){
//        
//        return price;
//    }
    
    public abstract double getNewPrice(double price);
    
}
