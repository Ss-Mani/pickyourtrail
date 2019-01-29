package com.pyt.test;

import java.util.Stack;

public class Stacks {
	
	 static void stack_push(Stack<Integer> stack) 
	    { 
	        for(int i = 0; i < 5; i++) 
	        { 
	            stack.push(i); 
	        } 
	    } 
	 static void stack_pop(Stack<Integer> stack) 
	    { 
	        System.out.println("Pop :"); 
	  
	        if(stack.get(0).equals(4)){
	            Integer y = (Integer) stack.pop(); 
	            System.out.println(y); 
	        }
	        
	    } 
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>(); 
		  
        stack_push(stack); 
        stack_pop(stack); 
        stack_push(stack); 
	}

}
