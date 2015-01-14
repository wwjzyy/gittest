package java_debug;

public class Error_debug {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(factorial(6));
    }
    public static int factorial(int value) {
        if (value == 0) {
            return value;
        } else {
            return value * factorial(value - 1);
        }
    }

}


