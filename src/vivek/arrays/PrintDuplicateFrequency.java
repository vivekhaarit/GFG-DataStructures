package vivek.arrays;

import java.util.Scanner;

public class PrintDuplicateFrequency {

    public static int[] duplicateFrequency(int[] a){
        int[] countEle = new int[a.length];
        for(int i=0;i<a.length;i++){
            int count =1;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]) {
                    count++;
                    i++;
                }
                else break;
            }
            countEle[i]=count;
        }
        return countEle;
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

            int[] frequency = duplicateFrequency(A);
            System.out.println("The frequency of elements : ");
            //MyArrayUtility.displayArray(A);

            for(int i=0;i<A.length;i++){
                if(frequency[i]!=0) System.out.println(A[i]+" : "+frequency[i]);
            }

            System.out.println("\nPress Y to run again, any other char will exit the program");
        }while (scanner.nextLine().charAt(0) == 'y');
    }
}
