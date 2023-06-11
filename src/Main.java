/*
Question : You have been an arraylist 'arr' of integers. Your task is to find the second-largest
           element present in the 'arr'
 __________________________________________________________________________________________________
 I/O = 2,4,5,6,8
 O/P = 6
 */
import java.util.Scanner;
public class Main {
    public static int SecondLargestNumber(int smallestNumber, int[] arr){
        int start,secondStart,swapValue;
        for (start = 0; start < arr.length; start++){
            for (secondStart = 0; secondStart < arr.length - start - 1; secondStart++){
                if (arr[secondStart] > arr[secondStart + 1]){
                    swapValue = arr[secondStart];
                    arr[secondStart] = arr[secondStart + 1];
                    arr[secondStart + 1] = swapValue;
                }
            }
        }
        for (start = 0; start < arr.length; start++) {
            if (smallestNumber < arr[start]){
                smallestNumber = arr[start];
            }
        }
        if (smallestNumber > arr[arr.length - 2] && smallestNumber != arr[arr.length - 2]) {
          return arr[arr.length - 2];
        }else
            return (-1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start,sizeOfArray,smallestNumber = 0;
        System.out.println("Enter the size of array :");
        sizeOfArray = input.nextInt();
        int[] array = new int[sizeOfArray];
        System.out.println("Enter the element inside array :");
        for (start = 0; start < array.length; start++){
            array[start] = input.nextInt();
        }
        System.out.println("Printing the result :");
        System.out.println(SecondLargestNumber(smallestNumber,array));
    }
}