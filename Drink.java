import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Drink{

        private Map<Integer, Items> menuDrinks;
        private List<Integer> orderDetails;

        public Drink(){
                orderDetails = new ArrayList<>();
                menuDrinks = new HashMap<Integer, Items>();
                addItems();
        }

        private void addItems(){
                menuDrinks.put(1, new Items("Regular Soda (Small)", 25));
                menuDrinks.put(2, new Items("Regular Soda (Medium)", 30));
                menuDrinks.put(3, new Items("Regular Soda (Large)", 40));
                menuDrinks.put(4, new Items("Fresh Lime Soda (Small)", 30));
                menuDrinks.put(5, new Items("Fresh Lime Soda (Medium)", 40));
                menuDrinks.put(6, new Items("Fresh Lime Soda (Large)", 60));
                menuDrinks.put(7, new Items("Coke (Small)", 35));
        }

        public void printDrinksMenu(){
                for(Map.Entry<Integer, Items> i : menuDrinks.entrySet()){
                        System.out.printf("""
                                %d\t\t%-30s\t\t%d\n
                                """, i.getKey(), i.getValue().getType(), i.getValue().getPrice());
                }
        }

        public void printDrinksBill(int a){
                System.out.printf("%-20s\t\t%d\n", menuDrinks.get(a).getType(), menuDrinks.get(a).getPrice());
        }

        public void setDrinksDetails(int a){

        }

        public int getPrice(int a){
                return menuDrinks.get(a).getPrice();
        }

}