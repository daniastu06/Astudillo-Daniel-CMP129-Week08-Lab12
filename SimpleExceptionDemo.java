public class SimpleExceptionDemo {
    public static void safeDivide(int numerator, int denominator){
        try {
            int division = numerator/denominator;
            System.out.print("division")
        } catch (ArithmeticException e){
            System.out.println("Cannot divide by zero")
        }
        System.out.print("Divison complete")
    }
    
    public static void main(String[]args){
      safeDivide(4,2)
      
    }
}

