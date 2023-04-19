# Car Manufacturer
_______________________________________________________________________________

### Singleton Pattern
        The CarManufacturer class implements the Singleton pattern. 
        The class has a private constructor and a getInstance() method 
        that returns the singleton instance of the class. 
        This ensures that only one instance of the CarManufacturer class
        exists in the application.

### Builder Pattern
        The CarBuilder interface and CarBuilderImpl class implement the Builder pattern. 
        The CarBuilder interface defines the methods to build a car, 
        and the CarBuilderImpl class provides implementations for these methods to create 
        a new Car object with the specified attributes. 
        This allows the creation of complex objects (i.e., cars) to be simplified and organized.

### Prototype Pattern
        The Car class implements the Cloneable interface to enable the 
        Prototype pattern. The CarManufacturer class uses the clone() 
        method to create copies of the car objects before adding them 
        to the list. This allows the creation of new objects (i.e., cars)
        by cloning existing objects, which can be more efficient 
        than creating new objects from scratch.

### Factory Method
        The CarFactory interface, SedanFactory and SUVFactory classes 
        implement the Factory Method pattern. The CarFactory interface 
        defines the createCar() method to create a new Car object, 
        and the SedanFactory and SUVFactory classes provide implementations 
        of this method to create different types of Car objects (i.e., Sedan and SUV cars).
        This allows the creation of objects to be delegated to subclasses, 
        which can provide different implementations of the same method.