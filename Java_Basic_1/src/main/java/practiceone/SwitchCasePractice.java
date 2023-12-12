package practiceone;

import java.util.Scanner;

public class SwitchCasePractice {
    public static void main(String[] args) {
        Scanner gradeMethod = new Scanner(System.in);
        String grade = gradeMethod.next();
        gradeMethod.close();
        String message;

        switch (grade.toUpperCase()){ //toUpperCase string is for all string like f will auto convert to F.
            case "A":
                message = "Excellent!";
                break;
            case "B":
                message = "Good!";
                break;
            case "F":
                message = "Failed!";
                break;
            default:
                 message = "Not matched!";
        }
        System.out.println(message);
    }
}
