package ie;

import java.util.ArrayList;

public class StockList {
	
	private ArrayList<Car> inventory;
	
	public StockList() {
		inventory = new ArrayList<Car>();
	}
	
	public void addCar(Car car) {
		inventory.add(car);
	}
	
	public ArrayList<Car> getInventory(){
		return inventory;
	}
	
	public ArrayList<Car> searchByMake(String make) {
        ArrayList<Car> results = new ArrayList<Car>();
        for (Car car : inventory) {
            if (car.getMake().equalsIgnoreCase(make)) {
                results.add(car);
            }
        }
        return results;
    }
	
	public ArrayList<Car> searchByPrice(double minPrice, double maxPrice) {
        ArrayList<Car> results = new ArrayList<Car>();
        for (Car car : inventory) {
            if (car.getPrice() >= minPrice && car.getPrice() <= maxPrice) {
                results.add(car);
            }
        }
        return results;
	}
	
}


