public class Person {

	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		int hash = 11;
		hash = 31 * hash + age;
		hash = 31 * hash + name.hashCode();
		return hash;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Person p = (Person) obj;
		return age == p.age && name.equals(p.name);
	}
	
	@Override
	public String toString() {
		return "Name: " + name + " Age: " + age;
	}
}
