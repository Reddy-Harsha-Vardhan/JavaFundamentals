import java.util.List;
import java.util.stream.*;  
import java.util.*;
import java.util.IntSummaryStatistics;


public class StreamApi {
    
    public static void main(String[] args){
        List<Employee> employee = List.of(
            new Employee("harsha", "cse",23000),
            new Employee("gunda","cse", 7000),
            new Employee("avinash", "it",28000),
            new Employee("sai", "ece", 5000),
            new Employee("abhi", "ece", 6000),
            new Employee("srikanth", "mech", 20000)
        );

        List<Student> Students = List.of(
            new Student("harsha", 5, 85),
            new Student("gunda", 6, 93),
            new Student("avinash",8, 79),
            new Student("sai", 5, 48),
            new Student("abhi", 7, 93),
            new Student("srikanth",8, 78)
        );

        
     Students.stream().filter(s -> s.marks > 90).forEach(System.out::println);
              
   int TotalMarks = Students.stream().mapToInt(s -> s.marks).sum();
       System.out.println("Total Marks: " + TotalMarks);     
          
      employee.stream().sorted((e1, e2) -> e1.department.compareTo(e2.department)).forEach(System.out::println);
          
      int TotalSalary = employee.stream().mapToInt(e -> e.salary).sum();
      System.out.println("Total Salary: " + TotalSalary);

      

     int TotalSalarycse = employee.stream().filter(e -> e.department.equals("cse")).mapToInt(e -> e.salary).sum();
       System.out.println("Total Salary of cse: " + TotalSalarycse);
    }
}
