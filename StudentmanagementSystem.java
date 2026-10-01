import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {

    static ArrayList<String> studentIds = new ArrayList();
    static ArrayList<String> studentNames = new ArrayList();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    deleteStudent();
                    break;

                case 5:
                    System.out.println("Thank you for using Student Management System!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    static void addStudent() {

        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        studentIds.add(id);
        studentNames.add(name);

        System.out.println("Student added successfully!");
    }

    static void viewStudents() {

        if (studentIds.isEmpty()) {
            System.out.println("No students found.");
        } else {
            System.out.println("\n----- Student List -----");

            for (int i = 0; i < studentIds.size(); i++) {
                System.out.println(
                    "ID: " + studentIds.get(i)
                    + " | Name: " + studentNames.get(i)
                );
            }
        }
    }

    static void searchStudent() {

        System.out.print("Enter Student ID to search: ");
        String id = scanner.nextLine();

        int index = studentIds.indexOf(id);

        if (index != -1) {
            System.out.println("Student found!");
            System.out.println("ID: " + studentIds.get(index));
            System.out.println("Name: " + studentNames.get(index));
        } else {
            System.out.println("Student not found.");
        }
    }

    static void deleteStudent() {

        System.out.print("Enter Student ID to delete: ");
        String id = scanner.nextLine();

        int index = studentIds.indexOf(id);

        if (index != -1) {
            studentIds.remove(index);
            studentNames.remove(index);

            System.out.println("Student deleted successfully!");
        } else {
            System.out.println("Student not found.");
        }
    }
}