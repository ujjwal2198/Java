package org.example.DSA;

public class VariableLengthSlidingWindow {

    public int minLengthTarget(int arr[],int target){
        int start=0 , windowSum=0;
        int min = Integer.MAX_VALUE;

        for (int end =0; end< arr.length ;end++){
            windowSum += arr[end];
            while(windowSum>=target){
                windowSum=windowSum-arr[start];
                start=start+1;
            }
            min = Math.min(end-start+1,min);
        }
        return min==Integer.MAX_VALUE ? 0 :min;
    }
}
