import java.util.Map;
import java.util.Scanner;

public class PlaceOrder {

        protected boolean isDeluxe;
        public Scanner sc;
        private Burger burger;
        private Drink drinks;
        private SideItem item;
        public PlaceOrder(){ //Regular
                this(false);
                //burger.setOrderDetails(1);
                //drinks.setDrinksDetails(1);
                //item.setItemDetails(1);
                burger.setMaxToppings(3);
                printBill(1,1,1);
        }

        public PlaceOrder(char ch){     //Normal
                this(false);
                System.out.print("Enter ID of burger:" );
                int a = sc.nextInt();
                //burger.setOrderDetails(a);
                System.out.print("Enter ID of Drinks:" );
                int b = sc.nextInt();
                //drinks.setDrinksDetails(b);
                System.out.print("Enter ID of Side item:" );
                int c = sc.nextInt();
               // item.setItemDetails(c);
                printBill(a,b,c);
        }

        public PlaceOrder(boolean isDeluxe){
                burger = new Burger();
                drinks = new Drink();
                item = new SideItem();
                this.isDeluxe = isDeluxe;
                sc = new Scanner(System.in);
                if(this.isDeluxe){//Deluxe
                        burger.setOrderDetails(2);
                        drinks.setDrinksDetails(3);
                        //item.setItemDetails(2);
                        burger.setMaxToppings(5);
                        printBill(2,3,2);
                }
                else{
                        printMenu();
                        burger.setMaxToppings(3);
                }
        }

        public  void printMenu(){
                System.out.printf("S. no\t%-30sPrice\n", "Item");
                System.out.println("-".repeat(60));

                System.out.println("Burgers:");
                burger.printBurgerMenu();

                System.out.println("-".repeat(60));

                System.out.println("Drinks:");
                drinks.printDrinksMenu();
                System.out.println("-".repeat(60));

                System.out.println("Side Items:");
                item.printSideItemsMenu();

                System.out.println(".".repeat(60));
        }

        public void printBill(int a, int b, int c){
                System.out.println();
                System.out.println();
                System.out.println(".".repeat(6) + "Bill" + ".".repeat(6));
                System.out.println("..".repeat(10));
                System.out.println("Item\t\t\t\t\t\tPrice");
                System.out.println("--".repeat(10));
                burger.printBurgerBill(a);
                System.out.println("--".repeat(10));
                drinks.printDrinksBill(b);
                System.out.println("--".repeat(10));
                item.printItemsBill(c);
                System.out.println("..".repeat(10));
                System.out.println("\t\t\t\t\tPrice:"+ (burger.getPrice(a) + drinks.getPrice(b) + item.getPrice(c)));
        }

}