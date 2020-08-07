/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utities;

/**
 *
 * @author root
 */
 public class OrderItem {
     
     
 private Integer quantity;
 private Double price;
 private  Product product;

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
       
    }

    public OrderItem() {
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

   public double Subtotal(){
       
       return quantity  * price;
         
 }
 
 @Override
   public String toString (){
   
     return   "Product: " + product.getNameProduct() 
             + "Quantity: " + quantity
             + "SUBTOTAL R$: " + String.format("%.2f", Subtotal()) +"\n";
    
   
   }
   
 
 
 
 }