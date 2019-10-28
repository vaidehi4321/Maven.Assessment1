package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicArrayUtils {
    /**
     * @param stringArray an array of String objects
     * @return the first element in the array
     */

    public static String getFirstElement(String[] stringArray) {
        String first="";

        first=first+stringArray[0];


        return first;
    }

    /**
     * @param stringArray an array of String objects
     * @return the second element in the array
     */
    public static String getSecondElement(String[] stringArray)
    {
        String second="";
        second=second+stringArray[1];
        return second ;
    }

    /**
     * @param stringArray an array of String objects
     * @return the last element in the array
     */
    public static String getLastElement(String[] stringArray) {
        String last="";
        int l=stringArray.length;
        last=last+stringArray[l-1];
        return last;
    }

    /**
     * @param stringArray an array of String objects
     * @return the second to last element in the array
     */
    public static String getSecondToLastElement(String[] stringArray) {
        String secondLast="";
        int l=stringArray.length;
        secondLast=secondLast+stringArray[l-2];

        return secondLast;
    }
}
