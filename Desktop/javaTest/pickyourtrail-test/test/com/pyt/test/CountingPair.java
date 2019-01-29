package com.pyt.test;

public class CountingPair {
	
	public static void getPairsCount(int[] arr, int sub) 
    { 
  
		 int count = 0;
		  
	        for (int i = 0; i < arr.length; i++) 
	            for (int j = i + 1; j < arr.length; j++) 
	                if ((arr[i] - arr[j]) == sub) 
	                    count++; 
	  
	        System.out.printf(" of pairs is %d",count);
    } 

	public static void main(String[] args) {
		/*int i;
		List<Integer> listIntger = new ArrayList<Integer>();
		for( i =2;i>=1000;i++ ){
		  listIntger.add(i);	
		}
		int sum =2;
		getPairsCount(listIntger, sum);*/
		
		 int[] arr = { 1, 5, 7, -1, 5}; 
	        int sub = 2; 
	        getPairsCount(arr, sub); 
			

	}

}
