public abstract class Student {
    private String studentName;
    private String studentID;
    private String code;   
    private String name;  

    public Student(String studentName, String studentID, String code, String name) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.code = code;
        this.name = name;
    }

    public String getStudentName() { return studentName; }
    public String getStudentID()   { return studentID; }
    public String getCode()        { return code; }
    public String getName()        { return name; }

    public abstract String getCodeLabel();   
    public abstract String getNameLabel();  
    public abstract String getResultLabel();  
    public abstract String getResult();      
}