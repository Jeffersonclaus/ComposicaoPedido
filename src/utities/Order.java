/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utities;

import enum1.OrderStatus;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 *
 * @author root
 */
public class Order {
 
 private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
   private Date moment;
   private OrderStatus status;
   
   List <OrderItem> items = new ArrayList<>();
   private Client client;

    public Order() {
    }

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
              
    }
   
   
  
   
   
 public void addItem(OrderItem item){
 

     items.add(item);
 }
   
 public void removetem(OrderItem remove){
 

     items.add(remove);
 }
      

public double total(){
 double som = 0;
 
    for (OrderItem c: items) {
        
        som  = som + c.Subtotal();
    }
 

return som;


}
 
 
 
    
 
 public String toStringBString(){
     StringBuilder sb = new StringBuilder();
 
	   sb.append("Order moment: ");
     sb.append(sdf.format(moment)).append("\n");
     sb.append("Order status: ");
     sb.append(status).append("\n");
     sb.append("Client: ");
     sb.append(client).append("\n");
     sb.append("Order items:\n");
     for (OrderItem item : items) {
         sb.append(item).append("\n");
     }
     sb.append("Total price: $");
     sb.append(String.format("%.2f", total()));
     return sb.toString();


}

}