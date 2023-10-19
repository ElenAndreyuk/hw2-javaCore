package ru;
//Написать функцию, возвращающую разницу между самым большим и самым ма-
// леньким элементами переданного не пустого массива.
public class Task2 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6};
        System.out.println(diffMaxMin(array1));
        int[] array2 = {0,0,0};
        System.out.println(diffMaxMin(array2));
    }
    public static int diffMaxMin(int[] array){
        int max = array[0];
        int min = array[0];
        for (int item: array) {
            if(item > max) max = item;
            else if (item < min) min = item;
        }
        return max - min;
    }
}
