package com.bridgelabz.binarysearchtree;
public class BinarySearchTree {
    Node root;
    /**
     * inserting nodes by using iterative approach.
     * @param data
     */
    public void insert(int data){
            Node node = new Node(data);
            if(root==null){
                root=node;
                return;
            }
            else{
                Node currentNode=root,parentNode;
                while (true){
                    parentNode=currentNode;
                    if(data<currentNode.data){
                        currentNode=currentNode.left;
                        if(currentNode==null){
                            parentNode.left=node;
                            return;
                        }
                    }
                    else{
                        currentNode=currentNode.right;
                        if(currentNode==null){
                            parentNode.right=node;
                            return;
                        }
                    }
                }
            }
        }
    /**
     * Searching a particular node using searchNode Method
     * @param root
     * @param key
     */
    public static void searchNode(Node root, int key)
    {
        Node currentNode= root;
        Node parentNode = null;
        while (currentNode!= null && currentNode.data != key)
        {
            parentNode = currentNode;
            if (key < currentNode.data) {
                currentNode = currentNode.left;
            }
            else {
                currentNode = currentNode.right;
            }
        }
        if (parentNode == null) {
            System.out.print("The node with key " + key + " is root node");
        }
        else if (key < parentNode.data) {
            System.out.print("The given key is the left node of the node with key " + parentNode.data);
        }
        else {
            System.out.print("The given key is the right node of the node with key " + parentNode.data);
        }
    }
    /**
     * printing the elements by using in order traversal approach.
     * @param node
     */
    public void inOrderTraversal(Node node){
            if(root==null){
                System.out.println("Tree is Empty");
                return;
            }
            else{
                if(node.left!=null)
                    inOrderTraversal(node.left);
                System.out.println(node.data);
                if(node.right!=null)
                    inOrderTraversal(node.right);
            }
    }
}
