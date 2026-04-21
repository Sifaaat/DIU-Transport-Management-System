package diu.transport.management.system;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Admin admin = new Admin("admin", "1234");
        Student student = new Student("student", "1234");

        System.out.println("DIU Transport Management System");

        while (true) {

            System.out.println("\n1. Admin Login");
            System.out.println("2. Student Login");
            System.out.println("3. Exit");
            System.out.print("Choice: ");

            int choice = Integer.parseInt(sc.nextLine());

            // -------- ADMIN --------
            if (choice == 1) {

                System.out.print("Username: ");
                String u = sc.nextLine();

                System.out.print("Password: ");
                String p = sc.nextLine();

                if (admin.login(u, p)) {

                    while (true) {
                        System.out.println("\n1. Add Bus");
                        System.out.println("2. View Bus");
                        System.out.println("3. Update Bus");
                        System.out.println("4. Delete Bus");
                        System.out.println("5. Logout");
                        System.out.print("Choice: ");

                        int a = Integer.parseInt(sc.nextLine());

                        if (a == 1) admin.addBus(sc);
                        else if (a == 2) admin.viewBus();
                        else if (a == 3) admin.updateBus(sc);
                        else if (a == 4) admin.deleteBus(sc);
                        else if (a == 5) break;
                        else System.out.println("Invalid");
                    }

                } else {
                    System.out.println("Wrong login");
                }
            }

            // -------- STUDENT --------
            else if (choice == 2) {

                System.out.print("Username: ");
                String u = sc.nextLine();

                System.out.print("Password: ");
                String p = sc.nextLine();

                if (student.login(u, p)) {

                    student.viewBuses();

                } else {
                    System.out.println("Wrong login");
                }
            }

            // -------- EXIT --------
            else if (choice == 3) {
                System.out.println("Exit");
                break;
            }

            else {
                System.out.println("Invalid");
            }
        }
    }
}
