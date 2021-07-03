/*FoodProduct.java
 * N Varadi
 * 22 05 2021
 */

package task2;

//First we must create an instantiable class that implements Java class Comparable
public class FoodProduct implements Comparable<FoodProduct>{
	
	
	//Next, we must declare the data members of the class
	private String name;	
	private double price;
	private int healthIndex;
	
	//Here we create the constructor of the class so that
	//by calling this constructor we will be able to create FoodProduct objects
	public FoodProduct(String name, double price, int healthIndex) {
		
		this.name = name;		
		this.price = price;
		this.healthIndex = healthIndex;
	}
	
	//In order to be able to compare our FoodProduct objects, 
	//We must make use of the compareTo() method of the Comparable class
	//This method can return 3 possible values: 0, 1 and -1 depending on 
	//the result of the comparison of FoodProduct objects, based on 
	//their healthIndex attribute
	@Override
	public int compareTo(FoodProduct otherFoodProduct) {
		//
		if (this.healthIndex == otherFoodProduct.getHealthIndex())
			return 0;
		
		if (this.healthIndex > otherFoodProduct.getHealthIndex()) {
			return 1;
			
		} else {
			return -1;
		}

	}	
	
	//This method will provide a String representation of each FoodProduct object
	@Override
	public String toString() {
		return  name + ", " + "€" + price + ", " + healthIndex;
		
	}

	//We must create the setter and getter methods for all the attributes the class has
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getHealthIndex() {
		return healthIndex;
	}


	public void setHealthIndex(int healthIndex) {
		this.healthIndex = healthIndex;
	}
	
	
}
