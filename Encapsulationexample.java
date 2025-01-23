package Examples;
class Employee{
    private String name;
    private double salary;
    //Getter method for name
    public String getName(){
        return name;
    }
    //Setter name for name
    public void setName(String name){
        this.name = name;
    }
    //Getter method for salary
    public double getSalary(){
        return salary;
    }
    //Setter method for salary and validation
    public void setSalary(double salary){
        if(salary >0 ){
            this.salary = salary;
        }

    }
}


public class Encapsulationexample {
    public static void main( String[] args) {
        Employee emp = new Employee();
        emp.setName("Binam");
        emp.setSalary(500000);
        System.out.println( emp.getName( ) + "earns" + emp.getSalary( ));
    }
}
