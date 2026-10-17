import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Common data
        System.out.print("Input Student Name:");
        String studentName = sc.nextLine();
        System.out.print("Input Student ID:");
        String studentID = sc.nextLine();

        // 3 Years HD
        System.out.print("Input Three Year HD course code:");
        String courseCode = sc.nextLine();
        System.out.print("Input Three Year HD course name:");
        String courseName = sc.nextLine();
        System.out.print("Input Three Year HD average Mark:");
        int averageMark = Integer.parseInt(sc.nextLine());

        Student s1 = new ThreeYearsHDStudent(studentName, studentID,
                                             courseCode, courseName, averageMark);
        ShowResult.printResult(s1);

        // 2 Years HD
        System.out.print("Input Two Year HD programme code:");
        String programmeCode = sc.nextLine();
        System.out.print("Input Two Year HD programme name:");
        String programmeName = sc.nextLine();
        System.out.print("Input Two Year HD CGPA: ");
        double cgpa = Double.parseDouble(sc.nextLine());

        Student s2 = new TwoYearsHDStudent(studentName, studentID,
                                           programmeCode, programmeName, cgpa);
        ShowResult.printResult(s2);

        sc.close();
    }
}