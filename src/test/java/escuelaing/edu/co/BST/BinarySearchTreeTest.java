package escuelaing.edu.co.BST;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTreeTest {

    private BinarySearchTree<Integer> bstInt;
    private BinarySearchTree<String> bstString;
    private BinarySearchTree<Double> bstDouble;

    @BeforeEach
    public void setUp() {
        bstInt = new BinarySearchTree<>();
        bstString = new BinarySearchTree<>();
        bstDouble = new BinarySearchTree<>();
    }

 
    @Test
    public void testInsertAndInOrderTraversalIntegers() {
        bstInt.add(50);
        bstInt.add(30);
        bstInt.add(70);
        bstInt.add(20);
        bstInt.add(40);
        bstInt.add(60);
        bstInt.add(80);

        String expectedOutput = "20 30 40 50 60 70 80";
        assertEquals(expectedOutput, bstInt.inOrderTraversal());
    }

    @Test
    public void testFindMinAndMaxIntegers() {
        bstInt.add(50);
        bstInt.add(30);
        bstInt.add(70);
        bstInt.add(20);
        bstInt.add(40);
        bstInt.add(60);
        bstInt.add(80);

        assertEquals(20, bstInt.findMin().value);
        assertEquals(80, bstInt.findMax().value);
    }

    @Test
    public void testDeleteAndSizeIntegers() {
        bstInt.add(50);
        bstInt.add(30);
        bstInt.add(70);
        bstInt.add(20);
        bstInt.add(40);

        assertEquals(5, bstInt.size());

        bstInt.remove((Integer) 30);  
        assertEquals(4, bstInt.size()); 
        String expectedOutput = "20 40 50 70";  
        assertEquals(expectedOutput, bstInt.inOrderTraversal());
    }

    @Test
    public void testHeightAndBalanceIntegers() {
        bstInt.add(50);
        bstInt.add(30);
        bstInt.add(70);
        bstInt.add(20);
        bstInt.add(40);

        assertEquals(2, bstInt.height());
        assertTrue(bstInt.isBalanced());

        bstInt.add(10);
        assertFalse(bstInt.isBalanced());
    }

    @Test
    public void testLevelOrderTraversalIntegers() {
        bstInt.add(50);
        bstInt.add(30);
        bstInt.add(70);
        bstInt.add(20);
        bstInt.add(40);
        bstInt.add(60);
        bstInt.add(80);

        String expectedOutput = "50 30 70 20 40 60 80";
        assertEquals(expectedOutput, bstInt.levelOrderTraversal());
    }


    @Test
    public void testInsertAndInOrderTraversalStrings() {
        bstString.add("apple");
        bstString.add("banana");
        bstString.add("cherry");
        bstString.add("date");
        bstString.add("fig");
        bstString.add("grape");

        String expectedOutput = "apple banana cherry date fig grape";
        assertEquals(expectedOutput, bstString.inOrderTraversal());
    }

    @Test
    public void testFindMinAndMaxStrings() {
        bstString.add("apple");
        bstString.add("banana");
        bstString.add("cherry");

        assertEquals("apple", bstString.findMin().value);
        assertEquals("cherry", bstString.findMax().value);
    }

    @Test
    public void testDeleteAndSizeStrings() {
        bstString.add("apple");
        bstString.add("banana");
        bstString.add("cherry");
        bstString.add("date");

        assertEquals(4, bstString.size());

        bstString.remove("banana");
        assertEquals(3, bstString.size());

        String expectedOutput = "apple cherry date";
        assertEquals(expectedOutput, bstString.inOrderTraversal());
    }



    @Test
    public void testLevelOrderTraversalStrings() {
        bstString.add("apple");
        bstString.add("banana");
        bstString.add("cherry");

        String expectedOutput = "apple banana cherry";
        assertEquals(expectedOutput, bstString.levelOrderTraversal());
    }

    // Pruebas con valores decimales
    @Test
    public void testInsertAndInOrderTraversalDoubles() {
        bstDouble.add(50.5);
        bstDouble.add(30.2);
        bstDouble.add(70.8);
        bstDouble.add(20.1);
        bstDouble.add(40.3);

        String expectedOutput = "20.1 30.2 40.3 50.5 70.8";
        assertEquals(expectedOutput, bstDouble.inOrderTraversal());
    }

    @Test
    public void testFindMinAndMaxDoubles() {
        bstDouble.add(50.5);
        bstDouble.add(30.2);
        bstDouble.add(70.8);

        assertEquals(30.2, bstDouble.findMin().value);
        assertEquals(70.8, bstDouble.findMax().value);
    }

    @Test
    public void testDeleteAndSizeDoubles() {
        bstDouble.add(50.5);
        bstDouble.add(30.2);
        bstDouble.add(70.8);
        bstDouble.add(40.3);

        assertEquals(4, bstDouble.size());

        bstDouble.remove(30.2);
        assertEquals(3, bstDouble.size());

        String expectedOutput = "40.3 50.5 70.8";
        assertEquals(expectedOutput, bstDouble.inOrderTraversal());
    }

    @Test
    public void testHeightAndBalanceDoubles() {
        bstDouble.add(50.5);
        bstDouble.add(30.2);
        bstDouble.add(70.8);

        assertEquals(1, bstDouble.height());
        assertTrue(bstDouble.isBalanced());
    }

    @Test
    public void testLevelOrderTraversalDoubles() {
        bstDouble.add(50.5);
        bstDouble.add(30.2);
        bstDouble.add(70.8);

        String expectedOutput = "50.5 30.2 70.8";
        assertEquals(expectedOutput, bstDouble.levelOrderTraversal());
    }
}
