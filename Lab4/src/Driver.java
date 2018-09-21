
public class Driver {

	public static void main(String [] args) {
	
		System.out.println("Person: ");
		System.out.println("-------------------------");
		Person p1 = new Person("Bill", 30);
		System.out.println(p1);
		System.out.println("hashCode: "); System.out.println(p1.hashCode());
		System.out.println("Equal (T) or Unequal (F)?");
		System.out.println("-------------------------");
		System.out.println("First Entry: "); System.out.println(new Person("Bobby", 32).equals(new Person("Billy", 34)));
		System.out.println("Second Entry: "); System.out.println(new Person("Bob", 32).equals(new Person("Bob", 32)));
		System.out.println();
		
		System.out.println("University Member: ");
		System.out.println("-------------------------");
		UniversityMember u1 = new UniversityMember("Nova Cane", 21, "486573201");
		System.out.println(u1);
		System.out.println("hashCode: "); System.out.println(u1.hashCode());
		System.out.println("Equal (T) or Unequal (F)?");
		System.out.println("-------------------------");
		System.out.println("First Entry: "); System.out.println(new UniversityMember("Carlos Cruiz", 23, "123456789").equals(new UniversityMember("Carlos Cruiz", 23, "123456789")));
		System.out.println("Second Entry: "); System.out.println(new UniversityMember("Samantha Manda", 22, "123456789").equals(new UniversityMember("Susie Walker", 22, "987654321")));
		System.out.println();
		
		
		System.out.println("Professor: ");
		System.out.println("-------------------------");
		Professor pro1 = new Professor("Martin McDowell", 40, "182216283", "ZEI 300");
		System.out.println(pro1);
		System.out.println("hashCode: "); System.out.println(pro1.hashCode());
		System.out.println("Equal (T) or Unequal (F)?");
		System.out.println("-------------------------");
		System.out.println("First Entry: "); System.out.println(new Professor("Melton Marvin", 44, "765894123", "RRO 231").equals(new Professor("Robin Rogers", 41, "456789123", "KAR 231")));
		System.out.println("Second Entry: "); System.out.println(new Professor("Becky Brown", 48, "123789456", "WHI 100").equals(new Professor("Becky Brown", 48, "123789456", "WHI 100")));
		System.out.println();
		
		
		System.out.println("Student: ");
		System.out.println("-------------------------");
		Student s1 = new Student("Carol", 23, "954756321", 4.3);
		System.out.println(s1);
		System.out.println("hashCode: "); System.out.println(s1.hashCode());
		System.out.println("Equal (T) or Unequal (F)?");
		System.out.println("-------------------------");
		System.out.println("First Entry: "); System.out.println(new Student("Michael Mack", 21, "741852963", 4.0).equals(new Student("Michael Mack", 21, "741852963", 4.0)));
		System.out.println("Second Entry: "); System.out.println(new Student("Marvin Rice", 26, "987852123", 2.5).equals(new Student("Steve Strange", 19, "951753852", 4.6)));
		System.out.println();
	}
	
}
