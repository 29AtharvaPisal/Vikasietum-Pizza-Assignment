package model;

public class Size {
    REGULAR, MEDIUM, LARGE;

    public int getPrice(String pizzaName){
        Map<String, Integer> price = switch (this){
            case REGULAR -> MenuData.REGULAR_PRICES;
            case MEDIUM -> MenuData.MEDIUM_PRICES;
            case LARGE -> MenuData.LARGE_PRICES;
        };
        return prices.getOrDefault(pizzaName, 0);
    }
}
