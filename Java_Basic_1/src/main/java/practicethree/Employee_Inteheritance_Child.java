package practicethree;

public class Employee_Inteheritance_Child extends Person_Inteheritance_Parent{
    private String employeeId;

    private String status;

    public Employee_Inteheritance_Child (){ // Formula of constructor = access modifier then class's name
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
}
