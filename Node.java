/*Node.java
 * N Varadi
 * 22 05 2021
 */

package task2;

//We must define a suitable node to build our binary tree with
public class Node<T> {
	
	//As the first step we must declare our data members
	//the node itself and 2 pointer, pointing to its left and right child
	protected Node<T> left;
	protected Node<T> right;
	protected T element;
	
	//The constructor of the class is created below
	//This constructor will enable us to create nodes to build a binary search tree
	public Node (T element) {
		this.element = element;
		this.left = null;
		this.right = null;
		
	}
	
	//This method will return the String representation of each node in the binary tree
	public String toString() {
		return this.element.toString();
	}
}
