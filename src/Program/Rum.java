/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import enum1.OrderStatus;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import utities.Client;
import utities.Order;
import utities.OrderItem;
import utities.Product;

/**
 *
 * @author root
 */
public class Rum {
    
    public static void main (String []args) throws ParseException{
        
     
     
        
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
               
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter cliente data:");
        System.out.print("Name:");
        String name = sc.nextLine();
        System.out.print("e-mail:");
        String email = sc.nextLine();
        System.out.println("Birth date(DD/MM/YYYY)");
        Date date = sdf.parse(sc.next());
       
        Client c = new Client(name, email, date);
        
        System.out.print("Enter order data:");
        OrderStatus  status = OrderStatus.valueOf(sc.next());
        
       
        Order order = new Order( new Date(), status, c);
        
        
               
        System.out.print("How many items to this order? ");
        int n  = sc.nextInt();
     
        
        for (int i = 1; i <= n; i++) {
 
            System.out.println("Enter#"+ i +"item  data");
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            sc.next();
            System.out.print("Product price: ");
            double price = sc.nextDouble();
            System.out.print("Product quantity: ");
            int quantity = sc.nextInt();
            
            Product p = new Product(productName, price);
            
            OrderItem it = new OrderItem(quantity, price, p);
            
          
            order.addItem(it);
        }
        
        System.out.println();
        System.out.println(order.toStringBString());
    
    
    
    sc.close();
    }
    
    
}
