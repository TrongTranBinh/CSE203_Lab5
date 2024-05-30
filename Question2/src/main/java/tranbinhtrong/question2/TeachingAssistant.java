package tranbinhtrong.question2;

import java.util.Scanner;

public class TeachingAssistant extends Staffs {

    private int numberOfAssist;
    private double salary;
    static Scanner sc = new Scanner(System.in);

    public TeachingAssistant() {
        typeOfStaff = "TeachingAssistant";
    }

    public TeachingAssistant(int numberOfAssist, String fullName, String dateOfBirth, String personalID) {
        super(fullName, dateOfBirth, personalID);
        this.numberOfAssist = numberOfAssist;
    }

    public TeachingAssistant(int numberOfAssist) {
        this.numberOfAssist = numberOfAssist;
    }

    private void setNumberOfAssist(int numberOfAssist) {
        this.numberOfAssist = numberOfAssist;
    }

    @Override
    public void input() {
        super.input();
        System.out.print("Number of subject being assisted: ");
        numberOfAssist = sc.nextInt();
    }

    @Override
    public double getSalary() {
        salary = (numberOfAssist * 0.3) * 18000;
        return salary;
    }

    @Override
    public void editStaff() {
        System.out.print("Enter: ");
        setNumberOfAssist(sc.nextInt());
    }
}
