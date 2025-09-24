package model;

public class Pizza{
    private String name;
    private boolean isVegetarian;
    private Size size;
    private Crust crust;
    private List<Topping> toppings;
    private boolean extraCheese;

    public Pizza(String name, boolean isVegetarian, Size size, Crust crust, List<Topping> toppings, boolean extraCheese){
        this.name = name;
        this.isVegetarian = isVegetarian;
        this.size = size;
        this.crust = crust;
        this.toppings = toppings;
        this.extraCheese = extraCheese; 
    }

    public int calculatePrice(){
        int basePrice = size.getPrice(name);
        int topingCost = toppings.stream().mapToInt(Topping::getPrice).sum();
        int cheeseCost = sxtraCheese ? 35 : 0;

        if (size == Size.Large && toppings.size() >= 2){
            toppingCost -= toppings.get(0).getPrice();
            toppingCost -= toppings.get(1).getPrice();
        }

        return basePrice = toppingCost + cheeseCost;
    }

    public bootean isVegetarian(){
        return isVegetarian;
    }

    public List<Topping> getToppings(){
        return toppings;
    }

    public Crust getCrust(){
        return crust;
    }

    public String getName(){
        return name;
    }


}