package org.example;

import org.example.DSA.LongestSubstringWithKDistict;
import org.example.DSA.SlidingWindowNormal;
import org.example.DSA.VariableLengthSlidingWindow;

public class Main {
    static int arr [] = {2,1,5,1,3,2};
    static int k =6;
    public static void main(String[] args) {
//        maxSumSlidingWindow();
//        variSumSlidingWindow();
        KthUniqueSlidingWindow();
//        System.out.println("Hello, World!");
    }
    public static void maxSumSlidingWindow(){
        SlidingWindowNormal slidingWindowNormal = new SlidingWindowNormal();
        int maxSum = slidingWindowNormal.maxSumSlidingWindow(arr,k);
        System.out.println("Max Sum Subarray "+maxSum);
    }
    public static void variSumSlidingWindow(){
        VariableLengthSlidingWindow variableLengthSlidingWindow=new
                VariableLengthSlidingWindow();
        int maxSum = variableLengthSlidingWindow.minLengthTarget(arr,k);
        System.out.println("Max Sum Subarray "+maxSum);
    }
    public static void KthUniqueSlidingWindow(){
        String s= "eceba";
        int k = 2;
        LongestSubstringWithKDistict longestSubstringWithKDistict = new LongestSubstringWithKDistict();
        int maxSum = longestSubstringWithKDistict.KDistictCharater(s,k);
        System.out.println("K Sum Subarray "+maxSum);
    }
}