package escuelaing.edu.co.BST;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BstApplication {

	public static void main(String[] args) {
		// Test the BinarySearchTree with Integer values
        System.out.println("=== Testing BinarySearchTree with Integer values ===");
        BinarySearchTree<Integer> bstInt = new BinarySearchTree<>();
        bstInt.add(50);
        bstInt.add(30);
        bstInt.add(70);
        bstInt.add(20);
        bstInt.add(40);
        bstInt.add(60);
        bstInt.add(80);

        System.out.println("In-Order Traversal (Sorted): " + bstInt.inOrderTraversal());
        System.out.println("Pre-Order Traversal: " + bstInt.preOrderTraversal());
        System.out.println("Post-Order Traversal: " + bstInt.postOrderTraversal());
        System.out.println("Level-Order Traversal: " + bstInt.levelOrderTraversal());
        System.out.println("Min Value: " + bstInt.findMin().value);
        System.out.println("Max Value: " + bstInt.findMax().value);
        System.out.println("Tree Height: " + bstInt.height());
        System.out.println("Is Balanced: " + bstInt.isBalanced());

		bstInt.remove((Integer) 30);
        System.out.println("After removing 30 (In-Order Traversal): " + bstInt.inOrderTraversal());
        System.out.println();

        // Test the BinarySearchTree with String values
        System.out.println("=== Testing BinarySearchTree with String values ===");
        BinarySearchTree<String> bstString = new BinarySearchTree<>();
        bstString.add("banana");
        bstString.add("apple");
        bstString.add("cherry");
        bstString.add("date");
        bstString.add("fig");
        bstString.add("grape");

        System.out.println("In-Order Traversal (Sorted): " + bstString.inOrderTraversal());
        System.out.println("Pre-Order Traversal: " + bstString.preOrderTraversal());
        System.out.println("Post-Order Traversal: " + bstString.postOrderTraversal());
        System.out.println("Level-Order Traversal: " + bstString.levelOrderTraversal());
        System.out.println("Min Value: " + bstString.findMin().value);
        System.out.println("Max Value: " + bstString.findMax().value);
        System.out.println("Tree Height: " + bstString.height());
        System.out.println("Is Balanced: " + bstString.isBalanced());

        bstString.remove("apple");
        System.out.println("After removing 'apple' (In-Order Traversal): " + bstString.inOrderTraversal());
        System.out.println();

        // Test the BinarySearchTree with Double values
        System.out.println("=== Testing BinarySearchTree with Double values ===");
        BinarySearchTree<Double> bstDouble = new BinarySearchTree<>();
        bstDouble.add(25.5);
        bstDouble.add(15.2);
        bstDouble.add(30.8);
        bstDouble.add(12.9);
        bstDouble.add(18.6);
        bstDouble.add(28.3);

        System.out.println("In-Order Traversal (Sorted): " + bstDouble.inOrderTraversal());
        System.out.println("Pre-Order Traversal: " + bstDouble.preOrderTraversal());
        System.out.println("Post-Order Traversal: " + bstDouble.postOrderTraversal());
        System.out.println("Level-Order Traversal: " + bstDouble.levelOrderTraversal());
        System.out.println("Min Value: " + bstDouble.findMin().value);
        System.out.println("Max Value: " + bstDouble.findMax().value);
        System.out.println("Tree Height: " + bstDouble.height());
        System.out.println("Is Balanced: " + bstDouble.isBalanced());

        bstDouble.remove(15.2);
        System.out.println("After removing 15.2 (In-Order Traversal): " + bstDouble.inOrderTraversal());
        System.out.println();
    }
}


