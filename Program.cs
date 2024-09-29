// Vehicle vehicle = new Vehicle();
Vehicle vehicle = new Vehicle("Honda", 2022);  // This is correct
Car car = new Car("Toyota", 2021, 4, 4);


// vehicle.Start();
// vehicle.Brand = "Toyota";
car.NumberOfDoors = 20;
car.Year = 2024;
// Console.WriteLine(vehicle.Brand);
// Console.WriteLine($"{vehicle.Brand}, {vehicle.Year}"); 
Console.WriteLine($"{car.Brand}, {car.Year}, {car.NumberOfDoors} doors, {car.NumberOfWheels} wheels");