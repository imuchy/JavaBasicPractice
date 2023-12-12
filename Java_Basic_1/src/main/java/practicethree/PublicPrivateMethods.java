package practicethree;

public class PublicPrivateMethods {
    public static int calculateSum(int a, int b) { // public method can use everywhere within this project.
        int sum = a + b;
        return sum;
    }

    private static int calculateSubtract(int a, int b) { // private method can use just within this class.
        int sub = a - b;
        return sub;
    }

    static int calculateMultiply(int a, int b) { // default method can use within this class and package.
        int mult = a * b;
        return mult;
    }

    protected static int calculateDivision(int a, int b) { // protected method can use on another class of another package. but have to do inherit this classname on that class.
        int div = a / b;
        return div;
    }
}
