//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;

public class ListMostFreq
{
	//method go will return the value 
	//that appears the most
	//if several numbers all appear
	//the same number of times
	//return the first number found
	public static int go( ArrayList<Integer> ray )
	{
		int numToCheckCount = 0;
		int maxValue = 0;
		for (int i = 0; i < ray.size(); i++) {
		  int   numToCheck = ray.get(i);
		  for (int j = 0; j < ray.size(); j++) {
			  
			  if (numToCheck == ray.get(j)) {
				 numToCheckCount = numToCheckCount + 1;
				 
				
			  }
			  
			  
			  
		  }


		
		
	}
		return maxValue;
		
	}
}