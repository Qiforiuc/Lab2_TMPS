public class SUVFactory implements CarFactory {
  @Override
  public Car createCar() {
    CarBuilder builder = new CarBuilderImpl();
    builder.setModel("SUV");
    builder.setColor("White");
    builder.setTransmission("Manual");
    builder.setEngineSize(3.0f);
    return builder.build();
  }
}