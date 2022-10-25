/*
 
 */
package Managers;

import entity.Clients;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ClientManager {
        private final Scanner scanner = new Scanner(System.in);
    public Clients addClient(){
        Clients client = new Clients();
        System.out.print("vvedite imya: ");
        client.setFirstname(scanner.nextLine());
        System.out.print("vvedite familiyu: ");
        client.setLastname(scanner.nextLine());
        System.out.print("vvedite koli4estvo deneg klienta: ");
        client.setCash(scanner.nextInt());scanner.nextLine();
        return client;}
        
        
    public void printListClients(Clients[] clients) {
        for (int i = 0; i < clients.length; i++) {
            Clients k = clients[i];
            System.out.printf(i+1+".%s %s %s%n"
                    ,k.getFirstname()
                    ,k.getLastname()
                    ,k.getCash()                    
            );
        }
    }
}   
    


