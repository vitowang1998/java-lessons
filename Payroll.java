import java.util.Scanner;

public class Payroll {

    private static final double taxRate = 0.25;

    private static class Employee {
        String employeeNumber;
        String name;
        int hoursWorked;
        char employeeType;
        String department;
        int fixedSalaryForRegularWorkers;
        double hourlySalary;
        int teachingAllowance;
        double grossSalary;
        double deductions;
        double netPay;

        public Employee(String employeeId, String employeeName, int hours, char type, String employeeDepartment) {
            this.employeeNumber = employeeId;
            this.name = employeeName;
            this.hoursWorked = hours;
            this.employeeType = type;
            this.department = employeeDepartment;
        }

        public void calculateSalary(Scanner reader) {
            if (this.employeeType == 'l' || this.employeeType == 'L') { // When the employee is a lecturer
                System.out.print("Please enter your qualification code: ");

                String qualification = reader.nextLine();

                if (qualification.equals("MASTER")) { // If the employee is a master
                    this.hourlySalary = 575;
                    this.teachingAllowance = 2500;
                }
                if (qualification.equals("BACHELOR")) { // if the employee is a bachelor
                    this.hourlySalary = 325;
                    this.teachingAllowance = 1250;
                }
                this.grossSalary = this.hoursWorked * this.hourlySalary + this.teachingAllowance;
            } else { // When the employee is a regular worker
                System.out.print("Please enter your fixed salary: ");
                this.fixedSalaryForRegularWorkers = reader.nextInt();
                if (this.hoursWorked == 160) { // if he has worked for exactly 160 hours this month
                    this.grossSalary = this.fixedSalaryForRegularWorkers;
                } else { // calculate his salary hourly
                    this.hourlySalary = this.fixedSalaryForRegularWorkers / 160;
                    if (this.hoursWorked > 160) {
                        this.grossSalary = this.fixedSalaryForRegularWorkers + (this.hoursWorked - 160) * this.hourlySalary * 2;
                    } else { // if the regular worker does not work more than 160s hours per week
                        this.grossSalary = this.hourlySalary * this.hoursWorked;
                    }
                }
            }
        }

        public void calculateDeductions() {
            double healthSurcharge = 0;
            double taxableAmount = 0;

            // Determine the health surcharge fee
            if (this.grossSalary > 499.99) {
                healthSurcharge = 33;
            } else {
                healthSurcharge = 19.2;
            }

            // Determine the taxable amount of an employee
            if (this.grossSalary > 5000) {
                taxableAmount = this.grossSalary - 5000;
            }

            this.deductions = taxableAmount * taxRate + healthSurcharge;
        }

        public void calculateNetPay() {
            this.netPay = this.grossSalary - this.deductions;
        } 

        public void printEmployeeInformation() {
            System.out.println("Employee Number: " + this.employeeNumber);
            System.out.println("Employee Name: " + this.name);
            System.out.println("Employee's Department: " + this.department);
            System.out.println("Employee Type: " + this.employeeType);
            System.out.println("Hours Worked: " + this.hoursWorked);
            System.out.println("Gross Salary: " + this.grossSalary);
            System.out.println("Deductions: " + this.deductions);
            System.out.println("Net Pay: " + this.netPay);
        }

    }

    static Employee createEmployee(Scanner reader) {
        System.out.print("Please enter your Employee number: ");
        String employeeId = reader.nextLine();
        
        System.out.print("Please enter your name: ");
        String employeeName = reader.nextLine();

        System.out.print("Please enter your hours' work: ");
        int hours = reader.nextInt();

        System.out.print("Please enter your employee type: ");
        char type = reader.next().charAt(0);

        System.out.print("Please enter your employee department: ");
        reader.nextLine(); // Consumes the \n left by the employee type
        String employeeDepartment = reader.nextLine();

        Employee e = new Employee(employeeId, employeeName, hours, type, employeeDepartment);
        return e;
    }

// Lecturer: 100 hours, MASTER, 60000
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Employee employee = createEmployee(reader);
        employee.calculateSalary(reader);
        employee.calculateDeductions();
        employee.calculateNetPay();
        employee.printEmployeeInformation();
    }
}