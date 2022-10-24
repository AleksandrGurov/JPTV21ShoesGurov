/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21shoesgurov;

import Managers.ClientManager;
import Managers.ShoeManager;
import entity.Clients;
import entity.Product;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class App {
   private Clients[] Client;
   private Product[] Product;
   private final ShoeManager productManager;
   private final ClientManager clientManager;
   
   public App(){
   this.Client= new Clients[0];
   this.Product= new Product[0];
   productManager = new ShoeManager();
   clientManager= new ClientManager();
   }
   

    public void run(){
        boolean repeat = true;
        Scanner scanner = new Scanner(System.in);  
        do{
            System.out.println("0 vihod iz programmi");
            System.out.println("1 dobavit product");
            System.out.println("2 spisok prodavaemih produktov");
            System.out.println("3 dobavit pokupatela");
            System.out.println("4 spisok zaregestrirovannih pokupateley");
            System.out.println("5 pokupka pokupatelev produkta");
            System.out.println("6 dohod magazina");
            System.out.println("7 dobavit deneg");     
            int task = scanner.nextInt();
            scanner.nextLine();
            System.out.println("____________________");
            switch (task) {
                case 0:
                    repeat = false;
                    System.out.println("0zakrivaem");
                    break;                    
                case 1:
                    ShoeManager shoeManager= new ShoeManager();
                    System.out.println("1 dobavlenie producta");
                    this.Product = Arrays.copyOf(this.Product, this.Product.length+1);
                    this.Product[this.Product.length-1] = shoeManager.createShoe();                    
                    break; 
                case 2:
                    System.out.println("2. spisok produktov");
                    productManager.printListProduct(Product);
                case 3:
                    System.out.println("Задача 3. dobavit pokupatelya");
                    this.Client = Arrays.copyOf(this.Client, this.Client.length+1);
                    this.Client[this.Client.length-1] = clientManager.addClient();
                    break;       
                case 4:
                    System.out.println("Задача 4. Список читателей");
                    clientManager.printListClients(Client);
                    break;                  
                
            }
            System.out.println("=======---------========");


            
        }while(repeat);
    }
}
