/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Managers;

import entity.Client;
import entity.Product;
import entity.Purchase;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class PurchaseManager {
    private final Scanner scanner = new Scanner(System.in);
   
    public Purchase buyProduct(Product[] products, Client[] clients){
        Purchase purchase = new Purchase();
       
        System.out.println("spisok");
        ClientManager clientManager = new ClientManager();
        clientManager.printListClients(clients);
        System.out.println(" vibirite nomer pokupatelja");
        int product = scanner.nextInt();scanner.nextLine();
       
        System.out.println("spisok producktov");
        System.out.print("viberite nomer producta iz spiska");
        int numberProduct = scanner.nextInt();scanner.nextLine();
        if(!products[product-1].countMinuss()){
            return null;
        }
        purchase.setProduct(products[numberProduct-1]);
        purchase.setClient(clients[product-1]);
        purchase.setDate(new GregorianCalendar().getTime());
        

               
        return purchase;
       
    }
}
    

                
    

