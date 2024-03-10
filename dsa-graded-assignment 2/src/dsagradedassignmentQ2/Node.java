package dsagradedassignmentQ2;

public class Node {

	int data;
	
	public Node left;
	public Node right;

	Node(int L) {
		this.data = L;
		this.left = this.right = null;
	}
}