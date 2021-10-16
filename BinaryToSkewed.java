package project3.com;


class Node{
	Node left;
	Node right;
	int val;
	
	Node(int data){
			
        val = data;
        left = null;
        right = null;
	}
}

public class BinaryToSkewed {
    static Node node;
	static Node prevNode = null;
	static Node headNode = null;

//Function to binary tree
// search tree into a skewed tree
	public static void BToS(Node root, int order) {
		
		//Base Case
		if(root == null) {
		  
			return;
		}
			
		if(order > 0) {
			BToS(root.right,order);
		}else {
			BToS(root.left,order);
		}
		
		
		Node rightnode = root.right;
		Node leftnode = root.left;
		
		
		// Condition to check if the root Node
		// of the skewed tree is not defined
		
			if(headNode == null) {
				headNode = root;
				root.left = null;
				prevNode = root;
			}else {
				prevNode.right = root;
				root.left = null;
				prevNode = root;
			}
		 
		//Similarly recurse for the left/right
			//subtree on the basis of the order required
			if(order > 0) {
				BToS(leftnode,order);
			}else {
				BToS(rightnode,order);
			}
	}
	//skewed tree using recursion
	static void traverseRightSkewed(Node root) {
		if(root == null) {
			return;
		}
		System.out.println(root.val + " ");
		traverseRightSkewed(root.right);
	}
	
	
}

