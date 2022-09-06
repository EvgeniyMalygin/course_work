import java.util.Objects;

public class Employee {

    private String fistName;
    private String lastName;
    private String middleName;
    private int numberOfDepartment = 0;
    private double salary = 0;
    private  int id = 0;
    private static int idEmployee = 0;

    public Employee(String lastName, String fistName, String middleName, int numberOfDepartment, double salary) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.numberOfDepartment = numberOfDepartment;
        this.salary = salary;
        this.id = idEmployee;
        idEmployee++;
    }

    public String getFistName() {
        return this.fistName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public int getNumberOfDepartment() {
        return this.numberOfDepartment;
    }

    public int getIdEmployee() {
        return this.id;
    }

    public double getSalary() {
        return salary;
    }

    public void setNumberOfDepartment(int number) {
        this.numberOfDepartment = number;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "id: " + id + " " +
                "ФИО: " + lastName + " " +
                fistName + " " +
                middleName + ", " +
                "номер отдела: " + numberOfDepartment + ", " +
                "зарплата: " + salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return numberOfDepartment == employee.numberOfDepartment && Double.compare(employee.salary, salary) == 0
                && id == employee.id && fistName.equals(employee.fistName) &&
                lastName.equals(employee.lastName) && middleName.equals(employee.middleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fistName, lastName, middleName, numberOfDepartment, salary, id);
    }
}
