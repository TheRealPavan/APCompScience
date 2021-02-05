package org.legendtitans.arraylist;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String[] coolPeople = new String[3];
		
		//add values
		coolPeople[0] = "Derek";
		coolPeople[1] = "Tommy";
		coolPeople[2] = "Tommy2";
		
		//get values
		System.out.println(coolPeople[0]);
		System.out.println(coolPeople[1]);
		System.out.println(coolPeople[2] + "\n");
		
		
		
		
		ArrayList<String> notCoolPeople = new ArrayList<String>();
		
		notCoolPeople.add("Suter");
		notCoolPeople.add("Poop-Man");
		notCoolPeople.add("Jimmy Williams");
		
		System.out.println(notCoolPeople.get(0));
		System.out.println(notCoolPeople.get(1));
		System.out.println(notCoolPeople.get(2) + "\n");
		
		
		//1. Remove Middle Element and Add New Element
		
		notCoolPeople.remove(1);
		
		//2. Add New String
		
		notCoolPeople.add("Jim-Bob");
		
		
		//3. Reprint
		
		System.out.println(notCoolPeople.get(0));
		System.out.println(notCoolPeople.get(1));
		System.out.println(notCoolPeople.get(2));
 	}

}
