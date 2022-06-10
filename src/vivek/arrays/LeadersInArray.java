package vivek.arrays;

import java.util.Scanner;

public class LeadersInArray {

    public static void leaders(int[] A){
        for(int i=0;i<A.length;i++){
            int j;
            for(j=i+1;j<A.length;j++){
                if(A[j]>=A[i]){
                    break;
                }
            }
            if(j==A.length||i==A.length-1) System.out.print(A[i]+" ");
        }
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

            leaders(A);

            System.out.println("\nPress Y to run again, any other char will exit the program");
        }while (scanner.nextLine().charAt(0) == 'y');
    }
}
