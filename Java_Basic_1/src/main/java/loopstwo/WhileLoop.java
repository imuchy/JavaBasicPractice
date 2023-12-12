package loopstwo;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int weeklyWorkHour = 32;
        double ratePerHour = 10;
        double bonusRate = 5;
        Scanner workHour = new Scanner(System.in);

        System.out.println("do you want to calculate employee's payment: yes/no");
        String controller = workHour.next();
        while (controller.equalsIgnoreCase("yes")){
            System.out.println("Work hour per day");
            int workHourPerDay = workHour.nextInt();
            System.out.println("Per hour rate");
            double perHourRate = workHour.nextDouble();
            double payment = workHourPerDay * perHourRate;
            double getReward = 0;
            if (workHourPerDay > weeklyWorkHour) {
                getReward = payment + bonusRate;
                System.out.println("You are eligible");
            } else if (workHourPerDay == weeklyWorkHour) {
                System.out.println("You are not eligible");
            }
            else {
                System.out.println("You have to hard bit more");
            }
            System.out.println("Reward = $" + getReward);
            System.out.println("do you want to continue: yes/no");
            controller = workHour.next();
        }
    }
}
