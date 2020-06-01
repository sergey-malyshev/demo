package demo;

public class Store {

   private int price;
   private String name;
   
   Store(int price, String name){
      this.name = name;
      this.price = price;
   }
   
   public void setName(String name) {
      this.name = name;
   }
   
   public void setPrice(int price) {
      this.price = price;
   }
   
   public String getName() {
      return name;
   }
   
   public int getPrice() {
      return price;
   }
}
