package com.bridgelabz.binarysearchtree;

public class Runner {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(56);
        bst.insert(30);
        bst.insert(70);
        bst.inOrderTraversal(bst.root);
    }
}

