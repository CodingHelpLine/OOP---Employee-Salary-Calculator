public class CommissionEmployee extends Employee {
    
    private double commissionRate;
    private double baseSalary;
    private double totalSales;

    public CommissionEmployee() {
        super();
    }

    public CommissionEmployee(int employeeId, String firstName, String lastName, double rate, 
            double baseSalary, double totalSales) {
        super(employeeId, firstName, lastName);
        commissionRate = rate;
        this.baseSalary = baseSalary;
        this.totalSales = totalSales;
    }

    // Getter methods
    public double getCommissionRate() {
        return commissionRate;
    }

    public double getBaseSalary() {
        return this.baseSalary;
    }

    public double getSales() {
        return totalSales;
    }

    // Setter methods
    public void setComssionRate(double rate) {
        this.commissionRate = rate;
    }

    public void setBaseSalary(double salary) {
        this.baseSalary = salary;
    }

    public void setSales(double sales) {
        this.totalSales = sales;
    }

    public double calculateCommssion() {
        return totalSales * commissionRate;
    }

    /**
     * Function to calculate salary of an employee - All the child class 
     * must override this function 
     * 
     * @return salary
     */
    public double calculateSalary()
    {
        return calculateCommssion() + baseSalary;
    }

    @Override
    public String toString() {        
       return  super.toString() + 
        String.format("%-20s %.2f%n", "Salary:", calculateSalary());
    }

}
