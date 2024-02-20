import java.util.*;

public class Methods {


    //----------------------------------1------------------------------------
    //1.Write a program to find all of the longest word in a given dictionary
    public static ArrayList<String> findLongestWords(String[] dictionary) {
        ArrayList<String> longestWords = new ArrayList<>();
        int maxLength = 0;


        for (String word : dictionary) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWords.clear();
            }
            if (word.length() == maxLength) {
                longestWords.add(word);
            }
        }

        return longestWords;
    }

    //--------------------------------2--------------------------------------
    //2. Write a program that displays the number of occurrences of an element in the array
    public static void countAndPrintOccurrences(int[] array, int numberToSearch) {
        int count = 0;
        System.out.println("Array:");
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(",");
            }
            if (array[i] == numberToSearch) {
                count++;
            }
        }
        System.out.println("]");
        System.out.println(numberToSearch + " occurs " + count + " times");
    }
    //--------------------------------3--------------------------------------
    /*3.Write a program to find the k largest elements in a given array. Elements in the array can be in
    any order.*/

    public static int[] findKLargestElements(int[] arr, int k) {

        Arrays.sort(arr);
        int[] largestElements = new int[k];

        for (int i = 0; i < k; i++) {
            largestElements[i] = arr[arr.length - 1 - i];
        }
        return largestElements;
    }

    //------------------------------------4---------------------------------------
    /* 4. Create a method to reverse an array of integers. Implement the method without creating a new
            array*/

    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //-----------------------5-----------------------------------------------
    // Method to accept elements of the array from the user
    public static int[] acceptElements(int size, Scanner scanner) {
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }


    public static void displayElements(int[] array) {
        if (array == null) {
            System.out.println("Array is empty! Please input elements first.");
        } else {
            System.out.println("Elements of the array:");
            for (int element : array) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void searchElement(int[] array, int key) {
        if (array == null) {
            System.out.println("Array is empty! Please input elements first.");
        } else {
            boolean found = false;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == key) {
                    System.out.println("Element found at index " + i);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Element not found in the array.");
            }
        }
    }


    public static void sortArray(int[] array) {
        if (array == null) {
            System.out.println("Array is empty! Please input elements first.");
        } else {
            Arrays.sort(array);
            System.out.println("Array sorted successfully.");
        }
    }
    //--------------------------------6-----------------------------------
    //6. Create a method that generates a random number within a given range. Allow the user to
    //specify the range and call the method to display random numbers.
    //Hint: use Random class
    public static void generateRandomNumbers(int min, int max, int count) {
        Random random = new Random();
        System.out.println("Random numbers within the specified range:");
        for (int i = 0; i < count; i++) {
            int randomNumber = random.nextInt(max - min + 1) + min;
            System.out.print(randomNumber);
            if (i < count - 1) {
                System.out.print(" - ");
            }
        }
    }
    //------------------------------------7-----------------------------------------
    //7. Write a program that checks the strength of a password. Create a method that evaluates a
    //password based on criteria like length, inclusion of special characters, and uppercase/lowercase
    //letters.
    public static int calculateTotalScore(String password) {
        int lengthScore = 0;
        int specialCharScore = 0;
        int upperLowerCaseScore = 0;

        // Length score
        if (password.length() >= 8) {
            lengthScore = 3;
        } else if (password.length() >= 6) {
            lengthScore = 2;
        }

        if (password.matches(".*[^a-zA-Z0-9 ].*")) {
            specialCharScore = 2;
        }

        if (password.matches(".*[a-z].*") && password.matches(".*[A-Z].*")) {
            upperLowerCaseScore = 3;
        }

        return lengthScore + specialCharScore + upperLowerCaseScore;
    }

    //------------------------------8-------------------------------
    //8. Create a method that generates the Fibonacci sequence up to a specified number of terms.
    public static void generateFibonacci(int numTerms) {
        int firstTerm = 0, secondTerm = 1;
        int nextTerm;

        for (int i = 1; i <= numTerms; ++i) {
            System.out.print(firstTerm + " ");

            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }





} //end class