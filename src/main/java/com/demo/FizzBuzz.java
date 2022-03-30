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
	    if(numList.length == 0){
	            return "Invalid Input";
	    }
	    for(int i = 0; i < numList.length; i++){
	    	if(numList[i] % 15 == 0){
	    		s += "FizzBuzz";
	        }
	        else if(numList[i] % 5 == 0){
	        	s += "Buzz";
	        }
	        else if(numList[i] % 3 == 0){
	        	s += "Fizz";
	        }
	        else{
	        	s += String.valueOf(numList[i]);
	        }
	    }
	    return s;
	}

}
