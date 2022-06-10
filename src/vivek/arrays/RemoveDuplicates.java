package vivek.arrays;

import java.util.Scanner;

public class RemoveDuplicates {


    public static Object[] removeDuplicates(int[] A){
        Object[] result = new Object[2];
        result[0]=A;
        int n = A.length;
        result[1]  = n;

        return result;

    }


    public static void main(String[] args) {
        Scanner scanner;
        do{
            scanner = new Scanner(System.in);
            System.out.print("Enter array elements: ");

            String[] nums = scanner.nextLine().trim().split(" ");
            int[] A = new int[nums.length];

            for (int i = 0; i < nums.length; i++) {
                A[i]=Integer.parseInt(nums[i]);
            }
            Object[] result = removeDuplicates(A);
            A = (int[])result[0];
            int n = (int)result[1];
            System.out.println("The array after removing duplicates is: ");
            MyArrayUtility.displayArray(A);

            System.out.println("\nPress Y to run again, any other char will exit the program");
        }while (scanner.next().charAt(0) == 'y');
    }
}
