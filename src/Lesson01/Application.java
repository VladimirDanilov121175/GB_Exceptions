package Lesson01;

import java.io.File;

public class Application {
    public static void main(String[] args) {
//        System.out.println(getFileSize(new File("C:\\Users\\Mi\\Pictures\\photo_2022-08-09_13-40-09.jpg")));
        System.out.println(divide(100, 0));

        int[] ints = new int[10];
        System.out.println(ints[1000]); // ArrayIndexOutOfBoundsException
    }

    public static int divide(int a, int b) {
        if(b == 0) {
            throw new RuntimeException("Division by zero is not allowed");
        }
        return a / b;
    }

    public static long getFileSize(File file) {
        if(!file.exists()) {
            return -1;
        }
        return file.length();
    }
}
