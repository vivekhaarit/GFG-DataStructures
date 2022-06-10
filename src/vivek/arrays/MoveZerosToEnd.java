package vivek.arrays;

import java.util.Scanner;

public class MoveZerosToEnd {

    public static int[] moveZeros(int[] A){
        for(int i=0;i<A.length;i++){
            if(A[i]==0){
                for(int j=i+1;j<A.length;j++){
                    if(A[j]!=0){
                        MyArrayUtility.swap(A,i,j);
                        break;
                    }
                }
            }
        }
        return A;
    }






    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Enter array elements: ");

            String[] nums = scanner.nextLine().trim().split(" ");
            int[] A = new int[nums.length];

            for (int i = 0; i < nums.length; i++) {
                A[i]=Integer.parseInt(nums[i]);
            }

            A = moveZeros(A);
            System.out.println("The final array is: ");
            MyArrayUtility.displayArray(A);

            System.out.println("\nPress Y to run again, any other char will exit the program");
        }while (scanner.nextLine().charAt(0) == 'y');
    }
}
