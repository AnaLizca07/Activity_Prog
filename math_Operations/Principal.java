package math_Operations;

public class Principal {
    public static void main(String[] args) {
        Division division = new Division();
        System.out.println("The result of dividing " + division.number1 + " by "
                + division.number2 + " is " + division.div());

        Subtraction subtraction = new Subtraction();
        System.out.println("The result of subtracting " + subtraction.number4
                + " from " + subtraction.number3 + " is " + subtraction.sub() );

        Multiplication multiplication = new Multiplication();
        System.out.println("The result of multiplying " + multiplication.number6
                + " by " + multiplication.number5 + " is " + multiplication.multi());

        Addition addition = new Addition();
        System.out.println("The result of add " + addition.number7 + (" by ") +
                addition.number8 + " is " + addition.add());
    }
}
