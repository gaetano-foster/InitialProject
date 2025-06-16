# Initials Renderer

Developed as part of AP Computer Science A summer coursework. It renders the user's initials in a stylized way using ASCII art.

## Overview

This program renders any set of initials using a consistent 10x10 ASCII font defined in an external file (`font.txt`).

## How It Works

- `font.txt` contains all uppercase letters (A–Z), each represented as a 10 line ASCII block.
- All letters are stacked sequentially (file has 260 lines).
- The program stores each letter in a 2D array:  
  `alphabet[alphabetIndex][layerIndex]`
- To render text horizontally, the program iterates through each layer of the input letters and prints them sequentially, ensuring proper alignment.

## Key Features

- Accepts user input for initials (any characters A–Z).
- Uniform rendering regardless of input length.
- Clean, modular design with potential for font customization and further expansion.

## Potential Improvements

- Support for lowercase letters, numbers, and other characters (though not necessary for the assignment, it would be nice.)
- Better exception handling.

## Example Output

```console
Input your initials to be drawn!
Input must be a string with alphabetical characters only!

>>GGF

   GGGGGG       GGGGGG    FFFFFFFFFF
 GGGG   GG    GGGG   GG   FFFFFFFFFF
GGG          GGG           FFF      
GGG          GGG           FFF      
GGG          GGG           FFFFFF   
GGG          GGG           FFFFFF   
GGG   GGGG   GGG   GGGG    FFF      
GGG     GG   GGG     GG    FFF      
 GGGG   GG    GGGG   GG    FFF      
   GGGGGG       GGGGGG    FFFFFF    
```
