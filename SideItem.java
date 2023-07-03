import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SideItem {
        private Map<Integer, Items> itemsMenu;
        //private List<Integer> orderDetails;
        public SideItem(){
                //orderDetails = new ArrayList<>();
                itemsMenu = new HashMap<Integer, Items>();
                addItems();
        }

        private void addItems(){
                itemsMenu.put(1, new Items("Salted French Fries", 40));
                itemsMenu.put(2, new Items("Classic French Fries", 30));
        }
        public void printSideItemsMenu(){
                for(Map.Entry<Integer, Items> i : itemsMenu.entrySet()){
                        System.out.printf("""
                                %d\t\t%-30s\t\t%d\n
                                """, i.getKey(), i.getValue().getType(), i.getValue().getPrice());
                }
        }

        public void printItemsBill(int a){
                System.out.printf("%-20s\t\t%d\n",itemsMenu.get(a).getType(),itemsMenu.get(a).getPrice());
        }


        public int getPrice(int a){
                return itemsMenu.get(a).getPrice();
        }

}