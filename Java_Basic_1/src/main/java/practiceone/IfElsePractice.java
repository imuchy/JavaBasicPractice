package practiceone;

import java.util.Scanner;

public class IfElsePractice {
    public static void main(String[] args) {
        int weeklyWorkHour = 32;
        double ratePerHour = 10;
        double bonusRate = 5;

        Scanner workHour = new Scanner(System.in);
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

        // relationalOperator
        String V1 = "I";
        String V2 = "I";
        if (V1 == V2)
            System.out.println("1. Execute!");
        if (2!=2 && 3==3)
            System.out.println("2. Execute!");
        if (2!=1 || 3==3)
            System.out.println("3. Execute!");

    }
}
