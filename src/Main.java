import Director.Director;
import ComparatorEmployee.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Иван", "Попов", "employee",80000, "2020-05-12"));
        employees.add(new Employee(2, "Петр", "Смирнов", "employee", 70000, "2019-10-13"));
        employees.add(new Director(3, "Александр", "Мамонов", "director", 100000, "2023-10-12"));
        // сортировка работников по дате трудоустройства, с помощью компаратора
        employees.sort(Employee.dateComparator);
        //до повышения зп
        for (Employee emp : employees) {
            System.out.println("Employer: " + emp.getFirstname() + " " + emp.getHireDate() + " " + emp.getSalary() + " зп." );

        }
        System.out.println();
        Director.salaryIncrease(employees, 10000);

        //после повышения зп
        for (Employee emp : employees) {
            System.out.println("Employer: " + emp.getFirstname() + " " + emp.getHireDate() + " " + emp.getSalary() + " зп." );

        }

    }
}