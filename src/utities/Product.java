/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author root
 */
public class Product {
    
    private String nameProduct;
    private double price;
    private List<OrderItem> product = new ArrayList<>();
    
    public Product( String nameProduct) {
              this.nameProduct = nameProduct;
    }
       
       public Product(String nameProduct, double price ) {
   
         this.nameProduct = nameProduct;
         this.price= price;
       
           
           
    }

  

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<OrderItem> getProduct() {
        return product;
    }


       
       
   
       
    
    
}
