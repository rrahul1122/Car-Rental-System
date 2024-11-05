package rentalSystem;

public class Main1 {

	public static void main(String[] args) {
		CarRentalSystem carrent = new CarRentalSystem();
		
		Car car1 = new Car("C001", "Toyota", "Camry", 60.0); // Different base price per day for each car
        Car car2 = new Car("C002", "Honda", "Accord", 70.0);
        Car car3 = new Car("C003", "Mahindra", "Thar", 150.0);
        Car car4 = new Car("C004", "Polo", "volkswagon", 10011.0);
        carrent.addCar(car1);
        carrent.addCar(car2);
        carrent.addCar(car3);
        
        carrent.menu();
	}
}
