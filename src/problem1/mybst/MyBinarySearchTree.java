/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

// to implement BinarySearchTree
public class MyBinarySearchTree {
    TreeNode root;
    int count;

    public MyBinarySearchTree() {
        root = null;
        count = 0;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void insert(int data) {
        TreeNode tn = new TreeNode(data);
        tn.setData(data);
        if(root == null) {
            root = tn;
        }
        else {
            TreeNode temp = root;
            while(true) {
                if(data > temp.getData()) {
                    if(temp.getRight()==null) {
                        temp.setRight(tn);
                        break;
                    }
                    else {
                        temp = temp.getRight();
                    }
                }
                else {
                    if(temp.getLeft()==null) {
                        temp.setLeft(tn);
                        break;
                    }
                    else {
                        temp = temp.getLeft();
                    }
                }
            }
        }
    }
    private void LeftNode(TreeNode root) {
        if(root==null) {
            return;
        }
        else {
            if(root.getLeft()!=null) {
                System.out.println(root.getLeft().getData());
            }
            else {
                count++;
            }
            LeftNode(root.getLeft());
            LeftNode(root.getRight());
        }
    }

    public void printLeftNode() {
        LeftNode(root);
    }

    public void count() {
        System.out.println(count);
    }

    public void preOrder(TreeNode root) {
        if(root == null) {
            return;
        }
        else {
            System.out.print(root.getData()+"\t");
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }
    }

    public void postOrder(TreeNode root) {
        if(root==null) {
            return;
        }
        else {
            postOrder(root.getLeft());
            postOrder(root.getRight());
            System.out.print(root.getData()+"\t");
        }
    }

    public void preVSpost() {
        postOrder(root);
        System.out.println();
        preOrder(root);
    }
}

