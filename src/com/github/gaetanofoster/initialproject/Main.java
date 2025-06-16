/*
 * Name: Gaetano Foster
 * Date: 6/16/2025
 * Project Title: InitialProject
 *
 * This program is part of the AP Computer Science A summer work. I was tasked with writing a program
 * that renders my initials in a creative way. I'm not particularly good with art, so I decided that
 * my best bet for creativity would be in the rendering logic itself, not the font.
 *
 * The way I wrote this program, it can render not only my initials, but the initials of any user of
 * the program. It asks for your initials and renders them using the FontRenderer class.
 *
 * HOW IT WORKS:
 *
 * Under the hood, there is a 2D array of Strings that is the font alphabet. The first dimension in
 * the array is the index of the letter in question, with 0 being 'A' and 25 being 'Z'. The second
 * dimension is the "layer" of the letter. The letters are 10x10 characters each, so there are 10
 * layers in each letter. The letters are read from a file called font.txt, which contains every letter
 * stacked on top one another in order.
 *
 * To render the letters horizontally, you have to go layer by layer, not letter by letter. This works
 * easily because all letters are a uniform 10x10 characters. If we went letter by letter, there would
 * be newline characters after each layer of each letter, meaning the letters would align vertically,
 * which is not good for our purposes.
 */

package com.github.gaetanofoster.initialproject;

import com.github.gaetanofoster.initialproject.font.FontRenderer;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your initials to be drawn!\nInput must be a string with alphabetical characters only!\n\n>>");
        String input = scanner.nextLine();

        FontRenderer.RenderString(input);
    }
}
