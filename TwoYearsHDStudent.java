public class TwoYearsHDStudent extends Student {
    private double cgpa;

    public TwoYearsHDStudent(String studentName, String studentID,
                             String code, String name, double cgpa) {
        super(studentName, studentID, code, name);
        this.cgpa = cgpa;
    }

    public double getCgpa() { return cgpa; }

    public String getCodeLabel()   { return "Programme Code"; }
    public String getNameLabel()   { return "Programme Name"; }
    public String getResultLabel() { return "Student's GCPA"; }
    public String getResult()      { return String.valueOf(cgpa); }
}