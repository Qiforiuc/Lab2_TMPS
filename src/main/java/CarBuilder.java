public interface CarBuilder {
  void setModel(String model);
  void setColor(String color);
  void setTransmission(String transmission);
  void setEngineSize(float engineSize);
  Car build();
}