package bst;

//Java code for the second problem - Modifying Binary Search Tree
public class ModifyBST {
	Node root;
	private Node node;

	Node modifyBST(Node node) {
		if (node == null) {
			return null;
		}

		node.left = null;
		modifyBST(node.right);

		return node;
	}

	void inOrder(Node node) {
		if (node != null) {
			inOrder(node.left);
			System.out.print(node.data + " ");
			inOrder(node.right);
		}
	}

	public static void main(String[] args) {
		ModifyBST tree = new ModifyBST();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);

		tree.modifyBST(tree.root);
		tree.inOrder(tree.root);
	}
}
