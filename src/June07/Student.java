package June07;

public class Student {
    private String firstName;
    private String lastName;
    private String gpa;

    public Student(String firstName, String lastName, String gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGpa() {
        return gpa;
    }

    public int compareTo(Student other){
        return this.lastName.compareTo(other.lastName);
    }

}
