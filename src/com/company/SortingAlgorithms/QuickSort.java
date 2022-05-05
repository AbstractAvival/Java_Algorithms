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
        return 0;
    }
}
