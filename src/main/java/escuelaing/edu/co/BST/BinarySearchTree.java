package escuelaing.edu.co.BST;

import java.util.*;

public class BinarySearchTree<E extends Comparable<E>> implements List<E> {

    /**
     * Represents a node in the binary search tree.
     * Each node contains a value, and references to its left and right children.
     */
    protected class Node {
        E value;
        Node left, right;

        Node(E value) {
            this.value = value;
            left = right = null;
        }
    }

    private Node root;

    public BinarySearchTree() {
        root = null;
    }

    /**
     * Calculates the height of the tree.
     * 
     * @return the height of the tree (the longest path from root to leaf), or -1 if the tree is empty
     */
    public int height() {
        return heightRec(root);
    }

    /**
     * Recursive helper function to calculate the height of a subtree.
     * 
     * @param node the root of the subtree
     * @return the height of the subtree
     */
    private int heightRec(Node node) {
        if (node == null) {
            return -1;
        }
        int leftHeight = heightRec(node.left);
        int rightHeight = heightRec(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    /**
     * Checks if the tree is balanced. A balanced tree has heights of subtrees that differ by no more than one.
     * 
     * @return true if the tree is balanced, false otherwise
     */
    public boolean isBalanced() {
        return isBalancedRec(root) != -1;
    }

    /**
     * Recursive helper function to check if a subtree is balanced.
     * 
     * @param node the root of the subtree
     * @return the height of the subtree if balanced, or -1 if unbalanced
     */
    private int isBalancedRec(Node node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = isBalancedRec(node.left);
        int rightHeight = isBalancedRec(node.right);

        if (leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }
        return Math.max(leftHeight, rightHeight) + 1;
    }

    /**
     * Inserts a value into the binary search tree. Duplicate values are ignored.
     * 
     * @param value the value to insert into the tree
     */
    public void insert(E value) {
        root = insertRec(root, value);
    }

     /**
     * Recursive helper function to insert a value into a subtree.
     * 
     * @param root the root of the subtree
     * @param value the value to insert
     * @return the root of the modified subtree
     */
    private Node insertRec(Node root, E value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value.compareTo(root.value) < 0) {
            root.left = insertRec(root.left, value);
        } else if (value.compareTo(root.value) > 0) {
            root.right = insertRec(root.right, value);
        }
        return root;
    }

    /**
     * Searches for a value in the binary search tree.
     * 
     * @param value the value to search for
     * @return the node containing the value, or null if not found
     */
    public Node search(E value) {
        return searchRec(root, value);
    }

    /**
     * Recursive helper function to search for a value in a subtree.
     * 
     * @param root the root of the subtree
     * @param value the value to search for
     * @return the node containing the value, or null if not found
     */
    private Node searchRec(Node root, E value) {
        if (root == null || root.value.equals(value)) {
            return root;
        }
        return value.compareTo(root.value) < 0 ? searchRec(root.left, value) : searchRec(root.right, value);
    }

     /**
     * Deletes a value from the binary search tree, maintaining the BST property.
     * 
     * @param value the value to delete
     */
    public void delete(E value) {
        root = deleteRec(root, value);
    }

    /**
     * Recursive helper function to delete a value from a subtree.
     * 
     * @param root the root of the subtree
     * @param value the value to delete
     * @return the root of the modified subtree
     */
    private Node deleteRec(Node root, E value) {
        if (root == null)
            return root;

        if (value.compareTo(root.value) < 0) {
            root.left = deleteRec(root.left, value);
        } else if (value.compareTo(root.value) > 0) {
            root.right = deleteRec(root.right, value);
        } else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            root.value = findMin(root.right).value;
            root.right = deleteRec(root.right, root.value);
        }
        return root;
    }

    /**
     * Performs an in-order traversal of the tree (left, root, right).
     * 
     * @return a string representation of the tree in in-order
     */
    public String inOrderTraversal() {
        StringBuilder output = new StringBuilder();
        inOrderRec(root, output);
        return output.toString().trim();
    }

    
    /**
     * Recursive helper method to perform an in-order traversal.
     * 
     * @param root the root of the subtree
     * @param output the string builder to collect values
     */
    private void inOrderRec(Node root, StringBuilder output) {
        if (root != null) {
            inOrderRec(root.left, output);
            output.append(root.value).append(" ");
            inOrderRec(root.right, output);
        }
    }

     /**
     * Performs a pre-order traversal (root, left, right) of the tree.
     * 
     * @return a string representation of the tree
     */
    public String preOrderTraversal() {
        StringBuilder output = new StringBuilder();
        preOrderRec(root, output);
        return output.toString().trim();
    }

     /**
     * Recursive helper method to perform a pre-order traversal.
     * 
     * @param root the root of the subtree
     * @param output the string builder to collect values
     */
    private void preOrderRec(Node root, StringBuilder output) {
        if (root != null) {
            output.append(root.value).append(" ");
            preOrderRec(root.left, output);
            preOrderRec(root.right, output);
        }
    }

    /**
     * Performs a post-order traversal (left, right, root) of the tree.
     * 
     * @return a string representation of the tree
     */
    public String postOrderTraversal() {
        StringBuilder output = new StringBuilder();
        postOrderRec(root, output);
        return output.toString().trim();
    }

    /**
     * Recursive helper method to perform a post-order traversal.
     * 
     * @param root the root of the subtree
     * @param output the string builder to collect values
     */
    private void postOrderRec(Node root, StringBuilder output) {
        if (root != null) {
            postOrderRec(root.left, output);
            postOrderRec(root.right, output);
            output.append(root.value).append(" ");
        }
    }

    /**
     * Performs a level-order traversal (breadth-first search) of the tree.
     * 
     * @return a string representation of the tree in level order
     */
    public String levelOrderTraversal() {
        if (root == null) return "";
        Queue<Node> queue = new LinkedList<>();
        StringBuilder output = new StringBuilder();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            output.append(current.value).append(" ");
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
        return output.toString().trim();
    }

    /**
     * Finds the node with the minimum value in the tree.
     * 
     * @return the node with the smallest value
     */
    public Node findMin() {
        return findMin(root);
    }

    /**
     * Recursive helper method to find the minimum value in a subtree.
     * 
     * @param root the root of the subtree
     * @return the node with the minimum value
     */
    private Node findMin(Node root) {
        if (root == null || root.left == null)
            return root;
        return findMin(root.left);
    }

    
    /**
     * Finds the node with the maximum value in the tree.
     * 
     * @return the node with the largest value
     */
    public Node findMax() {
        return findMax(root);
    }

     /**
     * Recursive helper method to find the maximum value in a subtree.
     * 
     * @param root the root of the subtree
     * @return the node with the maximum value
     */
    private Node findMax(Node root) {
        if (root == null || root.right == null)
            return root;
        return findMax(root.right);
    }

    /**
     * Adds a value to the tree. This method is part of the List interface.
     * 
     * @param value the value to add
     * @return true, as the value is always added to the tree
     */
    @Override
    public boolean add(E value) {
        insert(value);
        return true;
    }

    
    /**
     * Checks if the tree contains a value.
     * 
     * @param o the value to check
     * @return true if the tree contains the value, false otherwise
     */
    @Override
    public boolean contains(Object o) {
        return search((E) o) != null;
    }

    /**
     * Returns the number of nodes in the tree.
     * 
     * @return the size of the tree
     */
    @Override
    public int size() {
        return countNodes(root);
    }

    /**
     * Recursive helper method to count the nodes in a subtree.
     * 
     * @param root the root of the subtree
     * @return the number of nodes in the subtree
     */
    private int countNodes(Node root) {
        if (root == null)
            return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }


    /**
     * Checks if the tree is empty.
     * 
     * @return true if the tree has no elements, false otherwise
     */
    @Override
    public boolean isEmpty() {
        return root == null;
    }

    /**
     * Returns an iterator over the elements in this tree in ascending order.
     * 
     * @return an iterator over the tree
     */
    @Override
    public Iterator<E> iterator() {
        List<E> values = new LinkedList<>();
        inOrderTraversalToList(root, values);
        return values.iterator();
    }

    /**
     * Helper method to collect the values from an in-order traversal into a list.
     * 
     * @param node the root of the subtree
     * @param values the list to collect the values
     */
    private void inOrderTraversalToList(Node node, List<E> values) {
        if (node != null) {
            inOrderTraversalToList(node.left, values);
            values.add(node.value);
            inOrderTraversalToList(node.right, values);
        }
    }

    /**
     * Converts the elements of the tree into an array.
     * 
     * @return an array containing the tree elements in ascending order
     */
    @Override
    public Object[] toArray() {
        List<E> values = new LinkedList<>();
        inOrderTraversalToList(root, values);
        return values.toArray();
    }

    /**
     * Converts the elements of the tree into an array of a specified type.
     * 
     * @param <T> the runtime type of the array to contain the elements
     * @param a the array into which the elements will be stored
     * @return an array containing the tree elements in ascending order
     */
    @Override
    public <T> T[] toArray(T[] a) {
        List<E> values = new LinkedList<>();
        inOrderTraversalToList(root, values);
        return values.toArray(a);
    }

    // The following List interface methods are not supported by the Binary Search Tree

    @Override
    public E get(int index) {
        throw new UnsupportedOperationException("El método get con índice no es soportado en un árbol binario.");
    }

    @Override
    public E set(int index, E element) {
        throw new UnsupportedOperationException("El método set con índice no es soportado en un árbol binario.");
    }

    @Override
    public void add(int index, E element) {
        throw new UnsupportedOperationException("El método add con índice no es soportado en un árbol binario.");
    }

    @Override
    public E remove(int index) {
        throw new UnsupportedOperationException("El método remove con índice no es soportado en un árbol binario.");
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException("El método indexOf no es soportado en un árbol binario.");
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("El método lastIndexOf no es soportado en un árbol binario.");
    }

    @Override
    public ListIterator<E> listIterator() {
        throw new UnsupportedOperationException("El método listIterator no es soportado en un árbol binario.");
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        throw new UnsupportedOperationException("El método listIterator con índice no es soportado en un árbol binario.");
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("El método subList no es soportado en un árbol binario.");
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object element : c) {
            if (!contains(element)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        for (E element : c) {
            add(element);
        }
        return true;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        throw new UnsupportedOperationException("El método addAll con índice no es soportado en un árbol binario.");
    }

    @Override
    public boolean remove(Object o) {
        delete((E) o);
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        for (Object element : c) {
            remove(element);
        }
        return true;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("El método retainAll no es soportado en un árbol binario.");
    }

    @Override
    public void clear() {
        root = null;
    }
}
