import java.util.*;

/**
 * Created by Simeon on 9/7/2015.
 */
public class ExtractAllUniqueWords {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter your input: ");
        String[] input = reader.nextLine().split("\\W+");

        Set<String> uniqueSet = new TreeSet<String>();

        for(Integer i = 0; i < input.length;i++){
            uniqueSet.add(input[i].toLowerCase());
        }

        System.out.println();
        System.out.print("Unique word/s: ");
        System.out.println(String.join(" ",uniqueSet));
    }
}
