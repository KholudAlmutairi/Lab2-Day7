import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        //--------------------------------ex1 -call function--------------------------------------
       //1.Write a program to find all of the longest word in a given dictionary.
        /*String[] dictionary = {"cat", "dog", "red", "is", "am"};
        ArrayList<String> longestWords = Methods.findLongestWords(dictionary);


        for (int i = 0; i < longestWords.size(); i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print("\"" + longestWords.get(i) + "\"");
        }
        System.out.println();*/


        //--------------------------------ex2 -call function--------------------------------------
        //2. Write a program that displays the number of occurrences of an element in the array
        /*int[] originalArray = {1, 1, 1, 3, 3, 5};
        Methods.countOccurrences(originalArray);*/

        //--------------------------------ex3 -call function--------------------------------------
       /* 3.Write a program to find the k largest elements in a given array. Elements in the array can be in
        any order.*/

        /*int[] originalArray1 = {1, 4, 17, 7, 25, 3, 100};
        int k = 3;

        int[] largestElements = Methods.findKLargestElements(originalArray1, k);

        System.out.println(k + " largest elements of the array are:");
        for (int element : largestElements) {
            System.out.print(element + " ");
        }*/


        //--------------------------------ex4 -call function--------------------------------------
        /* 4. Create a method to reverse an array of integers. Implement the method without creating a new
            array*/
        /*int[] originalArray2 = {5, 4, 3, 2, 1};
        Methods.reverseArray(originalArray2);
        System.out.println("Reversed Array:");
        Methods.printArray(originalArray2);*/

        //-----------------------------------ex5-Call function----------------------------------------
        /*int choice;
        int[] array = null;
        int size = 0;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Accept elements of an array");
            System.out.println("2. Display elements of an array");
            System.out.println("3. Search for an element within the array");
            System.out.println("4. Sort the array");
            System.out.println("5. To Stop");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the size of the array: ");
                    size = input.nextInt();
                    array = Methods.acceptElements(size,input);
                    break;
                case 2:
                    Methods.displayElements(array);
                    break;
                case 3:
                    System.out.print("Enter the element to search: ");
                    int key = input.nextInt();
                    Methods.searchElement(array, key);
                    break;
                case 4:
                    Methods.sortArray(array);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 5.");
            }
        } while (choice != 5); */

        //-----------------------------------ex6-Call function----------------------------------------


       /* System.out.print("Enter the minimum value of the range: ");
        int min = input.nextInt();

        System.out.print("Enter the maximum value of the range: ");
        int max = input.nextInt();

        System.out.print("Enter the number of random numbers to generate: ");
        int count = input.nextInt();

        Methods.generateRandomNumbers(min, max, count);*/
        //---------------------------------------------ex7 call function--------------------------------------------

       /* System.out.print("Enter your password: ");
        String password = input.nextLine();

        int totalScore = Methods.calculateTotalScore(password);

        System.out.println("Total Score: " + totalScore);

        if (totalScore >= 8) {
            System.out.println("Password is strong.");
        } else if (totalScore >= 5) {
            System.out.println("Password is moderately strong.");
        } else {
            System.out.println("Password is weak.");
        }*/
        //-----------------------------------ex8 call method---------------------------------------------------------
        System.out.print("Enter the number of Fibonacci terms to generate: ");
        int numTerms = input.nextInt();

        System.out.println("Fibonacci sequence with " + numTerms + " terms:");
        Methods.generateFibonacci(numTerms);






    } // end main




} // end class
