import java.util.Scanner;

/**
 * Created by Simeon on 9/5/2015.
 */
public class LargestSequenceOfEqualStrings {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Please, enter your text: ");

        String[] input = reader.nextLine().split(" ");

        Integer counter = 0;
        Integer maxCounter = 0;
        String maxRepeatedWord = input[0];

        for(Integer i = 0; i < input.length - 1;i++){
            if(input[i].equals(input[i + 1])){
                counter++;

                if(counter > maxCounter){
                    maxCounter = counter;
                    maxRepeatedWord = input[i];
                }
            }else{
                counter = 0;
            }
        }

        System.out.println();

        System.out.print("The most repeated equal element/s are: ");
        for(Integer i = 0; i <= maxCounter;i++){
            System.out.print(maxRepeatedWord + " ");
        }
    }
}
