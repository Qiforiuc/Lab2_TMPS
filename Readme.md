# Creational Design Patterns
_______________________________________________________________________________

## Objectives
1. Study and understand the Creational Design Patterns.
2. Choose a domain, define its main classes/models/entities 
and choose the appropriate instantiation mechanisms.
3. Use some creational design patterns for object instantiation in a sample project.

## Used design patterns
1. Singleton
2. Builder
3. Protorype
4. Factory Method

## Implementation

### Singleton Pattern
Singleton design pattern is used in the CarManufacturer class, which ensures that there is only one instance of the CarManufacturer class in the entire application. Here's how it is implemented:
The CarManufacturer class has a private static instance variable called "instance". This variable is initialized to null, which means that no instance of the CarManufacturer class has been created yet.
The CarManufacturer class has a private constructor, which means that the CarManufacturer class can only be instantiated from within the CarManufacturer class itself.
The CarManufacturer class has a public static method called "getInstance", which returns the single instance of the CarManufacturer class. This method checks if the instance variable is null, which means that no instance of the CarManufacturer class has been created yet. If the instance variable is null, the method creates a new instance of the CarManufacturer class using the private constructor. If the instance variable is not null, the method simply returns the existing instance of the CarManufacturer class.
The use of a private constructor and a public static method to create and retrieve the single instance of the CarManufacturer class ensures that there can be only one instance of the class in the entire application. This prevents multiple instances of the CarManufacturer class from being created, which can help conserve memory and ensure that all instances of the class are consistent with each other.
Overall, the Singleton design pattern is used in the CarManufacturer class to ensure that there is only one instance of the class in the entire application, and to provide a centralized point of access for creating and storing Car objects.
![img.png](img.png)

![img_1.png](img_1.png)

### Builder Pattern
Builder design pattern is used in the CarBuilder and CarBuilderImpl classes, which separate the construction of a Car object into separate steps. Here's how it is implemented:
The CarBuilder interface defines the steps needed to build a Car object, including setting the model, color, transmission, and engine size.
The CarBuilderImpl class implements the CarBuilder interface and provides an implementation of each method to set the corresponding instance variable of a Car object.
The CarBuilderImpl class has a "build" method that creates a new instance of the Car class using the values of its instance variables as arguments to the Car class constructor, and returns the new instance of Car.
The use of the CarBuilder interface and the CarBuilderImpl class allows for a Car object to be constructed step-by-step, with each step encapsulated in a separate method. This makes it easy to create different variations of Car objects with different sets of instance variables.
The use of a builder pattern also makes the construction of a Car object more readable and less error-prone by providing a clear separation of concerns between the building process and the creation of the final Car object. 
Overall, the Builder design pattern is used in the CarBuilder and CarBuilderImpl classes to separate the construction of a Car object into separate steps, provide a clear separation of concerns, and make it easy to create different variations of Car objects.

![img_2.png](img_2.png)

![img_3.png](img_3.png)

![img_10.png](img_10.png)

![img_11.png](img_11.png)

### Prototype Pattern
Prototype design pattern is used in the Car class by implementing the Cloneable interface and overriding the clone() method, which allows for object cloning. Here's how it is implemented:
The Car class implements the Cloneable interface, which indicates that the Car class supports cloning.
The Car class overrides the clone() method to create a new instance of the Car class with the same values as the original instance.
The use of the clone() method allows for a new instance of the Car class to be created with the same values as an existing instance of the class. This makes it easy to create multiple copies of a Car object without having to manually set the values of each instance variable.
The use of the Prototype pattern can help reduce the amount of code needed to create new objects and conserve memory by creating new objects that are similar to existing objects.
Overall, the Prototype design pattern is used in the Car class to allow for object cloning, making it easy to create multiple copies of a Car object with the same values without having to manually set the values of each instance variable.

![img_4.png](img_4.png)

![img_5.png](img_5.png)

### Factory Method
Factory Method design pattern is used in the CarFactory and its implementations (SedanFactory and SUVFactory) to create Car objects without specifying the exact class of object that will be created. Here's how it is implemented:
The CarFactory interface defines a method to create a Car object, but the implementation of the CarFactory interface can vary, allowing for different types of Car objects to be created.
The SedanFactory and SUVFactory classes implement the CarFactory interface and provide an implementation of the createCar() method to create a specific type of Car object (a Sedan or an SUV, respectively).
The use of the CarFactory interface and its implementations allows for the creation of Car objects to be abstracted away from the client code that uses them. This makes it easy to add new types of Car objects without having to modify the existing client code.
The use of the Factory Method pattern also makes the code more flexible and reusable by separating the creation of objects from the rest of the code, making it easy to swap out different CarFactory implementations as needed.
Overall, the Factory Method design pattern is used in the CarFactory interface and its implementations to create Car objects without specifying the exact class of object that will be created, making the code more flexible and reusable.

![img_6.png](img_6.png)

![img_7.png](img_7.png)

![img_8.png](img_8.png)

![img_9.png](img_9.png)

### Results after execution
![img_12.png](img_12.png)

## Conclusion

In conclusion, programming is a vast field with numerous design patterns 
available to make the development process more efficient and manageable. 
The Singleton pattern is useful when there should only be one instance of 
a class at any given time, while the Builder pattern helps to simplify the 
creation of complex objects. The Prototype pattern provides a way to create 
new objects by copying existing ones, while the Factory Method pattern allows
for the creation of objects without specifying the exact class that will be 
instantiated. Understanding and utilizing these design patterns can greatly 
enhance the quality, efficiency, and maintainability of code in software 
development.