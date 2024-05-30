package tranbinhtrong.question1;

import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        List list = new List();
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        sb.append("\nWhat do you want to do?\n"
                + "1: Add a new college student\n"
                + "2: Add a new university student\n"
                + "3: Remove a student from the list with the student code entered from the keyboard\n"
                + "4: Print student list\n"
                + "5: Print the list of students eligible for graduation and indicate the number of eligible students\n"
                + "6: Sort the student list ascending by Student type (College, university) and student code\n"
                + "7: Find student list by student's full name(Contains)\n"
                + "8: Exit\nInput: ");
        int n;
        do {
            System.out.print(sb);
            n = sc.nextInt();
            switch (n) {
                case 1 ->
                    list.addCollegeStudent();
                case 2 ->
                    list.addUniversityStudent();
                case 3 ->
                    list.remove();
                case 4 ->
                    list.print();
                case 5 ->
                    list.printEligibleStudent();
                case 6 ->
                    list.sort();
                case 7 ->
                    list.findStudentName();
            }
        } while (n != 8);
    }
}
