import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Burger{

        private Map<Integer, Items> burgerMenu;
        private int maxToppings;
        private Map<Integer, Items> toppings;
        private List<Integer> orderDetails;

        public Burger() {
                orderDetails = new ArrayList<>();
                burgerMenu = new HashMap<Integer, Items>();
                addItems();
        }

        public void setMaxToppings(int toppings){
                maxToppings = toppings;
        }

        public void addItems(){
                burgerMenu.put(1, new Items("Regular Burger", 70));
                burgerMenu.put(2, new Items("Deluxe Burger", 250));
                burgerMenu.put(3, new Items("Ham Burger", 150));
                burgerMenu.put(4, new Items("Veggie Burger", 100));
                burgerMenu.put(5, new Items("Cheese Burger", 120));
                burgerMenu.put(6, new Items("Kiwi Burger", 140));
        }

        public void setOrderDetails(int ...a){

        }

        public void printBurgerMenu(){
                for(Map.Entry<Integer, Items> i : burgerMenu.entrySet()){
                        System.out.printf("""
                                %d\t\t%-30s\t\t%d\n
                                """, i.getKey(), i.getValue().getType(), i.getValue().getPrice());
                }
        }

        public void printBurgerBill(int a){
                System.out.println(burgerMenu.get(a).getType() + "\t\t" + burgerMenu.get(a).getPrice());
        }

        public int getPrice(int a){
                return burgerMenu.get(a).getPrice();
        }

}