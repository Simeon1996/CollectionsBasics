import java.util.Scanner;

/**
 * Created by Simeon on 9/4/2015.
 */
public class SequencesOfEqualStrings {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.println("Please, enter some elements: ");
        String[] input = reader.nextLine().split(" ");

        for(Integer i = 0;i < input.length - 1;i++){
            if(input[i].equals(input[i + 1])){
                System.out.print(input[i] + " ");
            }else{
                System.out.println(input[i]);
            }
        }
        System.out.print(input[input.length - 1]);
    }
}
