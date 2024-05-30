package tranbinhtrong.question2;

import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        List list = new List();
        Scanner sc = new Scanner(System.in);
        int menu;
        do {
            System.out.print("What do you want to do:\n1:Enter the list\n2:Edit staff\n3:Remove staff by ID\n4:Total salary all staffs\n5:Total salary by type\n6:Top 3 highest paid staffs\n7:Exit\nEnter: ");
            menu = sc.nextInt();
            switch (menu) {
                case 1 ->
                    list.getList();
                case 2 ->
                    list.edit();
                case 3 ->
                    list.removeStaff();
                case 4 ->
                    list.calculateTotalSalary();
                case 5 ->
                    list.calculateTotalSalaryByType();
                case 6 ->
                    list.findThreeHighestPaid();
            }
        } while (menu != 7);
    }
}
