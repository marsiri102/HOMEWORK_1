/*
Name: Martin Siri
Class: CSC229
Date: 9/28/25
*/
public class Main {

    public static void main(String[] args) {
        //1
        printWord(5); //calls the method to print "Hello World" 5 times

        //2
        int result = sumMultiplesof7(10, 30); //calls the method to get the sum of multiples of 7 between 10 and 30
        System.out.println("sum of all numbers between 10 and 30: " + result);

        //3
        int[] sortedArray = {2, 4, 6, 8, 10, 12, 14}; //sorted array
        int target = 10; //number to look for

        int index = binarySearch(sortedArray, target, 0, sortedArray.length - 1); //calls the method to look for the target
        System.out.println("Target " + target + " found at index: " + index);

    }
    //1
    public static void printWord(int n) { //will print the hello world n amount of times
        if (n <= 0) {
            return; //will stop loop when n is 0 or less than
        }
        System.out.println("Hello World");
        printWord(n - 1); //loops
    }
    //2
    public static int sumMultiplesof7(int n1, int n2) { //return sum of multiple of 7
        if (n1 > n2) {
            return 0; //stops
        }

        if (n1 % 7 == 0) {
            return n1 + sumMultiplesof7(n1 + 1, n2); //adds if it its multiple of 7
        } else {
            return sumMultiplesof7(n1 + 1, n2); //skips
        }
    }
    //3
    public static int binarySearch(int[] array, int target, int left, int right) { //binary search
                if (left > right) {
                    return -1; //Not available
                }

                int mid = left + (right - left) / 2; //finds middle

                if (array[mid] == target) {
                    return mid;//available 
                } else if (array[mid] > target) {
                    return binarySearch(array, target, left, mid - 1); //searches left
                } else {
                    return binarySearch(array, target, mid + 1, right); //searches right
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
