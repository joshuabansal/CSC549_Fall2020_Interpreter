package demo;

import java.util.ArrayList;

public class PersonEnvironment {
	
	ArrayList<Person> arrayList = new ArrayList<Person>();//Collection ro store object
	
	
	void setPerson(Person p){ //take one person 
		arrayList.add(p);//store in arrayList
	}
	
	Person getPerson(String name){ //get Person instance by name
		
		for(Person p:arrayList){
			if(p.personName.equals(name)){
				return p; //return person instance
			}
		}
		
		return null;
		
	}
	
	int getPersonAge(String name){
		
		for(Person p:arrayList){//for loop to iterate through an arraylist
			if(p.personName.equals(name)){
				return p.age;//return age value
			}
		}
		
		return -1;
		
	}

}
