package Seminar01;

//    Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
//    Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
//        1. если длина массива меньше некоторого заданного минимума, метод возвращает -1 в качестве кода ошибки.
//        2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
//        3. если вместо массива пришел null, метод вернет -3
//        4. если элемент есть - вернуть его.

import java.util.Random;

public class Task002 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[20];
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100);
        }

        System.out.println(getIndex(array, 10));
    }

    public static int getIndex(int[] array, int value) {
        if (array == null) return -3;
        if (array.length < 5) return -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -2;
    }
}
