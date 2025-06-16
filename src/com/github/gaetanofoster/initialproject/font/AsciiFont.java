package com.github.gaetanofoster.initialproject.font;

import com.github.gaetanofoster.initialproject.utils.Utils;

public class AsciiFont {
    private static AsciiFont instance;
    private static String alphabet[][];

    private AsciiFont() {
        alphabet = new String[26][10]; // First dimension of the array is the index of the letter in the alphabet; the second an array containing the different characters of the 2D matrix of letters that makes up the larger character

        // Example:
        // alphabet[0][0] = "    AA    ";
        // alphabet[0][1] = "  AA  AA  ";
        // alphabet[0][2] = " AAA  AAA ";
        // alphabet[0][3] = "AAA    AAA";
        // alphabet[0][4] = "AAA    AAA";
        // alphabet[0][5] = "AAAAAAAAAA";
        // alphabet[0][6] = "AAA    AAA";
        // alphabet[0][7] = "AAA    AAA";
        // alphabet[0][8] = "AAA    AAA";
        // alphabet[0][9] = "AAA    AAA";

        // Letters are loaded from font.txt
        // Font is 10x10 and loosely based on classic IBM VGA fonts
        String file = Utils.loadFileAsString("res/font.txt");
        String tokens[] = file.split("\\s+"); // tokenize file by whitespace; specifically by lines

        for (int i = 0; i < tokens.length; i++) { // turn . into space in tokens for easy reading
            tokens[i] = tokens[i].replace('.', ' ');
        }
        for (int alphabetIndex = 0; alphabetIndex < 26; alphabetIndex++) {
            for (int layerIndex = 0; layerIndex < 10; layerIndex++) {
                alphabet[alphabetIndex][layerIndex] = tokens[alphabetIndex * 10 + layerIndex];
            }
        }
    }

    public static AsciiFont getInstance() {
        if (instance == null) {
            instance = new AsciiFont();
        }
        return instance;
    }

    public String[] getLetter(int index) {
        return alphabet[index];
    }
}
