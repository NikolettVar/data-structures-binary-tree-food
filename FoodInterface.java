/*FoodInterface.java
 *N Varadi
 *22 05 2021
 */

package task2;


//This interface lists our abstract methods we need to implement
public interface FoodInterface <T extends Comparable<T>> {
	
	public void insertNode (T element); //adds new element into the tree
	
	public boolean isEmpty();//checks if tree is empty
	
	public int size(); //counts the number of nodes in the tree
	
	public T minHealthIndex();//finds the food with the lowest healthIndex label
	
	public T maxHealthIndex(); //finds the food with the highest healthIndex label	

	
	public void inOrder();//traverses the tree and prints out the nodes in the tree in ascending order
}
