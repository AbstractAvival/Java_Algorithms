/*
 * Quick Sort:
 *
 * A divide and conquer algorithm. It picks an element as
 * a pivot point and partitions the given array around said
 * pivot into sub-arrays. The sub-arrays are then sorted
 * recursively.
 * */
package com.company.SortingAlgorithms;

public class QuickSort {
    public void Sort( int [] unsortedArray, int startIndex, int endIndex ) {
        if( startIndex >= endIndex )
            return;

        int pivotIndex = Partition( unsortedArray, startIndex, endIndex );
        Sort( unsortedArray, startIndex, pivotIndex - 1 );
        Sort( unsortedArray, pivotIndex + 1, endIndex );
    }

    private int Partition( int [] unsortedArray, int startIndex, int endIndex ) {
        int pivotValue = unsortedArray[ endIndex ];
        int currentPivotIndex = startIndex - 1;

        for( int currentIndex = startIndex; currentIndex < endIndex; currentIndex++ ) {
            if( unsortedArray[ currentIndex ] < pivotValue ) {
                currentPivotIndex++;
                Swap( unsortedArray, currentIndex, currentPivotIndex );
            }
        }

        currentPivotIndex++;
        Swap( unsortedArray, currentPivotIndex, endIndex );
        return currentPivotIndex;
    }

    private void Swap( int [] targetArray, int firstTargetIndex, int secondTargetIndex ) {
        int placeholder = targetArray[ firstTargetIndex ];
        targetArray[ firstTargetIndex ] = targetArray[ secondTargetIndex ];
        targetArray[ secondTargetIndex ] = placeholder;
    }
}
