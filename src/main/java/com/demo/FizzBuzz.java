package com.demo;

public class FizzBuzz 
{
    String processNumber(int num)
	{	
		if (num < 0) {
			return "Invalid Input";
		}
        	if (num % 3 == 0 && num % 5 != 0 ) {
        		return "Fizz";
        	}
        	if (num % 5 == 0 && num % 3 != 0) {
        		return "Buzz";
        	}
        	if (num % 15 == 0 ) {
        		return "FizzBuzz";
        	}
        	return String.valueOf(num);
	}
	
	String processNumbers (int[] numList)
	{
    	String s = "";
	    if(nums.length == 0){
	            return "Invalid Input";
	    }
	    for(int i = 0; i < nums.length-1; i++){
	    	if(nums[i] == 0) {
	    		s += String.valueOf(0) +", ";
	    	}
	    	if(nums[i] % 15 == 0){
	    		s += "FizzBuzz, ";
	        }
	        else if(nums[i] % 5 == 0){
	        	s += "Buzz, ";
	        }
	        else if(nums[i] % 3 == 0){
	        	s += "Fizz, ";
	        }
	        else{
	        	s += String.valueOf(nums[i]) + ", ";
	        }
	    }
	    if(nums[nums.length - 1] == 0) {
	    	s += String.valueOf(0);
	    } else if(nums[nums.length - 1] % 15 == 0) {
	    	s += "FizzBuzz";
	    } else if(nums[nums.length - 1] % 5 == 0) {
	    	s += "Buzz";
	    } else if(nums[nums.length - 1] % 3 == 0) {
	    	s += "Fizz";
	    } else {
	    	s += String.valueOf(nums[nums.length -1]);
	    }
	    
	    return s;
	}

}
