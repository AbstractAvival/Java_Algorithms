/*
 * Shell Sort:
 *
 * An improved insertion sort. Starts by sorting pairs of
 * elements far apart from each other, then progressively
 * reduces the gap between elements to be compared. Running
 * time is heavily dependent on the gap sequence used.
 * */
package com.company.SortingAlgorithms;

public class ShellSort {
    //using shell sort's original sequence: k = n / 2
    public void Sort( int [] unsortedArray ) {
        int interval = unsortedArray.length / 2;
        while( interval > 0 ) {
            for( int currentIndex = 0; currentIndex < interval; currentIndex++ ) {
                for( int sortPosition = currentIndex; sortPosition < unsortedArray.length; sortPosition += interval ) {
                    int placeholder = unsortedArray[ sortPosition ];
                    int reversePosition = sortPosition;
                    for( ; reversePosition >= interval && unsortedArray[ reversePosition - interval ] > placeholder; reversePosition -= interval ) {
                        unsortedArray[ reversePosition ] = unsortedArray[ reversePosition - interval ];
                    }
                    unsortedArray[ reversePosition ] = placeholder;
                }
            }
            interval /= 2;
        }
    }
}
