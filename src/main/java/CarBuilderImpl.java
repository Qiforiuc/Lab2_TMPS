public class CarBuilderImpl implements CarBuilder {
  private String model;
  private String color;
  private String transmission;
  private float engineSize;

  public CarBuilderImpl() {}

  @Override
  public void setModel(String model) {
    this.model = model;
  }

  @Override
  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public void setTransmission(String transmission) {
    this.transmission = transmission;
  }

  @Override
  public void setEngineSize(float engineSize) {
    this.engineSize = engineSize;
  }

  @Override
  public Car build() {
    return new Car(model, color, transmission, engineSize);
  }
}
