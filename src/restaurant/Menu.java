package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

private ArrayList<MenuItem> menuItem= new ArrayList<>();
private Date lastUpdated;

    public Menu(ArrayList<MenuItem> aMenuItem, Date aLastUpdated) {
        this.menuItem = aMenuItem;
        this.lastUpdated = aLastUpdated;
    }
    public Date getLastUpdated(){
        return getLastUpdated();
    }
    public void setLastUpdated( Date aLastUpdated){
        lastUpdated=aLastUpdated;
    }

}
