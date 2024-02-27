package com.target20.dsa;

import java.util.*;

public class valueEqualToIndex {
	
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) 
    {
        // code here
        ArrayList<Integer> ans = new ArrayList();
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==i+1)
            {
                ans.add(arr[i]);
            }
        }
        
        return ans;
    }
}
