package tranbinhtrong.question1;

import java.util.Scanner;

public class UniversityStudent extends Student {

    private String thesisName;
    private Double thesisScore;

    public UniversityStudent() {
    }

    public UniversityStudent(String thesisName, Double thesisScore) {
        this.thesisName = thesisName;
        this.thesisScore = thesisScore;
    }

    public UniversityStudent(String thesisName, Double thesisScore, String studentNumber, String fullName, int totalNumberCreditsEarned, double averageScore) {
        super(studentNumber, fullName, totalNumberCreditsEarned, averageScore);
        this.thesisName = thesisName;
        this.thesisScore = thesisScore;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Thesis name: ");
        thesisName = sc.nextLine();
        System.out.print("Thesis Score: ");
        thesisScore = sc.nextDouble();
    }

    @Override
    public void output() {
        super.output();
        System.out.print("-Thesis Name: " + thesisName + "\n-Thesis Score: " + thesisScore);
    }

    @Override
    public boolean graduation() {
        return (totalNumberCreditsEarned >= 150) || (averageScore >= 5) || (thesisScore >= 5);
    }
}
