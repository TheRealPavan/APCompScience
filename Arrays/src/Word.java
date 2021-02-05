//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Word
{
   private static String vowels = "AEIOUaeiou";   	//why is this here? 
   																
   //add an instance variable
   	private String word;
   	private int vowelCount;
	//create a constructor
     public Word(String w) {
		this.word = w;
	    this.vowelCount = vowelCount;
  	}
	//create other methods
     
     public void setWord(String w) {
    	 this.word = w;
    	 
     }
     
     public int getLength() {
    	 return word.length();
     }
     
    
      
    		 
    	 
    		 
     
     
     public int getNumVowels() 
     
     {
    	  vowelCount = vowelCount;
     	 for (int i = 0; i<word.length(); i++) {
     		 if (word.charAt(i) == vowels.charAt(0) || word.charAt(i) == vowels.charAt(1) || word.charAt(i) == vowels.charAt(2) 
     		    || word.charAt(i) == vowels.charAt(3) || word.charAt(i) == vowels.charAt(4) || word.charAt(i) == vowels.charAt(5)
     		    || word.charAt(i) == vowels.charAt(6) || word.charAt(i) == vowels.charAt(7) || word.charAt(i) == vowels.charAt(8)
     		    || word.charAt(i) == vowels.charAt(9)) {
     			 
     		       vowelCount = vowelCount + 1;
     			  
     		 }
     	 }
    	 return vowelCount;
     }
	
     
     
   
     //look at the sample runner code
	//on the lab handout

	//create a toString method
     
     public String toString() {
    	 return word = word;
     }
     
   
}