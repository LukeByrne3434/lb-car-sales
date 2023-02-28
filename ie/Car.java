package ie;

public class Car {
	
	 	private String make;
	    private String model;
	    private int engineCapacity;
	    private int price;
	    private int power;
	    private int numOfDoors;
	    
	   
	    public Car(String make, String model,  int engineCapacity,int price, int power, int numOfDoors) {
	        
	    	this.make = make;
		    this.model = model;
		    this.engineCapacity = engineCapacity;
		    this.price = price;
		    this.power = power;
		    this.numOfDoors = numOfDoors;
	    }


		public String getMake() {
			return make;
		}


		public void setMake(String make) {
			this.make = make;
		}


		public String getModel() {
			return model;
		}


		public void setModel(String model) {
			this.model = model;
		}



		public int getEngineCapacity() {
			return engineCapacity;
		}


		public void setEngineCapacity(int engineCapacity) {
			this.engineCapacity = engineCapacity;
		}


		public int getPrice() {
			return price;
		}


		public void setPrice(int price) {
			this.price = price;
		}


		public int getPower() {
			return power;
		}


		public void setPower(int power) {
			this.power = power;
		}


		public int getNumOfDoors() {
			return numOfDoors;
		}


		public void setNumOfDoors(int numOfDoors) {
			this.numOfDoors = numOfDoors;
		}
	    
	    

}
