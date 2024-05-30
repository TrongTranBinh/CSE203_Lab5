package tranbinhtrong.question2;

import java.util.ArrayList;
import java.util.Scanner;
import static tranbinhtrong.question2.Lecturer.sc;

public class Specialist extends Staffs {

    private ArrayList<String> listOfEducationalSub = new ArrayList<>();
    private int yearsOfExperience;
    private double salary;

    public Specialist() {
        typeOfStaff = "Specialist";
    }

    public Specialist(int yearsOfExperience, String fullName, String dateOfBirth, String personalID) {
        super(fullName, dateOfBirth, personalID);
        this.yearsOfExperience = yearsOfExperience;
    }

    public Specialist(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    private void setListOfEducationalSub() {
        System.out.print("Number of subject: ");
        int n = 0;
        System.out.print("Subjects are: ");
        for (int i = 0; i < n; i++) {
            listOfEducationalSub.add(sc.nextLine());
        }
    }

    private void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of educational subject: ");
        int n = sc.nextInt();
        System.out.print("Subjects code are: ");
        for (int i = 0; i < n; i++) {
            listOfEducationalSub.add(sc.nextLine());
        }
        System.out.print("Year of experience: ");
        yearsOfExperience = sc.nextInt();
    }

    @Override
    public double getSalary() {
        int count = 0;
        for (int i = 0; i < listOfEducationalSub.size(); i++) {
            if (listOfEducationalSub.get(i).startsWith("T")) {
                count += 1;
            }
        }
        salary = (yearsOfExperience * 2 + count) * 20000;
        return salary;
    }

    @Override
    public void editStaff() {
        int temp = 0;
        while (temp != 5) {
            System.out.print("Which one you want to edit\n1:Full name\n2:Date Of Birth\n3:Years of experience\n4:Subject Researched\n5:Exit\nEnter: ");
            temp = sc.nextInt();
            switch (temp) {
                case 1 -> {
                    System.out.print("Enter: ");
                    setFullName(sc.nextLine());
                }
                case 2 -> {
                    System.out.print("Enter: ");
                    setDateOfBirth(sc.nextLine());
                    sc.nextLine();
                }
                case 3 -> {
                    System.out.print("Enter: ");
                    setYearsOfExperience(sc.nextInt());
                }
                case 4 -> {
                    setListOfEducationalSub();
                    sc.nextLine();
                }

            }
        }
    }
}
