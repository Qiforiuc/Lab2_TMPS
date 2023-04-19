import java.util.List;

public class Main {
  public static void main(String[] args) throws CloneNotSupportedException {

    CarManufacturer manufacturer = CarManufacturer.getInstance();

    CarFactory sedanFactory = new SedanFactory();
    manufacturer.manufactureCars(sedanFactory, 5);

    CarFactory suvFactory = new SUVFactory();
    manufacturer.manufactureCars(suvFactory, 3);

    List<Car> cars = manufacturer.getCars();

    for (Car car : cars) {
      System.out.println("Model: " + car.getModel() +
          ", Color: " + car.getColor() +
          ", Transmission: " + car.getTransmission() +
          ", Engine Size: " + car.getEngineSize());
    }
  }
}