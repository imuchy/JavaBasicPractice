package practiceone;


import java.util.Scanner;

public class EmployeePay {
    public static void main(String[] args) {
        //   1. Get number of worked hour
        System.out.println("Enter Employee's number of worked hour");
        Scanner WorkedHour = new Scanner(System.in);
        int hours = WorkedHour.nextInt();

        //   2. Get hourly rate
        System.out.println("Enter Employee's hourly rate");
        double rate = WorkedHour.nextDouble();

        //   3. Multiply worked hour and rate
        double payable = hours * rate;

        //   4. Display results
        System.out.println("Salary = " +payable);
    }
}
