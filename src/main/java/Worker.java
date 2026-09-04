import java.time.LocalDate;


public class Worker {

    private final String name;
    private final int birthYear;
    private final int endYear;

    public Worker(String name, int birthYear, int endYear) {
        this.name = name;
        this.birthYear = birthYear;
        this.endYear = endYear;
    }

    public int getAge() {
        return LocalDate.now().getYear() - birthYear;
    }

    public double collectPay() {
        return 0.0;
    }

    public void terminate(int endYear) {

    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                ", endYear=" + endYear +
                '}';
    }
}

class Employee extends Worker {
    private long employeeId = 0;
    private final int hireYear;

    public Employee(String name, int birthYear, int endYear, int hireYear) {
        super(name, birthYear, endYear);
        this.employeeId++;
        this.hireYear = hireYear;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireYear=" + hireYear +
                "} " + super.toString();
    }
}

class SalariedEmployee extends Employee {
    private final double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, int birthYear, int endYear, double annualSalary, boolean isRetired,
                            int hireYear) {
        super(name, birthYear, endYear, hireYear);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public void retire()
    {
        System.out.println("Salaried employee is " + (!isRetired ? "retired now" : "will retire now"));
        isRetired = true;
    }

    @Override
    public double collectPay() {
        return annualSalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                "} " + super.toString();
    }
}


