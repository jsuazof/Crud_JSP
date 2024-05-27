package models;

import java.time.LocalDate;

public class Product {

    private Long id;
    private String name;
    private Category category;
    private int price;
    private String sku;
    private LocalDate dateRegister;
   

    //constructor

   public Product(Long id, String name, Category category, int price, String sku, LocalDate dateRegister) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.sku = sku;
        this.dateRegister = dateRegister;
    }


public Long getId() {
    return id;
}


public void setId(Long id) {
    this.id = id;
}


public String getName() {
    return name;
}


public void setName(String name) {
    this.name = name;
}


public Category getCategory() {
    return category;
}


public void setCategory(Category category) {
    this.category = category;
}


public int getPrice() {
    return price;
}


public void setPrice(int price) {
    this.price = price;
}


public String getSku() {
    return sku;
}


public void setSku(String sku) {
    this.sku = sku;
}


public LocalDate getDateRegister() {
    return dateRegister;
}


public void setDateRegister(LocalDate dateRegister) {
    this.dateRegister = dateRegister;
}
    
}
