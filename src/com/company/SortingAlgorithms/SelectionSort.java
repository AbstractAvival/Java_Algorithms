/*
 * Selection Sort:
 *
 * Sorts an array by repeatedly finding the minimum element
 * (or largest, depending on sorting order) in the unsorted list,
 * swapping it with the leftmost unsorted element, and moving
 * the sublist boundaries one element to the right.
 *
 * Similar to Insertion Sort, but generally performs worse.
 * */
package com.company.SortingAlgorithms;

public class SelectionSort {
    public void Sort( int [] unsortedArray ) {
        for( int index = 0; index < unsortedArray.length; index++ ) {
            int minimumIndex = index;
            int offsetIndex = minimumIndex + 1;
            while( offsetIndex < unsortedArray.length ) {
                if( unsortedArray[ offsetIndex ] < unsortedArray[ minimumIndex ] ) {
                    minimumIndex = offsetIndex;
                }
                offsetIndex++;
            }
            int placeholder = unsortedArray[ index ];
            unsortedArray[ index ] = unsortedArray[ minimumIndex ];
            unsortedArray[ minimumIndex ] = placeholder;
        }
    }
}
