package ComparatorEmployee;

import Director.Director;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;

public class Employee {
    private int id;
    private String firstname;
    private String lastname;
    private String position;
    private int salary;
    private String hireDate;

    public Employee(int id, String firstname, String lastname, String position, int salary, String hireDate) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.position = position;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getHireDate() {
        return hireDate;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }



    public int compare(String data1, String data2) {
        LocalDate date1 = LocalDate.parse(data1);
        LocalDate date2 = LocalDate.parse(data2);
        return date1.compareTo(date2);
    }
// Прототип компаратора для дат (yyyy-mm-dd)
    public static Comparator<Employee> dateComparator = (emp1, emp2) -> {
        String[] date1 = emp1.getHireDate().split("-");
        String[] date2 = emp2.getHireDate().split("-");

        return Integer.compare(Integer.parseInt(date1[0] + date1[1] + date1[2]),
                               Integer.parseInt(date2[0] + date2[1] + date2[2]));
    };



}
