import java.util.Date;

public class Employee {
    private  String name;
    private Double salary;
    private Date dateOfJoining;
    private String gender;

    public Employee() {
        super();
    }

    public Employee(String name, Double salary, Date dateOfJoining, String gender) {
        this.name = name;
        this.salary = salary;
        this.dateOfJoining = dateOfJoining;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", dateOfJoining=" + dateOfJoining +
                ", gender='" + gender + '\'' +
                '}';
    }
}
