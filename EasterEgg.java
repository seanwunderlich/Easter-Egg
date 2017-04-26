/**  * EasterEgg
 * * @author Sean Wunderlich
 * ITSE 1302-011
 * */

import java.util.*;
import java.io.*;

public class EasterEgg
        implements Comparable<EasterEgg>{
    private static int intEggCounter = 0;
    private char chrSymbol = '#';

    /**      * Main function to see default egg printed.      */

    public static void main(String [] strEgg) {
        EasterEgg objEgg = new EasterEgg();
        System.out.println(objEgg);
        objEgg.print('%');
    }

    public EasterEgg() {
        setSymbol('#');
        intEggCounter++;
    }

    public EasterEgg(char pchrOutput) {
        setSymbol(pchrOutput);
        intEggCounter++;
    }

    public char getSymbol() {
        return chrSymbol;
    }

    public void setSymbol(char pchrSymbol) {
        chrSymbol = pchrSymbol;
    }

    public static int getNumberOfEggs() {
        return intEggCounter;
    }
    /**      * Prints out an Easter Egg with chrSymbol as the symbol inside.
     * * @param chrSymbol The character displayed inside the egg.
     * */
    @Deprecated

    public void print(char pchrSymbol) {
        setSymbol(pchrSymbol);
        System.out.println(this);
    }

    /**      * Returns the egg as a string
     * */

    public String toString() {
        String strEgg = "";
        strEgg += "  __  \n";
        strEgg += " /" + getSymbol() + getSymbol() + "\\ \n";
        strEgg += "/"  + getSymbol() + getSymbol() + getSymbol() + getSymbol() + "\\ \n";
        strEgg += "|"  + getSymbol() + getSymbol() + getSymbol() + getSymbol() + "|\n";
        strEgg += "\\____/\n";         return strEgg;
    }

    public int compareTo(EasterEgg objEgg) {
        final int BEFORE = -1;
        final int EQUAL = 0;
        final int AFTER = 1;

        if(this == objEgg) return EQUAL;
        if(this.getSymbol() < objEgg.getSymbol())
            return BEFORE;
        if(this.getSymbol() == objEgg.getSymbol())
            return EQUAL;
        if(this.getSymbol() > objEgg.getSymbol())
            return AFTER;
        return AFTER;
    }
}
