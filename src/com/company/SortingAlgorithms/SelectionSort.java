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
