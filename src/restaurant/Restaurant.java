package restaurant;

import java.util.ArrayList;
import java.util.Scanner;

public class Restaurant {


    public static void main(String[] args) {
        ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();
        Menu restaurantMenu = new Menu(menuItems);
        restaurantMenu.addMenuItem(new MenuItem(15.00, "Burger", Category.MainCourse, false));
        restaurantMenu.addMenuItem(new MenuItem(5.00, "Fries", Category.Appetizer, false));
        restaurantMenu.addMenuItem(new MenuItem(5.00, "Cookies", Category.Dessert, false));
        restaurantMenu.printMenu();
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("\nEnter Options\n 1 - Add \n 2- Remove ");
            int choice = input.nextInt();
            if (choice == 1) {
                System.out.println("Enter the Description of Menu Item to add: \n");
                String aDescription = input.next();
                System.out.println("\nEnter the Price of Menu Item:");
                Double aPrice = input.nextDouble();
                System.out.println("Enter the Category MainCourse, Appetizer or Dessert");
                String aCategory = input.next();
                Boolean aisNew= true;
                for(MenuItem item : menuItems ){
                    if(item.getDescription().equals(aDescription)){
                        System.out.println("Item already in Menu");
                        aisNew= false;
                        break;
                    }
//                    else{
//                        restaurantMenu.addMenuItem(new MenuItem(aPrice, aDescription, Category.valueOf(aCategory), false));
//                        System.out.println("\nUpdated Menu\n");
//                        restaurantMenu.printMenu();
//                    }
                }
                if(aisNew){
                    restaurantMenu.addMenuItem(new MenuItem(aPrice, aDescription, Category.valueOf(aCategory),aisNew));
                    System.out.println("\nUpdated Menu\n");
                    restaurantMenu.printMenu();
                }

            }
            else {
                System.out.println("Enter the Description of Menu Item to remove");
                String aDescription = input.next();
                for (MenuItem item : menuItems) {
                    if (item.getDescription().equals(aDescription)) {
                        restaurantMenu.removeMenuItem(item);
                        System.out.println("\nUpdated Menu\n");
                        restaurantMenu.printMenu();
                        break;
                    }

                }

            }
        }
    }
}
