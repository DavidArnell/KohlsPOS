/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kohlspos;

/**
 *
 * @author darnell
 */
public interface ReceiptDataAccessStrategy {
    
    String custId;
    String prodId;
    
    public final ICustomer findCustomer(final String custId);
    
    public final Product findProduct(final String prodId);
    
}
