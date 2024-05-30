package tranbinhtrong.question2;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class List {

    private ArrayList<Staffs> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public List() {
    }

    public void getList() {
        System.out.print("Number of staff: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Which type of staffs do you want to add: \n1:Lecturer\n2:Assistant\n3:Researcher\n4:Specialist\nEnter: ");
            int temp = sc.nextInt();
            switch (temp) {
                case 1 -> {
                    Lecturer lec = new Lecturer();
                    lec.input();
                    list.add(lec);
                }
                case 2 -> {
                    TeachingAssistant ast = new TeachingAssistant();
                    ast.input();
                    list.add(ast);
                }
                case 3 -> {
                    Researcher re = new Researcher();
                    re.input();
                    list.add(re);
                }
                case 4 -> {
                    Specialist spe = new Specialist();
                    spe.input();
                    list.add(spe);
                }
            }
        }
    }

    public void edit() {
        System.out.print("Enter ID: ");
        String id = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPersonalID().equalsIgnoreCase(id)) {
                list.get(i).editStaff();
                break;
            }
        }
    }

    public void removeStaff() {
        System.out.print("Enter ID: ");
        String id = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPersonalID().equalsIgnoreCase(id)) {
                list.remove(i);
                System.out.print("Removed!");
                break;
            }
        }
    }

    public void calculateTotalSalary() {
        double total = 0;
        for (Staffs s : list) {
            total += s.getSalary();
        }
        File f = new File("\\Desktop\\totalSalary.txt");
        try {
            FileWriter fw = new FileWriter(f);
            fw.write("Total Salary of all: " + (int) Math.ceil(total));

        } catch (FileNotFoundException ex) {
            System.out.print("File not found!");
        } catch (IOException e) {
            System.out.print("Error Write file");
        }
    }

    public void calculateTotalSalaryByType() {
        double totalLec = 0;
        double totalAst = 0;
        double totalRe = 0;
        double totalSpe = 0;
        for (int i = 0; i < list.size(); i++) {
            String key = list.get(i).getTypeOfStaff();
            switch (key) {
                case "Lecturer" -> {
                    totalLec += list.get(i).getSalary();
                }
                case "TeachingAssistant" -> {
                    totalAst += list.get(i).getSalary();
                }
                case "Researcher" -> {
                    totalRe += list.get(i).getSalary();
                }
                case "Specialist" -> {
                    totalSpe += list.get(i).getSalary();
                }
            }
        }
        File f = new File("\\Desktop\\totalSalarybyType.txt");
        try {
            FileWriter fw = new FileWriter(f);
            fw.write("Total Salary of all lecturers: " + (int) Math.ceil(totalLec));
            fw.write("Total Salary of all assistants: " + (int) Math.ceil(totalAst));
            fw.write("Total Salary of all researchers: " + (int) Math.ceil(totalRe));
            fw.write("Total Salary of all specialists: " + (int) Math.ceil(totalSpe));
        } catch (FileNotFoundException ex) {
            System.out.print("File not found!");
        } catch (IOException e) {
            System.out.print("Error Write file");
        }
    }

    public void findThreeHighestPaid() {
        if (list.size() <= 3) {
            System.out.print("The top 3-highet-paid staffs: \n");
            for (Staffs s : list) {
                System.out.print(s.getFullName() + "\n");
            }
        } else {
            Staffs s1 = list.get(0);
            Staffs s2 = list.get(1);
            Staffs s3 = list.get(2);
            for (int i = 4; i < list.size(); i++) {
                if (list.get(i).getSalary() > s1.getSalary()) {
                    s1 = list.get(i);
                } else if (list.get(i).getSalary() > s2.getSalary()) {
                    s2 = list.get(i);
                } else if (list.get(i).getSalary() > s3.getSalary()) {
                    s3 = list.get(i);
                }
            }
            System.out.println("The top 3-highest-paid staffs: ");
            System.out.print(s1.getFullName() + "\n" + s2.getFullName() + "\n" + s3.getFullName() + "\n");
        }
    }
}
