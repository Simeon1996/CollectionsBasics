import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Simeon on 9/4/2015.
 */
public class SortArrayOfNumbers {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.print("Please, enter the capacity of the array: ");
        Integer capacity = reader.nextInt();

        reader.nextLine();

        Integer[] numbersHolder = new Integer[capacity];

        System.out.print("Please, enter your number/s: ");
        String[] numbersReader = reader.nextLine().split(" ");

        for(Integer i = 0; i < numbersHolder.length;i++){
            numbersHolder[i] = Integer.parseInt(numbersReader[i]);
        }

        Arrays.sort(numbersHolder);

        System.out.println();
        System.out.print("Sorted numbers: ");

        for(Integer i = 0; i < numbersHolder.length;i++){
            System.out.print(numbersHolder[i] + " ");
        }
    }
}
