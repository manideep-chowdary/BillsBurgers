import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
                PlaceOrder order;
                System.out.printf("""
                %s
                Select your Choice of combo.
                %s
                Code         Type of Order
               \u2022 R             Regular
               \u2022 D             Deluxe
               \u2022 N             Customer specified 
               
               Enter the code of your order: 
               """, "..".repeat(20), "..".repeat(20));
                Scanner sc = new Scanner(System.in);
                String ch = sc.next();
                System.out.println();
                switch(ch.toUpperCase().charAt(0)){
                        case 'R' -> {
                                order = new PlaceOrder();
                        }
                        case 'D' -> {
                                order = new PlaceOrder(true);
                        }
                        case 'N' ->{
                                order = new PlaceOrder('C');
                        }
                        default -> {
                                System.out.printf("""
                                        Invalid entry
                                        Please Try again.""");
                                System.exit(0);
                        }
                }

                System.exit(0);

        }
}