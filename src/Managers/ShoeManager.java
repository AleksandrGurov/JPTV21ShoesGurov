/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Managers;

import entity.Clients;
import entity.Product;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class ShoeManager {
        private Scanner scanner;

        public ShoeManager() {
        this.scanner = new Scanner(System.in);
        }        
    public Product createShoe(){
            Product product = new Product();
            System.out.println("vvedite nazvanie");
            product.setName(scanner.nextLine());
            System.out.println("vvedite tsenu");
            product.setPrice(scanner.nextInt());scanner.nextLine();
            System.out.println("vvedite koli4estvo");
            product.setQuantity(scanner.nextInt());scanner.nextLine();
            return product;
    } 
            public void printListProduct(Product[] Product){
            for (int i = 0; i < Product.length; i++) {
            Product prod = Product[i];
            System.out.printf(i+1+". %s%n",prod.getName()+"  "+ prod.getPrice()+" " + prod.getQuantity());}
            }
}
    
         

                
        
        

        


       

    
