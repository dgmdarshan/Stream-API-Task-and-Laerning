import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class EmployeeTaskStreamAPI {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateOfEmployee=new SimpleDateFormat("dd-MM-yyyy");
        Date joiningDateRam=dateOfEmployee.parse("12-06-2017");
        Date joiningDateSita=dateOfEmployee.parse("07-03-2015");
        Date joiningDateRajesh=dateOfEmployee.parse("27-07-2022");
        Date joiningDateDixi=dateOfEmployee.parse("08-012-2009");
        Date joiningDateVinayaka=dateOfEmployee.parse("10-01-2020");

        List<Employee> emp= Arrays.asList(
                new Employee("Ram",20000.0,joiningDateRam,"M"),
                new  Employee("Sita",25000.0,joiningDateSita,"F"),
                new Employee("Rajesh",340000.0,joiningDateRajesh,"M"),
                new Employee("Dixi",29000.0,joiningDateDixi,"M"),
                new Employee("Vinayaka",30000.0,joiningDateVinayaka,"M")

        );
        Employee maxSalary=emp.stream().max((a,b)->Double.compare(a.getSalary(),b.getSalary())).get();
        System.out.println(maxSalary);
       List<Employee> secoundHighestsSalary= emp.stream().sorted((a,b)->Double.compare(b.getSalary(),a.getSalary()))
                .skip(1)
                .toList();
        System.out.println("The Secound Highest Salary Holding Employee : "+secoundHighestsSalary);
        Employee seniorEmploye=  emp.stream().min((a, b) -> a.getDateOfJoining().compareTo(b.getDateOfJoining()))
                .get();
        System.out.println("The Senior Employee : "+seniorEmploye);


        Map<String , Long> countingEmployees=emp.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));

        System.out.println("The Total number of Male and Female Employees : "+countingEmployees);


    }
}
