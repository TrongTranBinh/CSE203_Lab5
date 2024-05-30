package tranbinhtrong.question1;

import java.util.Scanner;
import java.io.Serializable;

public abstract class Student implements Serializable {

    protected String studentNumber;
    protected String fullName;
    protected int totalNumberCreditsEarned;
    protected double averageScore;

    public Student() {
    }

    public Student(String studentNumber, String fullName, int totalNumberCreditsEarned, double averageScore) {
        this.studentNumber = studentNumber;
        this.fullName = fullName;
        this.totalNumberCreditsEarned = totalNumberCreditsEarned;
        this.averageScore = averageScore;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Student number: ");
        studentNumber = sc.nextLine();
        System.out.print("Full Name: ");
        fullName = sc.nextLine();
        System.out.print("Total number of credits earned: ");
        totalNumberCreditsEarned = sc.nextInt();
        System.out.print("Average Score: ");
        averageScore = sc.nextDouble();
    }

    public void output() {
        System.out.println("-Student Number: " + studentNumber
                + "\n-Student Full Name: " + fullName
                + "\n-Total number of credits earned: " + totalNumberCreditsEarned
                + "\n-Average Score: " + averageScore);
    }

    public abstract boolean graduation();
}
