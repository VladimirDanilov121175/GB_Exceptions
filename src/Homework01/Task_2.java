package Homework01;

// 2) Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
// каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
// Если длины массивов не равны, необходимо как-то оповестить пользователя.

import java.util.Arrays;

public class Task_2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(newArray(new int[5], new int[5])));
    }

    public static int[] newArray(int[] arr1, int[] arr2) {
        int[] newArr = new int[6];
        if (newArr.length != arr1.length
                && newArr.length != arr2.length
                || arr1.length != arr2.length) {
            throw new RuntimeException("Массивы разной длины!");
        }

        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr1[i] - arr2[i];
            if (newArr[i] < 0) newArr[i] *= -1;
        }
        return newArr;
    }
}
