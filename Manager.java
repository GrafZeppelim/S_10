
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Asia
 */
public class Manager {

    int[] a;
    private static final Scanner in = new Scanner(System.in);

    //check user input a number integer
    public int checkInputInt() {
        //loop until user input correct
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number.");
                System.out.print("Enter again: ");
            }
        }
    }

    //allow user input number of array
    public int inputSizeOfArray() {
        System.out.println("Input Length Of Arrays");
        System.out.print("Enter number: ");
        //loop until user input correct
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result <= 0) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number greater than zero.");
                System.out.print("Enter again: ");
            }
        }
    }

    //allow user input value of array
    public int[] inputValueOfArray() {
        int n = inputSizeOfArray();
        this.a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter number " + i + ": ");
            a[i] = checkInputInt();
        }
        return a;
    }

    //sort array ascending by bubble sort
    public void sortArrayAscending() {
        int len = this.a.length;
        if (len == 0) {
            System.err.println("List empty.");
        }
        for (int i = 0; i < len - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < len; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = a[minIndex];
                a[minIndex] = a[i];
                a[i] = temp;
            }
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.print("[" + a[i] + "]");
                break;
            }
            System.out.print("[" + a[i] + "]->");
        }
        System.out.println();
    }

    //sort array ascending by bubble sort
    public void sortArrayDescending() {
        int len = a.length;
        if (len == 0) {
            System.err.println("List empty.");
        }
        for (int i = 0; i < len - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < len; j++) {
                if (a[j] > a[maxIndex]) {
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                int temp = a[maxIndex];
                a[maxIndex] = a[i];
                a[i] = temp;
            }
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.print("[" + a[i] + "]");
                break;
            }
            System.out.print("[" + a[i] + "]<-");
        }
        System.out.println();
    }

    public int menu() {
        System.out.println("1. Input Element");
        System.out.println("2. Sort Ascending");
        System.out.println("3. Sort Desceding");
        System.out.println("4. Exit.");
        System.out.print("Enter your choice: ");
        //loop until user input correct
        int result = checkInputIntLimit(1, 4);
        return result;
    }

    public int checkInputIntLimit(int min, int max) {
        //loop until user input correct
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();

                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }

}
