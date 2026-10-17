public class ThreeYearsHDStudent extends Student {
    private int averageMark;

    public ThreeYearsHDStudent(String studentName, String studentID,
                               String code, String name, int averageMark) {
        super(studentName, studentID, code, name);
        this.averageMark = averageMark;
    }

    public int getAverageMark() { return averageMark; }

    public String getCodeLabel()   { return "Course Code"; }
    public String getNameLabel()   { return "Course Name"; }
    public String getResultLabel() { return "Student's Average Mark"; }
    public String getResult()      { return String.valueOf(averageMark); }
}