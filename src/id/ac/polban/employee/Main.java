package id.ac.polban.employee;

import id.ac.polban.employee.model.*;
import id.ac.polban.employee.service.EmployeeService;

public class Main {
    public static void main(String[] args) {
        EmployeeService service = new EmployeeService();

        Department itDept = new Department("IT");
        EmploymentType fullTime = new EmploymentType("Full-Time");

        Employee emp1 = new Employee(1, "Rojak", itDept, fullTime, 5000000);
        Employee emp2 = new Employee(2, "Ali", itDept, fullTime, 6000000);
        service.addEmployee(emp1);
        service.addEmployee(emp2);

        System.out.println("Total Employee: " + Employee.getTotalEmployee());

        System.out.println("Employee Name: " + service.getEmployee(1).getName());
        service.raiseSalary(1, 30);
        System.out.println("New Salary: " + service.getEmployee(1).getSalary());
        System.out.println("Employee Name: " + service.getEmployee(2).getName());
        service.raiseSalary(2, 10);
        System.out.println("New Salary: " + service.getEmployee(2).getSalary());
    }
}
