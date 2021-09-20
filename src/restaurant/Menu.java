package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

private ArrayList<MenuItem> menuItem= new ArrayList<>();
private Date lastUpdated;

    public Menu(ArrayList<MenuItem> aMenuItem) {
        this.menuItem = aMenuItem;
        this.lastUpdated = new Date();
    }

    public ArrayList<MenuItem> getMenuItem() {
        return menuItem;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setMenuItem(ArrayList<MenuItem> menuItem) {
        this.menuItem = menuItem;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    //Add Menu Item
    public void addMenuItem(MenuItem item){

                this.menuItem.add(item);
                this.lastUpdated = new Date();


        }

    // Remove Menu Item
    public void removeMenuItem(MenuItem item){
        this.menuItem.remove(item);
        this.lastUpdated=new Date();
    }
    // Print MenuItem

    public void printMenuItem(MenuItem item){
        System.out.println(item.toString());
    }
    public void printMenu(){
        for(MenuItem item: this.menuItem){
            System.out.println(item.toString());
        }
    }

}
