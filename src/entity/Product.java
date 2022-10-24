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
    private String brand;
    private String name;
    private String quantity;
    private String price;

    public Product() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "brand=" + brand + ", name=" + name + ", quantity=" + quantity + ", price=" + price + '}';
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
            
}
