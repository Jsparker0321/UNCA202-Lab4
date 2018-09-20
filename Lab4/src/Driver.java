
public class Driver {

	public static void main(String [] args) {
	
		Person p1 = new Person("Bill", 30);
		System.out.println(p1);
		
		System.out.println(p1.hashCode());
		
		//Create a UniversityMember
		UniversityMember u1 = new UniversityMember("Nova Cane", 21, "486573201");
		System.out.println(u1);
		
		//Create a Professor
		Professor pro1 = new Professor("Martin McDowell", 40, "182216283", "ZEI 300");
		System.out.println(pro1);
		
		//Create a Student
		Student s1 = new Student("Carol", 23, "954756321", 4.3);
		System.out.println(s1);
	}
	
}
