public class ShowResult {
    public static void printResult(Student s) {
        System.out.println("Student Name: " + s.getStudentName());
        System.out.println("Student ID: " + s.getStudentID());
        System.out.println(s.getCodeLabel() + ": " + s.getCode());
        System.out.println(s.getNameLabel() + ": " + s.getName());
        System.out.println(s.getResultLabel() + ": " + s.getResult());
    }
}