public class SimpleExceptionDemo {
    public static void safeDivide(int numerator, int denominator){
        try {
            int division = numerator/denominator;
            System.out.println(division);
        } catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        System.out.println("Divison complete");
        System.out.println();
    }
    
    public static void main(String[]args){
      safeDivide(4,2);
      safeDivide(8, 0);
      
    }
}

