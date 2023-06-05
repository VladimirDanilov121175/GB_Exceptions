package Seminar01;

// Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
// Если длина массива меньше некоторого заданного минимума, метод возвращает -1 в качестве кода ошибки,
// иначе - длину массива.

public class Task001 {
    public static void main(String[] args) {
        int[] array = new int[4];
        System.out.println(getArrayLength(array));
    }

    public static int getArrayLength(int[] array) {
        if (array.length < 5) return -1;
        return array.length;
    }
}
