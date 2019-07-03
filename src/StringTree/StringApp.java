package StringTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringApp {

	public static void main(String[] args) throws FileNotFoundException {

		StringTree tree = new StringTree();
		Scanner sc = new Scanner(new File("src/StringTree/sortlist2.txt"));
		List<String> lines = new ArrayList<String>();
		while (sc.hasNextLine()) {
			lines.add(sc.nextLine());
		}
		sc.close();

		String[] arr = lines.toArray(new String[0]);

		/*Adds each string from the .txt file as in insertion sort*/
		tree.treeins(arr);  /*prints tree after each insertion*/
		System.out.println("\n \n *************Final Tree Sorted*****\n");
        tree.printTree(tree.root);  /*prints final Tree*/

	}

}
