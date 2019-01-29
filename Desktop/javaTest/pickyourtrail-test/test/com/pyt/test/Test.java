package com.pyt.test;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
	 //find the unique element and add them
		int i,j =0;
		List<Integer> listValues = new ArrayList<>();
		
		for(i =0;i<=2000;i++){
			listValues.add(i);
		}
		
		for(j=0; j<=3000;j++){
			listValues.add(j);
		}
		List<Integer> uniqueValues = new ArrayList<>();
		uniqueValues = listValues.stream().map(l -> l).distinct().collect(Collectors.toList());
        ;
		//System.out.println(uniqueValues.stream().map(s->s).reduce(0,Integer::sum));
		System.out.println("**Q1***sum of the unique values in array*****");
		IntSummaryStatistics stats = uniqueValues.stream().mapToInt((l) -> l).summaryStatistics();
	    System.out.println("Sum of the value is :" +stats.getSum());		
	    
	// push and pop the values from the array
	    System.out.println("**Q2***stack operation*****");
	    Stack<Integer> stack = new Stack<>();
	    //System.out.println("push 4");
	    stack.push(4);
	    System.out.println("4");
	    //System.out.println("pop");
	    stack.pop();
	    System.out.println("EMPTY");
	    stack.push(3);
	    System.out.println("3");
	    stack.push(5);
	    System.out.println("5");
	    stack.push(2);
	    System.out.println("2");
	    stack.push(3);
	    System.out.println("3");
	    stack.push(6);
	    System.out.println("6");
	    stack.push(1);
	    System.out.println("1");
	    stack.push(1);
	    System.out.println("1");
	    stack.push(4);
	    System.out.println("1");
	    stack.push(8);
	    System.out.println("8");
	    
	    
	    //stack.push(1);
	    //System.out.println("stack values:" +stack);
	    //stack.pop().equals(1);
	    /*System.out.println("stack values after pop:" +stack);
	    for(int k =1;k<=2000000;k++){ //value : 2000000
	    	if(stack.size() == 0){
	    		System.out.println("Intial stack:"+stack.capacity());
	    		stack.push(k);
	    		System.out.println("stack size:" +stack.size());
	    	}else if(stack.get(0) != null){
	    		stack.pop();
	    		//stack.firstElement();
	    	}
	    	
	    	
	    }
	    System.out.println("stack size:" +stack.size());
	    System.out.println("stack Capacity:" +stack.size());
	    System.out.println("stack view:" +stack);*/
	    
	}

}
