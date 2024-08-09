public class Main {
    public static double performDivision(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("Denominator cannot be zero");
        }
        return (double) numerator / denominator;
    }
    public static void calculate(int numerator, int denominator) throws Exception {
        try {
            double result = performDivision(numerator, denominator);
            System.out.println("The result is: " + result);
        } catch (ArithmeticException e) {
            throw new Exception("An error occurred while performing division: " + e.getMessage(), e);
        }
    }
    public static void main(String[] args) {
        try {
            calculate(10, 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
