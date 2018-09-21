
public class Driver {

	public static void main(String [] args) {
	
		Person p1 = new Person("Bill", 30);
		System.out.println(p1);
		System.out.println(p1.hashCode());
		System.out.println();
		
		UniversityMember u1 = new UniversityMember("Nova Cane", 21, "486573201");
		System.out.println(u1);
		System.out.println(u1.hashCode());
		System.out.println();
		
		
		
		Professor pro1 = new Professor("Martin McDowell", 40, "182216283", "ZEI 300");
		System.out.println(pro1);
		System.out.println(pro1.hashCode());
		System.out.println();
		
	
		Student s1 = new Student("Carol", 23, "954756321", 4.3);
		System.out.println(s1);
		System.out.println(s1.hashCode());
		System.out.println();
	}
	
}
