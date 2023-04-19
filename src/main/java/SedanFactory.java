public class SedanFactory implements CarFactory {
  @Override
  public Car createCar() {
    CarBuilder builder = new CarBuilderImpl();
    builder.setModel("Sedan");
    builder.setColor("Black");
    builder.setTransmission("Automatic");
    builder.setEngineSize(2.5f);
    return builder.build();
  }
}