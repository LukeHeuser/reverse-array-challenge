package heuser.luke;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] firstArray = {1, 2, 3, 4, 5, 6};
        int[] secondArray = {10,9,8,7,6,5,4,3,2,1,0};

        reverse(firstArray);
        reverseCopy(secondArray);

    }

    // This is called a Mutating Method
    private static void reverse(int[] array) {
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        System.out.println("Initial Array = " + Arrays.toString(array));
        // the code below is how to swap elements IN an array
        //
        for(int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
            System.out.println("---> " + Arrays.toString(array));
        }
        System.out.println("-".repeat(20));
    }

    private static int[] reverseCopy(int[] array) {

        int[] reverseArray = new int[array.length];
        int maxIndex = array.length - 1;

        for(int el : array) {
            // the maxIndex Decrement occurs AFTER
            // the assignment is completed
            reverseArray[maxIndex--] = el;
            System.out.println("---> " + Arrays.toString(reverseArray));
        }

        System.out.println("Before Reverse: " + Arrays.toString(array));
        System.out.println("After Reverse: " + Arrays.toString(reverseArray));
        System.out.println("-".repeat(20));

        return reverseArray;

    }

//    private static void reverse(int[] array) {
//        System.out.println(Arrays.toString(array));
//
//        int[] reverseArray = new int[array.length];
//
//        for(int i = 0; i < array.length; i++) {
//
//            reverseArray[array.length - i - 1] = array [i];
//
//        }
//        System.out.println(Arrays.toString(reverseArray));
//
//    }





}
