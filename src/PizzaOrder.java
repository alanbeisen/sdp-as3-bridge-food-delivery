public class PizzaOrder extends Order {

    // Вот этот кусок кода (конструктор) обязателен!
    public PizzaOrder(DeliveryType deliveryType) {
        super(deliveryType);
    }

    @Override
    public void processOrder() {
        System.out.println("Preparing Margherita Pizza...");
        deliveryType.deliver("Margherita Pizza");
    }
}