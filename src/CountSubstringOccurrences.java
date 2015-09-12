import com.sun.deploy.util.StringUtils;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Simeon on 9/5/2015.
 */
public class CountSubstringOccurrences {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.print("Please, enter your sentence: ");
        String input = reader.nextLine();

        System.out.print("Please, enter the seeken substring: ");
        String seekenSubstring = reader.nextLine();

        Integer seekenInterval = seekenSubstring.length();

        Integer substringsCounter = 0;

        for(Integer i = 0; i <= input.length() - seekenSubstring.length();i++){
            String pattern = input.substring(i,seekenInterval);

            if(pattern.toLowerCase().equals(seekenSubstring.toLowerCase())){
                substringsCounter++;
            }

            seekenInterval++;
        }

        System.out.println("Substring occurrences: " + substringsCounter + " time/s");

    }
}
