import java.util.Scanner; 

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input word to be reversed: ");
        String word = input.nextLine(); //stores the word as word
    
        char[] charArray = word.toCharArray(); //turns the word into a character array instead of a string
        String reversedStr = ""; //create a variable for reversedStr

        for (int i = charArray.length - 1; i >= 0; i--) 
        { //traverses the word backwards
            reversedStr += charArray[i]; //the letter at the ith index is added to reversedStr
        }
        System.out.print(reversedStr);
    }
}