package com.github.gaetanofoster.initialproject.font;

public class FontRenderer {
    public static void RenderString(String string) {
        int indices[] = new int[string.length()];
        for (int i = 0; i < indices.length; i++) {
            indices[i] = Character.toLowerCase(string.charAt(i)) - 'a'; // get letter index
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < indices.length; j++) {
                try {
                    System.out.print(AsciiFont.getInstance().getLetter(indices[j])[i]);
                } catch (IndexOutOfBoundsException e) {
                    // user probably inputted a non-alphabetical character
                    System.out.println("\n\nFailed to render text. Reason: Only alphabet characters allowed.");
                    return;
                }
                if (j < indices.length - 1) {
                    System.out.print("   ");
                }
            }
            System.out.print("\n");
        }
    }
}
