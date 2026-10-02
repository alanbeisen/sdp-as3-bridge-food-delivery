public class Main {
    public static void main(String[] args) {
        DeliveryType walk = new WalkDelivery();
        DeliveryType car = new CarDelivery();

        Order myPizza = new PizzaOrder(walk);
        myPizza.processOrder();

        System.out.println("--- Oops, it started raining! Changing courier ---");

        myPizza.setDeliveryType(car);
        myPizza.processOrder();

        System.out.println("---------------------------------------");

        Order mySushi = new SushiOrder(car);
        mySushi.processOrder();
    }
}