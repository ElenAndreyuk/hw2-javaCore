package ru;
//Написать метод, возвращающий количество чётных элементов массива.
// countEvens([2, 1, 2, 3, 4]) → 3
// countEvens([2, 2, 0]) → 3
// countEvens([1, 3, 5]) → 0
public class Task1 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6};
        System.out.println(quantityEven(array1));
        int[] array2 = {2, 2, 0};
        System.out.println(quantityEven(array2));
        int[] array3 = {1, 3, 5};
        System.out.println(quantityEven(array3));
    }
    public static int quantityEven(int[] array){
        int counter = 0;
        for (int item : array) {
            if(item%2 == 0)
                counter++;
        }
        return counter;
    }
}
