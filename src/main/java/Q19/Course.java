package Q19;

// create class
public class Course {

    //create attributes name, code, startDate, numberOfStudents, count
    private String name;
    private String code;
    private String startDate;
    private int numberOfStudents;
    private static int count = 0;

    //2 constructors: a default constructor and a constructor that takes in all the attributes
    public Course() {
        count++;
    }

    public Course(String name, String code, String startDate, int numberOfStudents) {
        this.name = name;
        this.code = code;
        this.startDate = startDate;
        this.numberOfStudents = numberOfStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Course course = (Course) o;

        return code.equals(course.code);
    }

    @Override
    public int hashCode() {
        return code.hashCode();
    }

    @Override
    public String toString() {
        return "[" + "" + code  + "," + name  +  ']';
    }
}
