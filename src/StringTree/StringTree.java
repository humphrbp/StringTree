package StringTree;


class StringTree {

	Node root;

	StringTree() {
		root = null;

	}

	// This method to insert String into Node
	void AddString(String key) {

		root = AddString(root, key);
		System.out.println("\n");
		printTree(root);
	}

	Node AddString(Node root, String key) {

		if (root == null) {
			root = new Node(key);
			return root;
		}

		if (key.compareTo(root.key) < 0)
			root.left = AddString(root.left, key);
		else if (key.compareTo(root.key) > 0)
			root.right = AddString(root.right, key);
		
		/* return the root */
		return root;
	}

	// Method to Print alphabetically
	void printTree(Node root) {
		if (root != null) {
			printTree(root.left);
			System.out.print(root.key + ", ");
			printTree(root.right);
		}
	}

	void treeins(String arr[]) {

		for (int i = 0; i < arr.length; i++) {
			AddString(arr[i]);

		}

	}

	
}


	


