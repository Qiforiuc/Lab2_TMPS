public class Car implements Cloneable {
  private String model;
  private String color;
  private String transmission;
  private float engineSize;

  public Car() {}

  public Car(String model, String color, String transmission, float engineSize) {
    this.model = model;
    this.color = color;
    this.transmission = transmission;
    this.engineSize = engineSize;
  }

  public String getModel() {
    return model;
  }

  public String getColor() {
    return color;
  }

  public String getTransmission() {
    return transmission;
  }

  public float getEngineSize() {
    return engineSize;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}