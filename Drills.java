import java.util.Scanner;
import java.lang.Math;
public class Drills{

    public static void main(String[] args){

        // Declare 5 different data types with initial values
        String str = "Bosnia";
        int num = 5;
        double numnum = 4.3;
        char a = 'b';
        boolean pendingWarCrimeChargesOrNot = true;

        // A standard for loop printing a message three times
        for(int i = 0; i < 3; i++){
            System.out.println("Hello World");
        }

        // A for-each loop traversing a String[array]
        String[] arr = {"bob", "joe"};
        for(int j = 0; j <= arr.length - 1; j++){
            System.out.println(arr[j]);
        }

        // An infinite loop
        while(true){
            System.out.println("this statement is false");
        }

        // a short-circuit conditional with four tests
        boolean bool1 = false;
        boolean bool2 = false;
        boolean bool3 = false;
        boolean bool4 = false;
        if(Math.random() > 0.8){
            bool4 = true;
        } else if(Math.random() > 0.6){
            bool3 = true;
        } else if(Math.random() > 0.4){
            bool2 = true;
        }else if(Math.random() > 0.2){
            bool1 = true;
        }

        if(bool1 || bool2 || bool3 || bool4){
            System.out.println("The order of conditions above is most efficient because bool1 is most likely to be true and thus it will not run the other less likely tests if bool1 is true; the opposite order would be least efficient");
        }

        // Break a loop if a conditional passes
        String sentence = "Look behind you Mr. A";
        for(int o = 0; o < sentence.length() - 1; o++){
            if(sentence.charAt(o) == 'o'){
                System.out.println("Aha! This sentence contains the char o");
                break;
            }
        }

        // Loop through each char in a String
        String example = "I am hungry today";
        loopChars(example);

        // Print only the first three letters in “word”
        System.out.println(firstThree("word"));

        // Print all the odd numbers from 1 - 100
        for(int k = 1; k < 100; k = k + 2){
            System.out.println(k);
        }

        // Create a Scanner and take an input
        Scanner input = new Scanner(System.in);
        System.out.println("Give me a word");
        String word = input.nextLine();
        System.out.println("Your word was " + word);

        // Create a Scanner, take a number, and count down from that number to 0
        Scanner newInput = new Scanner(System.in);
        System.out.println("Give me number");
        String countString = newInput.nextLine();
        int countdown = Integer.parseInt(countString);
        for(int p = countdown; p >= 0; p--){
            System.out.println(p);
        }

    }
    public static String firstThree(String str){
        String result = "";
        for(int l = 0; l < 3; l++){
            result += str.charAt(l);
        }
        return result;
    }

    public static void loopChars(String str){
        for(int n = 0; n < str.length(); n++){
            System.out.println(str.charAt(n));
        }
    }

    // Create a method that returns a comparison (include a JavaDoc comment)
    /**
     * @param ch1 the char that the function checks is before the other char
     * @param ch2 the char that is being compared to ch1
     * @return whether ch1 comes before ch2 in the alphabet
     */
    public static boolean isChar1FirstInAlphabet(char ch1, char ch2){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        if(alphabet.indexOf(ch1) < alphabet.indexOf(ch2)){
            return true;
        }
        return false;
    }
}