package demo;

public class ReverseOrder {

	public static void main(String[]args){
		String s = "A elephant lives in the zoo";// I defined the string 
		//aultimatlly return answer down hear 
		System.out.println(s); // I print the string hear 
		String answer = ReverseOrder.parse(s);
		System.out.println(answer);
	}
	
	//write a function that takes a string and replace all
	//word (tokens)that are at least 5 character long with
	// the reverse of that token
	// If this is input (A elephant lives in the zoo)
    //then the out put will be (tnahpele sevil in the zoo)
	
	public static String parse(String s){ // return string and called parse
	// take string as a parameter 	
	String[]parts = s.split(" "); //string array called parts // I split the string in peaces 
	System.out.println(parts.length);
	System.out.println(parts[1]);
	return "woot";
	}
}

