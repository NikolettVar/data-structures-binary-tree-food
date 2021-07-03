/*FoodProductApp.java
 * N Varadi
 * 22 05 2021
 */

package task2;

public class FoodProductApp {

	public static void main(String[] args) {
		
		//Now we can create our binary search tree
		Food<FoodProduct> myFoods = new Food<>();
		
		System.out.println("Is the tree empty at this stage?: " + myFoods.isEmpty());
		
		//We can now create 10 object instances of our instantiable class FoodProduct
		//Then we insert our new objects into the binary search tree, using the 
		//previously implemented insertNode() method
		FoodProduct food1 = new FoodProduct("French Fries", 2.00, 9);
		myFoods.insertNode(food1);
		
		FoodProduct food2 = new FoodProduct("Hamburger", 2.00, 8);
		myFoods.insertNode(food2);
		
		FoodProduct food3 = new FoodProduct("Chicken Curry", 4.10, 7);
		myFoods.insertNode(food3);
		
		FoodProduct food4 = new FoodProduct("Irish Stew", 5.90, 6);
		myFoods.insertNode(food4);
		
		FoodProduct food5 = new FoodProduct("Tikka Massala", 3.80, 5);
		myFoods.insertNode(food5);
		
		FoodProduct food6 = new FoodProduct("Lamb Roast", 6.20, 4);
		myFoods.insertNode(food6);
		
		FoodProduct food7 = new FoodProduct("White Chocolate Cake", 4.00, 10);
		myFoods.insertNode(food7);
		
		FoodProduct food8 = new FoodProduct("Steamed Salmon", 5.60, 3);
		myFoods.insertNode(food8);
		
		FoodProduct food9 = new FoodProduct("Roasted Chicken Breast", 4.40, 2);
		myFoods.insertNode(food9);
		
		FoodProduct food10 = new FoodProduct("Chicken Ceasar Salad", 2.30, 1);
		myFoods.insertNode(food10);
		
		//We can now print out the representation of the binary search tree and its nodes
		System.out.println("The 10 food items in the binary search tree are: ");
		myFoods.inOrder();
		
		//We can now test our size() method 
		//This method will count the number of nodes in the tree
		System.out.println("The number of nodes in the tree is: " + myFoods.size());
		
		//The testing of isEmpty() method should return false at this stage
		//as the tree has 10 nodes in it
		System.out.println("Is the tree empty at this stage?: " + myFoods.isEmpty());
		
		//Now we can test minHealthIndex() method
		//This should return the food with the lowest health index in the tree
		System.out.println("The food with the lowest health index is: " + myFoods.minHealthIndex());
		
		//Now we can test maxHealthIndex() method
		//This should return the food with the highest health index in the tree
		System.out.println("The food with the highest health index is: " + myFoods.maxHealthIndex());
		

	}

	
}
