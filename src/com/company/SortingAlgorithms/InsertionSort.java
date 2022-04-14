/*
* Insertion Sort:
*
* A simple sorting algorithm that builds the final sorted array
* one item at a time. It's efficient when sorting a small number
* of elements.
* */
package com.company.SortingAlgorithms;

public class InsertionSort {
    public void Sort( int [] unsortedArray ) {
        for( int index = 1; index < unsortedArray.length; index++ )
        {
            int key = unsortedArray[ index ];
            int currentItem = index - 1;
            while( currentItem > -1 && unsortedArray[ currentItem ] > key ) {
                unsortedArray[ currentItem + 1 ] = unsortedArray[ currentItem ];
                currentItem--;
            }
            unsortedArray[ currentItem + 1 ] = key;
        }
    }
}