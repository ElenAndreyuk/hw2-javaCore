package ru;

//Написать функцию, возвращающую истину, если в переданном массиве
// есть два соседних элемента, с нулевым значением.
public class Task3 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6};
        System.out.println(isTwoNull(array1));
        int[] array2 = {1, 0, 0};
        System.out.println(isTwoNull(array2));
    }
    public static boolean isTwoNull(int[] array){
        for (int i = 1; i < array.length ; i++) {
            if(array[i] == 0 && array[i-1] == 0){
                return true;
            }
        }
        return false;
    }
}
