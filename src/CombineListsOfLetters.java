import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Simeon on 9/7/2015.
 */
public class CombineListsOfLetters {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.print("First sequence of characters: ");
        String[] firstInput = reader.nextLine().split(" ");

        System.out.print("Second sequence of characters: ");
        String[] secondInput = reader.nextLine().split(" ");

        ArrayList<Character> mainList = new ArrayList<Character>();

        ArrayList<Character> combinedList = new ArrayList<Character>();

        for(Integer i = 0; i < firstInput.length;i++){

            String sourcedString = firstInput[i];

            mainList.add(sourcedString.charAt(0));
        }

        combinedList.addAll(mainList);

        for(Integer j = 0; j < secondInput.length;j++){

            String element = secondInput[j];

            if(!mainList.contains(element.charAt(0))){
                combinedList.add(combinedList.size(),element.charAt(0));
            }
        }

        System.out.println();
        System.out.print("Combined letters: ");
        for(Integer i = 0; i < combinedList.size();i++){
            System.out.print(combinedList.get(i) + " ");
        }
    }
}
