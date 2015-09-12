import java.util.*;

/**
 * Created by Simeon on 9/7/2015.
 */
public class MostFrequentWord {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.print("Please, enter your sentence: ");
        String[] input = reader.nextLine().toLowerCase().split("\\W+");


        Map<String, Integer> wordsCounter = new TreeMap<String, Integer>();

        for(String word : input){

            Integer counter = wordsCounter.get(word);

            if(counter == null){
                counter = 0;
            }

            wordsCounter.put(word,counter + 1);
        }

        Integer maxValue = Integer.MIN_VALUE;

        for(Integer value : wordsCounter.values()){
            if(value > maxValue){
                maxValue = value;
            }
        }

        System.out.println("== Most frequent word/s ==");

        for(Map.Entry<String,Integer> frequentWord : wordsCounter.entrySet()){
            if(frequentWord.getValue().equals(maxValue)){

                System.out.printf("%s -> %d times",frequentWord.getKey(),frequentWord.getValue()).println();
            }
        }
    }
}
