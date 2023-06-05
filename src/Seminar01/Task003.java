package Seminar01;
//    Напишите метод, в котором реализуйте взаимодействие с пользователем.
//    То есть, этот метод запросит искомое число у пользователя, вызовет первый,
//    обработает возвращенное значение и покажет читаемый результат пользователю.
//    Например, если вернулся -2, пользователю выведется сообщение: “Искомый элемент не найден”.

import java.util.Random;
import java.util.Scanner;

public class Task003 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[20];
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100);
        }

        f2(array);
    }

    public static int f1(int[] array, int value) {
        if (array == null) return -3;
        if (array.length < 5) return -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -2;
    }

    public static void f2(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your value to search in array: ");
        int value = scanner.nextInt();

        int errCode = f1(array, value);
        switch (errCode) {
            case -1 -> System.out.println("Длина массива меньше заданного минимума");
            case -2 -> System.out.println("Element not found!");
            case -3 -> System.out.println("Array is null");
            default -> System.out.println("Index of the value in array - " + errCode);
        }
    }
}
