import java.util.*;

/**
 * Created by Simeon on 9/7/2015.
 */
public class CardsFrequencies {
    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);

        System.out.println("Please, enter your cards: ");
        String[] input = reader.nextLine().split("\\W+");

        LinkedHashMap<String,Double> elements = new LinkedHashMap<String,Double>();

        for(String word : input){
            Double wordCounter = elements.get(word);

            if(wordCounter == null){
                wordCounter = 0d;
            }

            elements.put(word,wordCounter + 1);
        }

        for(Map.Entry<String,Double> value : elements.entrySet()){
            String card = value.getKey();

            Double cardOccurrences = (value.getValue() / input.length) * 100;

            System.out.println();
            System.out.println("Output");
            System.out.printf("%s -> %.2f%%",card,cardOccurrences).println();
        }
    }
}
