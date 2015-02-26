
package kohlspos;

public interface DiscountStrategy {

      
        // Start Class
        // Get information from database
        // Get price for each item
        // Add item, quantity, discount, price, price after discount to line
        // Total everything
    
    double itemCost;
        
    public double getDiscount(double itemCost);
        
        

    
}
