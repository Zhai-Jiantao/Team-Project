public class Student {
    private float Maths;
    private float English;
    private float History;
    private long StudentID;

    public Student(long StudentID,float Maths,float English,float History){
        setStudentID(StudentID);
        setEnglish(English);
        setHistory(History);
        setMaths(Maths);
    }

    public void setStudentID(long StudentID) {
        this.StudentID = StudentID;
    }

    public void setEnglish(float English) {
        this.English= English;
    }

    public void setHistory(float History) {
        this.History = History;
    }

    public void setMaths(float Maths) {
        this.Maths = Maths;
    } public long getStudentID() {
        return StudentID;
    }

    public float getMaths() {
        return Maths;
    }

    public float getEnglish() {
        return English;
    }

    public float getHistory() {
        return History;
    }




}
