package Homework01;

// 1) Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

public class Task_1 {
    public static void main(String[] args) {
        throwsArrayIndexOutOfBoundsException(new int[4], new int[5]);
        throwsNumberFormatException("тридцать семь");
        throwsNullPointerException(null);
    }

    private static void throwsArrayIndexOutOfBoundsException(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                arr1[j] = arr2[i];
            }
        }
    }

    private static void throwsNumberFormatException(String number) {
        int num = Integer.parseInt(number);
        System.out.println(num / 100);
    }

    private static void throwsNullPointerException(String nullString) {
        int length = nullString.length();
        System.out.println("Длина строки = " + length);
    }

}
