/*
 
 */
package Managers;

import entity.Client;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ClientManager {
        private final Scanner scanner = new Scanner(System.in);
    public Client addClient(){
        Client client = new Client();
        System.out.print("vvedite imya: ");
        client.setFirstname(scanner.nextLine());
        System.out.print("vvedite familiyu: ");
        client.setLastname(scanner.nextLine());
        System.out.print("vvedite koli4estvo deneg klienta: ");
        client.setCash(scanner.nextInt());scanner.nextLine();
        return client;}
        
        
    public void printListClients(Client[] clients) {
        for (int i = 0; i < clients.length; i++) {
            Client k = clients[i];
            System.out.printf(i+1+".%s %s %s%n"
                    ,k.getFirstname()
                    ,k.getLastname()
                    ,k.getCash()                    
            );
        }
    }
}   
    


