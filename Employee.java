public abstract class Employee {

    // Fields
    private int employeeId;
    private String firstName;
    private String lastName;
    
    // Default constructor
    public Employee() {

    }

    /**
     * Parameter Constructor
     * 
     * @param employeeId
     * @param firstName
     * @param lastName
     */
    public Employee(int employeeId, String firstName, String lastName) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
    }


    // Getter methods
    public int getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLaString() { 
        return lastName;
    }

    // Setter methods
    public void setEmployeeId(int id) {
        this.employeeId = id;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public void setLastName(String name) {
        this.lastName = name;
    }

    // Abstrct method
    /**
     * Function to calculate salary of an employee - All the child class 
     * must override this function 
     * 
     * @return salary
     */
    public abstract double calculateSalary();

    @Override
    public String toString() {        
       return  String.format("%-20s %d%n", "Employee ID:", employeeId) + 
        String.format("%-20s %s%n", "Employee Name: ", firstName + " " + lastName);
    }
}