package org.example.DSA;

public class SlidingWindowNormal {
    public static int maxSumSlidingWindow(int arr[],int k){
        int maxSum=0 , windowSum=0;
        for (int i=0;i<k;i++){
            maxSum+=arr[i];
        }
        windowSum = maxSum;

        for ( int i=k ;i< arr.length;i++){
            windowSum = windowSum+arr[i]-arr[i-k];
            maxSum = Math.max(windowSum,maxSum);
        }

        return maxSum;
    }
}
