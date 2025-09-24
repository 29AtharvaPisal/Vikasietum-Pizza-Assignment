package model;

public class Topping {
    private String name;
    private boolean isVegetarian;
    private int price;

    public Topping(String name, boolean isVegetarian, int price){
        this.name = name;
        this.isVegetarian = isVegetarian;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public boolean isVegetarian(){
        return isVegetarian;
    }

    public int getPrice(){
        return price;
    }

}
