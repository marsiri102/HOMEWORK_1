/*
Name: Martin Siri
Class: CSC229
Date: 9/28/25
*/
public class Main {

    public static void main(String[] args) {
        //1
        printWord(5);

        //2
        int result = sumMultiplesof7(10, 30);
        System.out.println("sum of all numbers between 10 and 30: " + result);

        //3
        int[] sortedArray = {2, 4, 6, 8, 10, 12, 14};
        int target = 10;

        int index = binarySearch(sortedArray, target, 0, sortedArray.length - 1);
        System.out.println("Target " + target + " found at index: " + index);

    }
    //1
    public static void printWord(int n) {
        if (n <= 0) {
            return;
        }
        System.out.println("Hello World");
        printWord(n - 1);
    }
    //2
    public static int sumMultiplesof7(int n1, int n2) {
        if (n1 > n2) {
            return 0;
        }

        if (n1 % 7 == 0) {
            return n1 + sumMultiplesof7(n1 + 1, n2);
        } else {
            return sumMultiplesof7(n1 + 1, n2);
        }
    }
    //3
    public static int binarySearch(int[] array, int target, int left, int right) {
                if (left > right) {
                    return -1;
                }

                int mid = left + (right - left) / 2;

                if (array[mid] == target) {
                    return mid;
                } else if (array[mid] > target) {
                    return binarySearch(array, target, left, mid - 1);
                } else {
                    return binarySearch(array, target, mid + 1, right);
                }
            }
        }
            /*
           HOMEWORK:
            -please submit the solution to the following problems:

            -1.Write a function that prints "Hello World" n times recursively.
             DONE.
            -2.Write a function that returns the sum of all numbers between n1 and n2 that are multiples of 7 using recursion.
             DONE.
            -3.Write a function that implements the binary search algorithm recursively.
             DONE.
            */