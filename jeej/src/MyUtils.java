import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

interface DrinkReceipt {
    String getName();
    DrinkReceipt addComponent(String componentName, int componentCount);
}
interface DrinkPreparation {
    Map<String, Integer> makeDrink();
}
interface Rating {
    int getRating();
}
class Caffee implements DrinkReceipt, DrinkPreparation, Rating {
    String name;
    int rating;
    Map<String, Integer> ingredients = new HashMap<String, Integer>();

    @Override
    public String getName(){
        return name;
    }

    @Override
    public DrinkReceipt addComponent(String componentName, int componentCount) {
        ingredients.put(componentName, componentCount);
        return (DrinkReceipt) ingredients;
    }

    @Override
    public Map<String, Integer> makeDrink(){
        addComponent("Water", 100);
        addComponent("Arabica", 20);
        return ingredients;
    }

    @Override
    public int getRating(){
        return rating;
    }
}
class Espresso extends Caffee {
    @Override
    public Map<String, Integer> makeDrink(){
        addComponent("Water", 50);
        return ingredients;
    }
}
class Cappuccino extends Caffee {
    @Override
    public Map<String, Integer> makeDrink(){
        addComponent("Milk", 50);
        return ingredients;
    }
}
public class MyUtils{

    ArrayList<Caffee> coffees = new ArrayList<>();


    public Map<String, Double> averageRating(List<Caffee> coffees) {
        return null;
    }


}
