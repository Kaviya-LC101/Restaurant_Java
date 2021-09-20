package restaurant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class MenuItem {
    private Double price;
    private String description;
    //private  ArrayList<String> category = new ArrayList<>(Arrays.asList("appetizer","main course","dessert"));
    private Category category;
    private Boolean isNew;

    public MenuItem(Double aPrice, String aDescription, Category aCategory, Boolean aisNew) {
        this.price = aPrice;
        this.description = aDescription;
        this.category = aCategory;
        this.isNew = aisNew;
    }

    @Override
    public String toString() {
        String formatedMenuPrint=category.getDisplayName()+":" +description+", "+price+"$ "+displayIsNew();
        return formatedMenuPrint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return description.equals(menuItem.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description);
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public  void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Boolean getNew() {
        return isNew;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }
    public String displayIsNew(){
       if(this.isNew==true){
           return"New!";
       }else{
           return "";
       }
    }
}

enum Category {
    Appetizer("Appetizer"),
    Dessert("Dessert"),
    MainCourse("Main Course");
    private final String displayName;

    Category (String displayName){
        this.displayName=displayName;
    }
    public String getDisplayName() {
        return this.displayName;
    }

}

