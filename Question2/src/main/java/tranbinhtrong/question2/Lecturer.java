package tranbinhtrong.question2;

import java.util.ArrayList;
import java.util.Scanner;

public class Lecturer extends Staffs {

    private String academicRank;
    private String academicDegree;
    private int yearsOfExperience;
    private double salary;
    static Scanner sc = new Scanner(System.in);

    ArrayList<String> listOfTaught = new ArrayList<>();

    public Lecturer() {
        typeOfStaff = "Lecturer";
    }

    public Lecturer(String academicRank, String academicDegree, int yearsOfExperience, String fullName, String dateOfBirth, String personalID) {
        super(fullName, dateOfBirth, personalID);
        this.academicRank = academicRank;
        this.academicDegree = academicDegree;
        this.yearsOfExperience = yearsOfExperience;
    }

    public Lecturer(String academicRank, String academicDegree, int yearsOfExperience) {
        this.academicRank = academicRank;
        this.academicDegree = academicDegree;
        this.yearsOfExperience = yearsOfExperience;
    }

    private void setAcademicRank(String academicRank) {
        this.academicRank = academicRank;
    }

    private void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    private void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    private void setListOfTaught() {
        System.out.print("Number of subject: ");
        int n = 0;
        System.out.print("Subjects are: ");
        for (int i = 0; i < n; i++) {
            listOfTaught.add(sc.nextLine());
        }
    }

    @Override
    public void input() {
        super.input();
        System.out.print("Academic rank: ");
        academicRank = sc.nextLine();
        System.out.print("Academic degree: ");
        academicDegree = sc.nextLine();
        sc.nextLine();
        System.out.print("Years of teaching experience: ");
        yearsOfExperience = sc.nextInt();
        System.out.print("How many subject has taught? :");
        int n = sc.nextInt();
        System.out.print("Subjects are: ");
        for (int i = 0; i < n; i++) {
            listOfTaught.add(sc.nextLine() + "\n");
        }
    }

    @Override
    public double getSalary() {
        salary = (listOfTaught.size() * yearsOfExperience * 0.12) * 20000;
        return salary;
    }

    @Override
    public void editStaff() {
        int temp = 0;
        while (temp != 6) {
            System.out.print("Which one you want to edit\n1:Full name\n2:Date Of Birth\n3:Years of experience\n4:Academic rank\n5:Academic degree\n6:List of taught subject\n7:Exit\nEnter: ");
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
                    System.out.print("Enter: ");
                    setAcademicRank(sc.nextLine());
                    sc.nextLine();
                }
                case 5 -> {
                    System.out.print("Enter: ");
                    setAcademicDegree(sc.nextLine());
                    sc.nextLine();
                }
                case 6 -> {
                    setListOfTaught();
                    sc.nextLine();
                }
            }
        }
    }
}
