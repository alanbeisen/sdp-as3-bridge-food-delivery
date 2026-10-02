public class CarDelivery implements DeliveryType {
    @Override
    public void deliver(String food) {
        System.out.println("Car courier is driving with: " + food);
    }
}