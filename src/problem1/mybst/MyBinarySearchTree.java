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


}
