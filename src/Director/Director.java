package Director;

import ComparatorEmployee.Employee;

import java.util.List;

public class Director extends Employee {

    public Director(int id, String firstname, String lastname, String position, int salary, String hireDate) {
        super(id, firstname, lastname, position, salary, hireDate);
    }
    // Метод для повышения зарплаты всем, кроме руководителей
    public static void salaryIncrease(List<Employee> employees, int increaseAmount){
        for(Employee emp : employees){
            if (!(emp instanceof Director)){
                emp.setSalary(emp.getSalary() + increaseAmount);

            }

        }
    }

}
