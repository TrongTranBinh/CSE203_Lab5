package tranbinhtrong.question1;

import java.util.Scanner;

public class CollegeStudent extends Student  {

    private double graduationExamScore;

    public CollegeStudent() {
    }

    public CollegeStudent(double graduationExamScore) {
        this.graduationExamScore = graduationExamScore;
    }

    public CollegeStudent(double graduationExamScore, String studentNumber, String fullName, int totalNumberCreditsEarned, double averageScore) {
        super(studentNumber, fullName, totalNumberCreditsEarned, averageScore);
        this.graduationExamScore = graduationExamScore;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Graduation Exam Score: ");
        graduationExamScore = sc.nextDouble();
    }

    @Override
    public void output() {
        super.output();
        System.out.print("-Graduation Exam Score: " + graduationExamScore);
    }

    @Override
    public boolean graduation() {
        return (totalNumberCreditsEarned >= 100) || (averageScore >= 5) || (graduationExamScore >= 5);
    }

}
