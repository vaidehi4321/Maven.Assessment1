package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints){
        ArrayList<Integer> listOfOdds=new ArrayList<>();
        int k =0;
   for( int i = 0; i<ints.length; i++){
       if(ints[i] % 2 !=0){
           listOfOdds.add(ints[i]);
       }
   }

        Integer[] array = new Integer[listOfOdds.size()];
        listOfOdds.toArray(array);
        return array;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        ArrayList<Integer>listOfEvens=new ArrayList<>();
        for(int i = 0; i < ints.length; i++){
            if(ints[i] % 2 == 0){
                listOfEvens.add(ints[i]);
            }
        }
        Integer[] arrayOfEvens = new Integer[listOfEvens.size()];
        listOfEvens.toArray(arrayOfEvens);
        return arrayOfEvens;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        ArrayList<Integer>listFreeOfMultiplesOfThree=new ArrayList<>();
        for(int i = 0; i<ints.length; i++){
            if(ints[i] % 3 != 0){
                listFreeOfMultiplesOfThree.add(ints[i]);
            }
        }
        Integer[] arrayFreeOfMultiplesOfThree = new Integer[listFreeOfMultiplesOfThree.size()];
        arrayFreeOfMultiplesOfThree = listFreeOfMultiplesOfThree.toArray(arrayFreeOfMultiplesOfThree);
        return arrayFreeOfMultiplesOfThree;
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i = 0; i<ints.length; i++){
            if(ints[i] % multiple != 0){
                list.add(ints[i]);
            }
        }
        Integer[] arr = new Integer[list.size()];
        arr = list.toArray(arr);
        return arr;

    }
}
