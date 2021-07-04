package com.bridgelabz.binarysearchtree;

public class Runner {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(56);
        bst.insert(30);
        bst.insert(70);
        System.out.println("\nBinary search tree after insertion:");
        bst.inOrderTraversal(bst.root);

        BinarySearchTree bst1 = new BinarySearchTree();
        bst1.insert(56);
        bst1.insert(30);
        bst1.insert(70);
        bst1.insert(22);
        bst1.insert(40);
        bst1.insert(60);
        bst1.insert(95);
        bst1.insert(11);
        bst1.insert(3);
        bst1.insert(16);
        bst1.insert(65);
        bst1.insert(63);
        bst1.insert(67);
        System.out.println("\nBinary search tree after insertion:");
        bst.inOrderTraversal(bst1.root);
    }
}

