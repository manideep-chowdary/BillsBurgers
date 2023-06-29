public class Items{
        private String type;
        private Integer price;

        public Items(String type, Integer price) {
                this.type = type;
                this.price = price;
        }

        public String getType(){
                return type;
        }

        public int getPrice(){
                return price;
        }
}
