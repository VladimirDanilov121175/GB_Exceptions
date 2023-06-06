package Seminar01;

//Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
//        Необходимо посчитать и вернуть сумму элементов этого массива. При этом накладываем на метод 2 ограничения:
//        метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может
//        лежать только значение 0 или 1.
//        Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.

import java.util.Arrays;
import java.util.Random;

public class Task004 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[][] matrix = new int[5][5];
        for (int[] ints : matrix) {
            for (int i = 0; i < ints.length; i++) {
                ints[i] = rand.nextInt(3);
            }
            System.out.println(Arrays.toString(ints));
        }
        System.out.println("Sum of all elements = " + sumOfElements(matrix));
    }

    public static int sumOfElements(int[][] elements) {
        int sum = 0;

        if (elements.length != elements[0].length) {
            throw new RuntimeException("Массив не квадратный!");
        }

        for (int[] element : elements) {
            for (int i : element) {
                if (i < 0 | i > 1) {
                    throw new RuntimeException("Массив содержит элементы, не равные 0 или 1!");
                }
                sum += i;
            }
        }
        return sum;
    }
}
