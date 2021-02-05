//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

//design and create
//your Toy class

//Use the lab handout
//and sample runner
//code provided
//to help you

public class Toy {
	
	String name;
	int count;
	
	public Toy(String n) {
		
		name = n;
		count = 1;
	}
	
	public void setCount(int c) {
		count = c;
	}
	
	
	public void setName(String n) {
		
		name = n;
	}
	
	public int getCount() {
		
		return count;
	}
	
	public String getName() {
		
		return name;
	}

	
	
}