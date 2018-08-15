//package com.gradescope.psa1part2;
// The Line above is for the autograder on gradescope.
// You should keep it commented out until you are ready to submit.
// Just before you submit, uncomment the line (by removing the //)
// and save the file, but do not recompile it.
// If you need to make changes to your code and
// run it, add the comment back so Java will ignore this line on your account.
// Every time you resubmit, uncomment it again and save before you upload.

/**
* A simple "Turtle" class that draws text "art" to the screen
*/
public class ASCIITurtle
{
    // The current symbol to be drawn
    private char symbol;

    /**
    * Make a new ASCIITurtle with the default symbol *
    */
    public ASCIITurtle()
    {
        symbol = '*';
    }
    /**
    * Make a new ASCIITurtle with the specified symbol
    * @param s The symbol to be drawn
    */
    public ASCIITurtle(char s)
    {
        symbol = s;
    }

    /**
    * Draw numSymbols number of the current symbol
    */
    public void draw(int numSymbols)
    {
        for (int i = 0; i < numSymbols; i++) {
            System.out.print(symbol);
        }
    }

    /**
    *  Move the cursor to the right by numSpaces
    */
    public void makeSpace(int numSpaces)
    {
        for (int i = 0; i < numSpaces; i++) {
            System.out.print(" ");
        }
    }

    /**
    *  Move the cursor to the next line
    */
    public void newline()
    {
        System.out.print("\t\n");
    }

    /**
    * Change the symbol drawn
    * @param newSymbol The new symbol
    */
    public void setSymbol(char newSymbol)
    {
        symbol = newSymbol;
    }

}
