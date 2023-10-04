public class Student {
    String stdWnum;
    double firstAssignment;
    double secondAssignment;

    // Constructors:
    public Student(String stdWnum, double firstAssignment, double secondAssignment) {
        this.stdWnum = stdWnum;
        this.firstAssignment = firstAssignment;
        this.secondAssignment = secondAssignment;
    }

    // Methods
    public void stdReport() {
        System.out.println(this.stdWnum);
        System.out.println(this.firstAssignment);
        System.out.println(this.secondAssignment);
    }

}
