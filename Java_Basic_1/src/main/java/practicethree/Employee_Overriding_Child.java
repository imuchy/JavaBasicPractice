package practicethree;

public class Employee_Overriding_Child extends Person_Overriding_Parent{
    private String employeeId;

    private String status;

    public Employee_Overriding_Child(){ // Formula of constructor = access modifier then class's name
        super("Imu");
        System.out.println("Printed from employee constructor");
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void greetings() {
        System.out.println("Hi " + getName() + "!");
    }
}
