/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor

import problem1.node.TreeNode;

public class MyQueue {
    class Node {
        private int data;
        private Node next;

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    Node front;
    Node rear;

    public MyQueue() {
        front = null;
        rear = null;
    }

    public void enqueue(int data) {
        Node node = new Node();
        node.setData(data);
        if(front==null) {
            front = node;
            rear = node;
        }
        else {
            rear.setNext(node);
            rear = node;
        }
    }

    public void preSuccessor(TreeNode root) {
        if(root==null) {
            return;
        }
        else {
            enqueue(root.getData());
            preSuccessor(root.getLeft());
            preSuccessor(root.getRight());
        }
    }

    public void getPreSuccessor() {
        Node temp = front.getNext();
        while(temp!=null) {
            System.out.print(temp.getData()+"\t");
            temp = temp.getNext();
        }
    }
}
