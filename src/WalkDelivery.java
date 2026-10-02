public class WalkDelivery implements DeliveryType {
    @Override
    public void deliver(String food) {
        System.out.println("Walking courier is carrying: " + food);
    }
}