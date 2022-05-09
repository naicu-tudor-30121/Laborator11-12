package aut.utcluj.isp.ex2;

/**
 * @author stefan
 */
public class Employee extends Person {
    private Double salary;
    private String lastname;
    private String firstname;

    public Employee(String firstName, String lastName, Double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    /**
     * Show employee information
     * @return employee information (Firstname: firstname Lastname: lastname Salary: salary)
     */
    public String showEmployeeInfo() {
        return "Firstname: " + this.getFirstName() + " Lastname: " + this.getLastName() + " Salary: " + this.salary;

    }
}
