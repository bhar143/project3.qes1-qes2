package project3.com;




public class DriverBTS {

	public static void main(String[] args) {
	
		BinaryToSkewed  n = new BinaryToSkewed ();
		Node root = new Node(50);
		Node node1 = new Node(30);
		Node node2 = new Node(60);
		Node node3 = new Node(10);
		Node node4 = new Node(40);
		
		//Linking nodes
		root.left = node1;
		root.right = node2;
		node1.left = node3;
		node1.right = node4;
		
		n.BToS (root, 0);
		n.traverseRightSkewed(n.headNode);


	}

}
