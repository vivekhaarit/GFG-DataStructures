package vivek.arrays;

import java.util.Scanner;

public class CheckIfAnArrayIsSorted {
    private static final Scanner scanner = new Scanner(System.in);
    public static boolean isSorted(int[] A){
        if(A.length==1) return true;
        else {
            int i;
            for (i = 0; i < A.length-1; i++) {
                if(A[i]>A[i+1]) return false;
            }
            return i == A.length - 1;
        }
    }

    public static void main(String[] args) {
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter array elements: ");

            String[] nums = scanner.nextLine().trim().split(" ");
            int[] A = new int[nums.length];

            for (int i = 0; i < nums.length; i++) {
                A[i]=Integer.parseInt(nums[i]);
            }
            System.out.println("The array is: "+ (isSorted(A)? "sorted ": "not sorted"));

            System.out.println("\nPress Y to run again, any other char will exit the program");
        }while (scanner.next().charAt(0) == 'y');

    }
}
