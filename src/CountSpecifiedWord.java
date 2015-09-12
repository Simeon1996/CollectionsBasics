import java.util.Scanner;

/**
 * Created by Simeon on 9/5/2015.
 */
public class CountSpecifiedWord {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.print("Please, enter your sentence: ");
        String[] input = reader.nextLine().split("[ '-]");
        System.out.print("Please, enter the seeken word: ");
        String specifiedWord = reader.nextLine();

        Integer specifiedWordsCounter = 0;

        for(Integer i = 0; i < input.length;i++){
            if(input[i].toLowerCase().equals(specifiedWord.toLowerCase())){
                specifiedWordsCounter++;
            }
        }

        System.out.println();
        System.out.print("Word occurrences: " + specifiedWordsCounter + " time/s");
    }
}
