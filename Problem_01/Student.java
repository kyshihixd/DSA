public class Student {
    public String fname, lname;
    public int grade;
    public type status;
    // added public to the declaration of student names
    public enum type {
        Excellent, Ok, Failure
    };

    public Student(String fname, String lname, int grade) {
        this.fname = fname;
        this.lname = lname;
        this.grade = grade;
        if (grade > 89) {
            this.status = type.Excellent;
        } else if (grade >= 60 && grade <= 89) {
            this.status = type.Ok;
        } else
            this.status = type.Failure;
    }

    public String toString() {
        return fname + " " + lname + "\t" + grade + "\t" + status;
    }
}
