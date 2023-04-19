import java.util.ArrayList;
import java.util.List;

public class CarManufacturer {
  private static CarManufacturer instance;
  private List<Car> cars;

  private CarManufacturer() {
    cars = new ArrayList<>();
  }

  public static CarManufacturer getInstance() {
    if (instance == null) {
      instance = new CarManufacturer();
    }
    return instance;
  }

  public void manufactureCars(CarFactory factory, int quantity) throws CloneNotSupportedException {
    for (int i = 0; i < quantity; i++) {
      Car car = factory.createCar();
      cars.add((Car) car.clone());
    }
  }

  public List<Car> getCars() {
    return cars;
  }
}