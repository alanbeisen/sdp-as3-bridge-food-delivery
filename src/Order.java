public abstract class Order {
    protected DeliveryType deliveryType;

    public Order(DeliveryType deliveryType) {
        this.deliveryType = deliveryType;
    }

    public void setDeliveryType(DeliveryType deliveryType) {
        this.deliveryType = deliveryType;
    }

    public abstract void processOrder();
}