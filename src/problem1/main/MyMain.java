/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree obj = new MyBinarySearchTree();
        obj.insert(10);
        obj.insert(20);
        obj.insert(5);
        obj.insert(6);
        obj.insert(1);
        obj.insert(50);
        obj.insert(35);
        System.out.println("Left Nodes: ");
        obj.printLeftNode();
        System.out.println("Count of nodes not having left node");
        obj.count();
    }
}
