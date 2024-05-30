package tranbinhtrong.question2;

import java.util.Scanner;

public abstract class Staffs {

    protected String fullName;
    protected String dateOfBirth;
    protected String personalID;
    protected String typeOfStaff;

    public Staffs(String fullName, String dateOfBirth, String personalID) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.personalID = personalID;
    }

    public Staffs() {
    }

    protected String getFullName() {
        return fullName;
    }

    protected String getPersonalID() {
        return personalID;
    }

    protected String getTypeOfStaff() {
        return typeOfStaff;
    }

    protected void setFullName(String fullName) {
        this.fullName = fullName;
    }

    protected void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Full Name: ");
        fullName = sc.nextLine();
        System.out.print("Date of birth (DD/MM/YY): ");
        dateOfBirth = sc.nextLine();
        System.out.print("Personal ID: ");
        personalID = sc.nextLine();
    }

    public abstract double getSalary();

    public abstract void editStaff();
}
