package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int counter = 0;
        for (int i = 0; i < objectArray.length; i++) {
            if (objectArray[i] == objectToCount) {
                counter = counter + 1;
            }
        }

        return counter;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        int n = getNumberOfOccurrences(objectArray, objectToRemove);
        int m = objectArray.length - n;
        Object[] arr = new Object[m];
        int j = 0;
        for (int i = 0; i < objectArray.length; i++) {
            if (objectArray[i] != objectToRemove) {
                arr[j] = objectArray[i];
                j++;
            }
        }

        Integer[] integerArray = Arrays.copyOf(arr, arr.length, Integer[].class);
        return integerArray;


    }


    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        Integer[] occurrences = new Integer[objectArray.length];

        for (int i = 0; i < objectArray.length; i++) {

            occurrences[i] = getNumberOfOccurrences(objectArray, objectArray[i]);


        }

        int mostCommon = occurrences[0];
        int maxIndex = 0;
        for (int i = 0; i < occurrences.length; i++) {
            if (occurrences[i] >= mostCommon) {
                mostCommon = occurrences[i];
                maxIndex = i;
            }
        }

        return objectArray[maxIndex];
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        Integer[] occurrences = new Integer[objectArray.length];
        for (int i = 0; i < objectArray.length; i++) {
            occurrences[i] = getNumberOfOccurrences(objectArray, objectArray[i]);
        }
        int leastCommon = occurrences[0];
        int minIndex = 0;
        for (int j = 0; j < occurrences.length; j++) {
            if (occurrences[j] <= leastCommon) {
                leastCommon = occurrences[j];
                minIndex = j;

            }
        }
        return objectArray[minIndex];
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        int l1 = objectArray.length;
        int l2 = objectArrayToAdd.length;
        int l = l1 + l2;
        Object[] mergedArr = new Object[l];
for(int i=0 ;i<objectArray.length ; i++){
    mergedArr[i]=objectArray[i];
}
for(int j=0 ;j<objectArrayToAdd.length;j++){
    mergedArr[l1+j]=objectArrayToAdd[j];
}




        Integer[] integerArray = Arrays.copyOf(mergedArr, mergedArr.length, Integer[].class);
        return integerArray;
    }

}