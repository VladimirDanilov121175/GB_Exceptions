package Lesson02;

import java.util.Collections;

public class Lesson02 {
    public static void main(String[] args) {
        arithmeticExceptionSample();

    }

    private static void arithmeticExceptionSample() {
        int number = 1;

        try {
            number = 10 /1;

            String string = null;
//            System.out.println(string.length());

            Collections.emptyList().add(string);

        } catch (ArithmeticException e) {
            System.out.println("Division by zero not supported");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        } catch (Exception e) {
            System.out.println("Exception");
        }
        System.out.println(number);
    }
}
