// Derived class
public class Car : Vehicle
{
    public int NumberOfDoors;
    public int NumberOfWheels;

    // Constructor that calls the base class constructor
    public Car(string brand, int year, int numberOfDoors, int numberOfWheels)
        : base(brand, year)  // Calling the Vehicle constructor
    {
        NumberOfDoors = numberOfDoors;
        NumberOfWheels = numberOfWheels;
    }

    public void moveCam()
    {
        Console.WriteLine("Camera is moving");
    }
}