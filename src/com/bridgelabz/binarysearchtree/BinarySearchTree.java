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
