public class Tester {
    
    public static void main(String [] args) {

        // Create an array of object - 
        Employee employees [] = new Employee[3]; 
        
        employees[0] = new HourlyEmployee(1, "John", "Doe", 45, 19.95);
        employees[1] = new SalariedEmployee(2, "Maria", "Smith", 7000);
        employees[2] = new CommissionEmployee(3, "Jack", "Lee", 0.05, 1500, 100000);

        // now we call the tostring to display details
        for(int i=0; i<employees.length; i++) {
            System.out.println(employees[i]);
            System.out.println("\n");
        }
    }    
    
}
