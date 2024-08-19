import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.Scanner;

public class Main {

    static List<Character> convertWordIntoSeparatedCharacters(String word) {
        char[] characters = word.toCharArray();
        List<Character> characterList = new ArrayList<>();

        for (char c : characters) {
            characterList.add(c);
        }
        // Sort the character list A-Ö
        Collections.sort(characterList);
        return characterList;
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Start writing the first word:");
        String firstWord = myScanner.nextLine();

        System.out.println("The first word is '" + firstWord + "', now write the second word:");
        String secondWord = myScanner.nextLine();

        List<Character> firstWordList = convertWordIntoSeparatedCharacters(firstWord);
        List<Character> secondWordList = convertWordIntoSeparatedCharacters(secondWord);

        // Compare the two lists
        boolean checkIfAnagrams = firstWordList.equals(secondWordList);

        if (checkIfAnagrams) {
            System.out.println();
            System.out.println("The words '" + firstWord + "' and '" + secondWord + "' are anagrams.");
        } else {
            System.out.println("The words '" + firstWord + "' and '" + secondWord + "' are not anagrams.");
        }
    }

}