/*Food.java
 *N Varadi
 *22 05 2021
 */

package task2;

//This class will provide implementations for all our abstract methods
//listed in the FoodInterface interface
//We must ensure that this class also inherits from the Comparable class
public class Food <T extends Comparable<T>> implements FoodInterface<T>{
	
	//First we must declare the variable we need to use
	//To build a binary search tree of comparable objects 
	//we must declare the root node 
	Node<T> root;
	
	//The constructor of this class sets the initial value of the root node to null
	public Food() {
		root = null;
	}

	
	//This method allows us to add nodes into our binary search tree
	//If the tree is empty, the new node will be the root node
	//if the tree is not empty, public method will call its private counterpart
	//recursively and adds the new node into an appropriate location
	//
	@Override
	public void insertNode (T element){
		//check if the tree is empty
		if (isEmpty()) {
			root = new Node<T> (element);			
		} else {
			insertNode(root, element);			
		}
	}	
	
	//Here we need to compare the new node to the existing ones
	//and check if the new node is greater (goes to the right) or
	//smaller (goes to the left) of the existing nodes
	private void insertNode(Node<T> current, T element) {
		//Now we need to do comparison
		if (element.compareTo(current.element) > 0) {
			//go to right subtree
			if (current.right == null) {
				current.right = new Node<T> (element);
				return;
			} else {
				//Recursion on the right
				insertNode(current.right, element);
			}
		} else { 
			//go to left subtree
			if (current.left == null) {
				current.left = new Node<T> (element);
				return;
			} else {
				//Recursion on the left
				insertNode(current.left, element);
			}
		}		
	}
	
	
	//This method checks if the binary search tree has elements in it or not
	//In case the root node is empty, the whole tree is empty
	@Override
	public boolean isEmpty() {		
		return root == null;
	}
	
	
	//This method count the number of nodes in the binary search tree
	//and returns an integer
	//The public method calls its private counterpart recursively
	@Override
	public int size() {
		return size(root);
	}
	private int size(Node<T> current) {
		 if (current == null) {//if current element is non-existent
	            return 0;
	     }
		 else {
			 //if the current element exist, there is at least 1 element in the tree
			 //then we recursively step through both subtrees of the current element
			 //and count all the nodes 
			 return 1 + size(current.left) + size(current.right);
		 }
	}
	
	//This method will find the FoodProduct object with the lowest healthIndex value
	//The public method will recursively call its private counterpart
	//The lowest value in a binary search tree is the leftmost element in the left subtree
	
	@Override
	public T minHealthIndex() {
		if (isEmpty()) {
            return null;
        } else {
            return findMin(root);
        }
	}
	
	private T findMin(Node<T> current) {
		if (current.left == null) {
            return current.element;
        } else {
            return findMin(current.left);
        }
	}
	
	//This method will find the FoodProduct object with the highest healthIndex value
	//The public method will recursively call its private counterpart
	//The highest value in a binary search tree is the rightmost element in the right subtree
	
	@Override
	public T maxHealthIndex() {
		if (isEmpty()) {
            return null;
        } else {
            return findMax(root);
        }		
	}
	
	private T findMax(Node<T> current) {
		if (current.right == null) {
            return current.element;
        } else {
            return findMax(current.right);
        }
	}
	
	//This method is one of the binary search tree traversal methods
	//InOrder will traverse the left subtree, then the root and then the right subtree
	//The nodes will be retrieved in ascending order
	@Override
	public void inOrder() {
		 inOrder(root);		
	}
	
	private void inOrder(Node<T> current) {
        if (current == null) {
            return;
        } else

        inOrder(current.left);
        System.out.println(current);
        inOrder(current.right);
    }

}
