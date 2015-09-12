import java.util.Scanner;

/**
 * Created by Simeon on 9/5/2015.
 */
public class CountAllWords {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        String[] input = reader.nextLine().split("[ '-]");
        Integer wordsCounter = 0;

        for(Integer i = 0; i < input.length;i++){
            wordsCounter++;
        }

        System.out.println("Sentence words: " +wordsCounter);
    }
}
