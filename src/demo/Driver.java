package demo;

public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person p1 = new Person("John",50,"M");
		Person p2 = new Person("Hellen",60,"F");
		Person p3 = new Person("Tom",40,"M");
		
		PersonEnvironment pe = new PersonEnvironment();
		pe.setPerson(p1);pe.setPerson(p2);pe.setPerson(p3);
		
		System.out.println(pe.getPersonAge("Tom"));//return int
		
		Person pp=pe.getPerson("John");
		System.out.println(pp.gender +" "+pp.age );

	}

}
