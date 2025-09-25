package model;

import java.util.List;

public class Order {
    private List<Pizza> pizzas;
    private List<Side> sides;

    public Order(List<Pizza> pizzas, List<Side> sides){
        this.pizzas = pizzas;
        this.sides = sides;
    }

    public int getTotalAmount(){
        int pizzaTotal = pizzas.stream().mapToInt(Pizza::calculatePrice).sum();
        int sidesTotal = sides.stream().mapToInt(Side::getPrice).sum();
        return pizzaTotal + sidesTotal;
    }

    public List<Pizza> getPizzas(){
        return pizzas;
    }

    public List<Side> getSides(){
        return sides;
    }
}
