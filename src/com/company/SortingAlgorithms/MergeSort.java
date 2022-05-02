/*
 * Merge Sort:
 *
 * An efficient, general-purpose, and comparison-based sorting
 * algorithm. Merge sort is a divide and conquer algorithm. It
 * divides the input array into halves until it has n sublists,
 * then it repeatedly merges these sublists until there is only
 * one sublist remaining. This final sublist is the sorted list.
 * */
package com.company.SortingAlgorithms;

public class MergeSort {
    public void Sort( int [] unsortedArray, int initialIndex, int finalIndex ) {
        if( initialIndex >= finalIndex )
            return;

        int middleIndex = ( initialIndex + finalIndex ) / 2;
        Sort( unsortedArray, initialIndex, middleIndex );
        Sort( unsortedArray, middleIndex + 1, finalIndex );
        Merge( unsortedArray, initialIndex, middleIndex, finalIndex );
    }

    private void Merge( int [] unsortedArray, int initialIndex, int middleIndex, int finalIndex ) {
        final int firstArraySize = middleIndex - initialIndex + 1;
        final int secondArraySize = finalIndex - middleIndex;

        int [] firstArray = new int[ firstArraySize ];
        int [] secondArray = new int[ secondArraySize ];

        System.arraycopy( unsortedArray, initialIndex, firstArray, 0, firstArraySize );
        System.arraycopy( unsortedArray, middleIndex + 1, secondArray, 0, secondArraySize );

        int firstArrayIndex = 0;
        int secondArrayIndex = 0;
        int mergedArrayIndex = initialIndex;

        while( firstArrayIndex < firstArraySize && secondArrayIndex < secondArraySize ) {
            if( firstArray[ firstArrayIndex ] < secondArray[ secondArrayIndex ] ) {
                unsortedArray[ mergedArrayIndex ] = firstArray[ firstArrayIndex ];
                firstArrayIndex++;
            }
            else {
                unsortedArray[ mergedArrayIndex ] = secondArray[ secondArrayIndex ];
                secondArrayIndex++;
            }
            mergedArrayIndex++;
        }

        while( firstArrayIndex < firstArraySize ) {
            unsortedArray[ mergedArrayIndex ] = firstArray[ firstArrayIndex ];
            firstArrayIndex++;
            mergedArrayIndex++;
        }

        while( secondArrayIndex < secondArraySize ) {
            unsortedArray[ mergedArrayIndex ] = secondArray[ secondArrayIndex ];
            secondArrayIndex++;
            mergedArrayIndex++;
        }
    }
}
