# Binary Search Tree (BST) Implementation

This project implements a generic **Binary Search Tree (BST)** in Java, which adheres to the Java `List` interface. The BST provides efficient operations for insertion, deletion, searching, and traversals while supporting multiple data types using Java generics. It includes functionalities to check if the tree is balanced, calculate its height, and perform level-order, in-order, pre-order, and post-order traversals.

### Key Features Implemented

1. **Insertion (insert)**
   - **Purpose**: Adds a new node to the tree while maintaining the binary tree properties. Each new value is placed in the correct position to ensure the tree's structure remains valid.
   - **Implementation**: The method is recursive and places the value in the left or right subtree depending on its comparison to the current node.

2. **Search (search)**
   - **Purpose**: Finds and returns the node containing the specified value, or returns `null` if the value is not present in the tree.
   - **Implementation**: The method traverses the tree recursively, comparing the target value with the current node to find the desired node.

3. **Deletion (delete)**
   - **Purpose**: Removes a node while maintaining the BST properties. It handles three cases: deleting a leaf node, a node with one child, and a node with two children.
   - **Implementation**: For nodes with two children, the in-order successor or predecessor is used to replace the node, ensuring the tree's structure is maintained.

4. **Traversal Methods**
   - **In-order Traversal (inOrderTraversal)**: Visits nodes in ascending order. This method is used to produce a sorted sequence of node values.
   - **Pre-order Traversal (preOrderTraversal)**: Visits the root first, followed by the left and right subtrees.
   - **Post-order Traversal (postOrderTraversal)**: Visits the left and right subtrees first, then the root. Useful for freeing or deleting nodes.
   - **Level-order Traversal (levelOrderTraversal)**: Visits all nodes at each level, starting from the root, using a queue for breadth-first traversal.

5. **Find Minimum (findMin)**
   - **Purpose**: Finds the smallest value in the tree, which is located at the leftmost node.
   - **Implementation**: The method recursively traverses the left subtree to find and return the leftmost node.

6. **Find Maximum (findMax)**
   - **Purpose**: Finds the largest value in the tree, located at the rightmost node.
   - **Implementation**: The method traverses the right subtree to find and return the rightmost node.

7. **Height (height)**
   - **Purpose**: Calculates the height of the tree, defined as the longest path from the root to any leaf.
   - **Implementation**: This recursive method computes the height of the left and right subtrees and returns the greater value plus one for the current node.

8. **Check if the Tree is Balanced (isBalanced)**
   - **Purpose**: Determines if the tree is balanced by comparing the height of its left and right subtrees.
   - **Implementation**: The method recursively checks each subtree and returns `true` if the height difference between left and right is at most one for all nodes.

9. **Level-Order Traversal (levelOrderTraversal)**
   - **Purpose**: Traverses the tree level by level starting from the root, using a breadth-first search.
   - **Implementation**: This function uses a queue to process each node, visiting all nodes at each level before moving to the next level.

10. **Clear (clear)**
    - **Purpose**: Removes all nodes from the tree, effectively making it empty.
    - **Implementation**: The method sets the root node to `null`, clearing the entire tree.

11. **Count Nodes (countNodes)**
    - **Purpose**: Returns the total number of nodes present in the tree.
    - **Implementation**: This function recursively traverses the tree, counting each node as it traverses both the left and right subtrees.

### Additional Implemented Functions

- **toArray**: Converts the tree to an array, allowing for easier manipulation of its elements outside the tree structure.
- **contains**: Checks if a specific value exists in the tree using the `search` function.
- **size**: Returns the total number of nodes in the tree, leveraging the `countNodes` method.
- **iterator**: Provides an in-order iterator for traversing the tree in sorted order.

### Why These Functions Were Implemented

The fundamental operations like insertion, search, deletion, and traversal are essential for ensuring that the Binary Search Tree (BST) operates as expected. Traversal methods like in-order traversal are especially useful when the tree is being used to store and retrieve sorted data. Additionally, support for generic types (`Integer`, `String`, `Double`) increases the flexibility of the tree for different use cases.

Other auxiliary functions like `clear`, `countNodes`, and `levelOrderTraversal` provide utility and ensure that the tree can be effectively managed, cleaned, and navigated in various applications. By adhering to the Java `List` interface, the tree becomes more compatible with Java's collection framework, allowing for easier integration into larger projects.


## Getting Started

These instructions will get you a copy of the project up and running on your local machine

### Prerequisites

You need to install the following tools and configure their dependencies:

1. **Java (version 17)**
    ```sh
    java -version
    ```
    Should return something like:
    ```sh
    java version "17.0.7"
    OpenJDK Runtime Environment (build 17.0.7+7-LTS)
    OpenJDK 64-Bit Server VM (build 17.0.7+7-LTS, mixed mode, sharing)
    ```

2. **Maven**
    - Download Maven from [here](http://maven.apache.org/download.html)
    - Follow the installation instructions [here](http://maven.apache.org/download.html#Installation)

    Verify the installation:
    ```sh
    mvn -version
    ```
    Should return something like:
    ```sh
    Apache Maven 3.2.5 (12a6b3acb947671f09b81f49094c53f426d8cea1; 2014-12-14T12:29:23-05:00)
    Maven home: /Users/dnielben/Applications/apache-maven-3.2.5
    Java version: 1.8.0, vendor: Oracle Corporation
    Java home: /Library/Java/JavaVirtualMachines/jdk1.8.0.jdk/Contents/Home/jre
    Default locale: es_ES, platform encoding: UTF-8
    OS name: "mac os x", version: "10.10.1", arch: "x86_64", family: "mac"
    ```


3. **Git**
    - Install Git by following the instructions [here](http://git-scm.com/book/en/v2/Getting-Started-Installing-Git)

    Verify the installation:
    ```sh
    git --version
    ```
    Should return something like:
    ```sh
    git version 2.31.1
    ```
---

## How to Use the Binary Search Tree

This Binary Search Tree (BST) implementation allows users to insert, delete, search, and traverse nodes. It supports various data types using Java generics, enabling operations on integers, strings, doubles, and more.

### Features:
1. **Insert Values**: Add values to the tree while maintaining BST properties.
2. **Delete Values**: Remove values from the tree while preserving its structure.
3. **Search Values**: Find specific values within the tree.
4. **Traversals**:
   - In-order: Ascending order for numbers.
   - Pre-order: Root node first.
   - Post-order: Root node last.
   - Level-order: Breadth-first traversal.
5. **Tree Properties**:
   - Calculate the height of the tree.
   - Check if the tree is balanced.
6. **Support for Different Data Types**: Perform the above operations on different data types (e.g., `Integer`, `String`, `Double`).



## Running the Project 

### Steps to Run:

1. **Clone the repository**:
    ```sh
    git clone https://github.com/alexandrac1420/BinarySearchTree.git
    cd BinarySearchTree
    ```

2. **Build the project using Maven**:
    ```sh
    mvn package
    ```

3. **Run the application**:
    ```sh
    java -jar target/BST-0.0.1-SNAPSHOT.jar
    ```

4. **Test the application**:
    You can use the `main` method to test the implementation with different data types (e.g., `Integer`, `String`, `Double`).
   ![image](https://github.com/user-attachments/assets/b6c3dc4b-5130-4cc9-b14f-5dd09e13edd5)

---

## Sample Main Method

Here is an example of how to test the `BinarySearchTree` with different data types:

```java
package escuelaing.edu.co.BST;

public class BinarySearchTreeMain {

    public static void main(String[] args) {
        // Test the BinarySearchTree with Integer values
        BinarySearchTree<Integer> bstInt = new BinarySearchTree<>();
        bstInt.add(50);
        bstInt.add(30);
        bstInt.add(70);
        System.out.println("In-Order Traversal (Integers): " + bstInt.inOrderTraversal());

        // Test the BinarySearchTree with String values
        BinarySearchTree<String> bstString = new BinarySearchTree<>();
        bstString.add("apple");
        bstString.add("banana");
        bstString.add("cherry");
        System.out.println("In-Order Traversal (Strings): " + bstString.inOrderTraversal());

        // Test the BinarySearchTree with Double values
        BinarySearchTree<Double> bstDouble = new BinarySearchTree<>();
        bstDouble.add(1.1);
        bstDouble.add(2.2);
        bstDouble.add(3.3);
        System.out.println("In-Order Traversal (Doubles): " + bstDouble.inOrderTraversal());
    }
}
```


## Test Report

### Author
Name: Alexandra Cortes Tovar

### Date
Date: 17/10/2024

### Summary

This report outlines the unit and integration tests conducted for the **Binary Search Tree (BST)** project. The tests focus on ensuring that the fundamental operations such as **Insert**, **Delete**, **Search**, and **Tree Traversals** work as expected across different data types (`Integer`, `String`, `Double`). The tree's height and balance checks, as well as its ability to handle various types of inputs, are also validated. 

### Tests Conducted

#### Core BST Functionality Tests

1. **Test `testInsertAndInOrderTraversal`**
   - **Description**: Ensures that elements can be inserted into the BST and validates the in-order traversal (which should return a sorted sequence of elements).
   - **Objective**: Verify the correct placement of nodes following BST rules and confirm that in-order traversal correctly sorts the values.
   - **Testing Scenario**: Insert values into the BST and check if in-order traversal produces a sorted sequence.
   - **Expected Behavior**: The values are sorted correctly after insertion.
   - **Verification**: Confirms that the output of in-order traversal matches the expected sorted sequence for different data types (`Integer`, `String`, `Double`).

2. **Test `testFindMinAndMax`**
   - **Description**: Tests the ability to find the minimum and maximum values in the tree.
   - **Objective**: Ensure that the `findMin` and `findMax` functions return the smallest and largest elements, respectively.
   - **Testing Scenario**: Insert values into the tree and find the minimum and maximum elements.
   - **Expected Behavior**: The minimum and maximum values are correctly identified.
   - **Verification**: Validates that the minimum and maximum functions return the expected values for `Integer`, `String`, and `Double`.

3. **Test `testDelete`**
   - **Description**: Tests the deletion of nodes from the tree and ensures that the structure is maintained.
   - **Objective**: Validate that nodes are properly removed from the tree and that the BST properties are preserved after deletion.
   - **Testing Scenario**: Delete leaf nodes, nodes with one child, and nodes with two children.
   - **Expected Behavior**: The node is deleted, and the remaining tree is correctly restructured.
   - **Verification**: Confirms that deletions are handled correctly, and the tree is rebalanced after each deletion.

4. **Test `testHeight`**
   - **Description**: Verifies the calculation of the tree's height.
   - **Objective**: Ensure that the tree height is calculated correctly as the maximum depth from the root to the farthest leaf node.
   - **Testing Scenario**: Insert values into the tree and calculate the height.
   - **Expected Behavior**: The height matches the expected value based on the tree's structure.
   - **Verification**: Confirms that the height of the tree is correct for different insertion sequences.

5. **Test `testIsBalanced`**
   - **Description**: Checks if the tree is balanced.
   - **Objective**: Ensure that the `isBalanced` function correctly identifies whether the tree is balanced.
   - **Testing Scenario**: Insert values and verify if the tree remains balanced.
   - **Expected Behavior**: The tree is identified as balanced or unbalanced correctly.
   - **Verification**: Confirms that the function returns the correct result based on the structure of the tree.

6. **Test `testLevelOrderTraversal`**
   - **Description**: Verifies the level-order traversal (breadth-first traversal) of the tree.
   - **Objective**: Ensure that the level-order traversal correctly visits nodes level by level, from the root to the leaves.
   - **Testing Scenario**: Perform level-order traversal after inserting values into the tree.
   - **Expected Behavior**: Nodes are visited in the correct level-order sequence.
   - **Verification**: Confirms that the output matches the expected order for trees with different values.

---

### Data Type Support Tests

1. **Test `testInsertAndInOrderTraversalIntegers`**
   - **Description**: Validates insertion and in-order traversal using `Integer` values.
   - **Expected Behavior**: In-order traversal returns a sorted sequence of integers.
   
2. **Test `testInsertAndInOrderTraversalStrings`**
   - **Description**: Tests insertion and in-order traversal using `String` values.
   - **Expected Behavior**: In-order traversal returns a sorted sequence of strings.
   
3. **Test `testInsertAndInOrderTraversalDoubles`**
   - **Description**: Tests insertion and in-order traversal using `Double` values.
   - **Expected Behavior**: In-order traversal returns a sorted sequence of doubles.

4. **Test `testFindMinAndMaxIntegers`**
   - **Description**: Ensures that minimum and maximum values can be found in a tree of `Integer` values.
   
5. **Test `testFindMinAndMaxStrings`**
   - **Description**: Ensures that minimum and maximum values can be found in a tree of `String` values.

6. **Test `testFindMinAndMaxDoubles`**
   - **Description**: Ensures that minimum and maximum values can be found in a tree of `Double` values.

---

### Coverage Report

- **Insertions**: All tests cover insertions across different data types, ensuring that the tree maintains its structure regardless of the type of data inserted.
- **Deletions**: Deletion tests verify correct behavior when removing leaf nodes, nodes with one child, and nodes with two children.
- **Traversals**: In-order, pre-order, post-order, and level-order traversals are tested across multiple types to ensure traversal correctness.
- **Height and Balance**: Both the height and balance functionalities are tested to ensure the tree's structural integrity is maintained.
- **Data Type Flexibility**: Tests are conducted for `Integer`, `String`, and `Double` to confirm that the implementation handles generics correctly.


![Test report](https://github.com/user-attachments/assets/a635acf0-9d2b-4636-95a6-aa136b9ff3a4)



## Built With

* [Maven](https://maven.apache.org/) - Dependency Management
* [Spring Boot](https://spring.io/projects/spring-boot) - Backend Framework
* [Git](http://git-scm.com/) - Version Control System

## Versioning

I use [GitHub](https://github.com/) for versioning. For the versions available, see the [tags on this repository](https://github.com/alexandrac1420/BinarySearchTree.git)

## Authors

* **Alexandra Cortes Tovar** - [alexandrac1420](https://github.com/alexandrac1420)

## License

This project is licensed under the GNU
