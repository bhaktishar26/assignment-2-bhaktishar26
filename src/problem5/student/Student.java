/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.student;
// to store student information and properties
public class Student {
    private int roll;
    private int backlog;
    private int appearCount;

    public Student(int roll,int backlog,int appearCount) {
        this.roll = roll;
        this.backlog = backlog;
        this.appearCount = appearCount;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getBacklog() {
        return backlog;
    }

    public void setBacklog(int backlog) {
        this.backlog = backlog;
    }

    public int getAppearCount() {
        return appearCount;
    }

    public void setAppearCount(int appearCount) {
        this.appearCount = appearCount;
    }

    public String toString() {
        return "Student("+"roll= "+getRoll()+", backlog= "+getBacklog()+", appearing count= "+
                getAppearCount()+")";
    }
}
