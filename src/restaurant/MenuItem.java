package restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class MenuItem {
    private Double price;
    private String description;
    private  ArrayList<String> category = new ArrayList<>(Arrays.asList("appetizer","main course","dessert"));
    private Boolean isNew;

    public MenuItem(Double aPrice, String aDescription, ArrayList<String> aCategory, Boolean aisNew) {
        this.price = aPrice;
        this.description = aDescription;
        this.category = aCategory;
        this.isNew = aisNew;
    }

    public Double getPrice(){
        return price;
    }
    private void setPrice(Double aPrice){
        price=aPrice;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String aDescription){
        description=aDescription;
    }

    public ArrayList<String> getCategory() {
        return category;
    }

    public void setCategory(ArrayList<String> category) {
        this.category = category;
    }

    public Boolean getNew() {
        return isNew;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }
}
