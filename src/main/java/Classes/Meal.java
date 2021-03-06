package Classes;

import java.io.FileInputStream;

public class Meal {
    String mealTitle;
    String description;
    String category;
    Double price;
    String imageURL;

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public Meal(String mealTitle, String description, String category, Double price, int quantity,String imageURL) {
        this.mealTitle = mealTitle;
        this.description = description;
        this.category = category;
        this.price = price;
        this.imageURL = imageURL;
        this.quantity = quantity;
    }

    int quantity;
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public Meal() {
        this.mealTitle = "";
        this.description = "";
    }

    public void setMealTitle(String mealTitle) {
        this.mealTitle = mealTitle;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMealTitle() {
        return mealTitle;
    }

    public String getDescription() {
        return description;
    }


    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Meal(String mealTitle, String description, String category, Double price, int quantity) {
        this.mealTitle = mealTitle;
        this.description = description;
        this.category = category;
        this.price = price;
        this.quantity = quantity;

    }
    @Override
    public String toString(){
        return this.mealTitle+"\n"+this.category+"\n"+this.description+"\n"+this.price+"\n"+this.quantity;
    }
}
