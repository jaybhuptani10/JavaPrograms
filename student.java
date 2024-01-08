import java.util.Scanner;

public class student {
    int sid;
    String sname;
    int M1, M2, M3;

    public void setdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student id");
        sid = sc.nextInt();
        System.out.println("Enter student name");
        sname = sc.next();
        System.out.println("Enter Marks1");
        M1 = sc.nextInt();
        System.out.println("Enter Marks2");
        M2 = sc.nextInt();
        System.out.println("Enter Marks3");
        M3 = sc.nextInt();

    }

    public void displaydata() {
        System.out.println("Data you entered: ");
        System.out.println("Student Name: " + sname);
        System.out.println("Student Id: " + sid);
        System.out.println("Marks1: " + M1);
        System.out.println("Marks2: " + M2);
        System.out.println("Marks3: " + M3);

    }

    public void avgmarks() {
        System.out.println("Average marks = " + (M1 + M2 + M3) / 3);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student kirtan = new student();
        int i = 0;
        while (i == 0) {
            System.out.println("Press 1 to enter data");
            System.out.println("Press 2 to display data");
            System.out.println("Press 3 to get average data");

            System.out.println("Press 4 to exit");
            int choice = sc.nextInt();
            if (choice == 1) {
                kirtan.setdata();
            } else if (choice == 2) {
                kirtan.displaydata();

            } else if (choice == 4) {
                kirtan.avgmarks();
            } else {
                i = 1;
            }

        }

    }
}
