/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author pupil
 */
public class Product {
    private String productName;
    private int quantity;
    private int price;
    private int count;
   
    public Product() {

    }
       
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Products{" + "productname="
                + productName + ", quantity="
                + quantity + ", price="
                + price
                + '}';
    }
   
    public boolean countMinuss(){
        if(count>0){
            count--;
            return true;
        }
        return false;
    }
   
}