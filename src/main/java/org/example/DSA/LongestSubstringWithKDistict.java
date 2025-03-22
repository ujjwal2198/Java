package org.example.DSA;

import java.util.HashMap;

public class LongestSubstringWithKDistict {

    public static int KDistictCharater(String s,int k){

        int start=0,windowSize=0,maxLength = Integer.MIN_VALUE;
        HashMap<Character,Integer> map = new HashMap<>();

        for (int end=0;end<s.length();end++){
            char right = s.charAt(end);
            map.put(right,map.getOrDefault(right,0)+1);

            while (map.size()>k) {
                char left = s.charAt(start);
                map.put(left,map.get(left)-1);
                if(map.get(left) == 0){
                    map.remove(left);
                }
                start+=1;

            }
            maxLength = Math.max(maxLength,end-start+1);


        }





        return maxLength;
    }

}
