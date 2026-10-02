public class SushiOrder extends Order {
    public SushiOrder(DeliveryType deliveryType) {
        super(deliveryType);
    }

    @Override
    public void processOrder() {
        System.out.println("Rolling Philadelphia Sushi...");
        deliveryType.deliver("Philadelphia Sushi Set");
    }
}