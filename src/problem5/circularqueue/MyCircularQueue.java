/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;


import problem5.node.Node;
import problem5.student.Student;

//to implement circular queue
public class MyCircularQueue {
    Node front;
    Node rear;
    int count;

    public MyCircularQueue() {
        front = null;
        rear = null;
        count = 0;
    }

    public void enqueue(int roll,int backlog,int appearCount) {
        Student student = new Student(roll,backlog,appearCount);
        Node node = new Node();
        node.setStudent(student);

        if(front==null) {
            front = node;
        }
        else {
            rear.setNext(node);
        }
        rear = node;
        rear.setNext(front);
        count++;
    }

    public void removeBacklog() {
        while(count-->0) {
            Student temp = front.getStudent();
            if((temp.getBacklog()-temp.getAppearCount())>0) {
                front = front.getNext();
                rear = rear.getNext();
            }
            else {
                rear.setNext(front.getNext());
                front = front.getNext();
            }
        }
    }

    public void print() {
        Node temp = front;
        System.out.println();
        while(temp.getNext()!=front) {
            System.out.println(temp.getStudent());
            temp = temp.getNext();
        }
        System.out.println(temp.getStudent());
    }
}
