
public class Student extends UniversityMember {

	private double gpa;

	public Student(String name, int age, String idNumber, double gpa) {
		super(name, age, idNumber);
		this.gpa = gpa;
	}

	public double getGPA() {
		return gpa;
	}

	public void setGPA(double gpa) {
		this.gpa = gpa;
	}
	
	
	@Override
	public int hashCode() {
		
		int hash = 17;
		long gpaLong = Double.doubleToLongBits(gpa);
		hash = 31 * super.hashCode();
		return hash;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		if (!super.equals(obj)) return false;
		Student stu = (Student) obj;
		//Will compare numeric values rather than reference:
		return Double.valueOf(gpa).equals(Double.valueOf(stu.gpa));
	
		//return Double.valueOf(gpa) == Double.valueOf(stu.gpa);
		
	}

	@Override
	public String toString() {
		return super.toString() + " GPA: " + gpa;
	}
	
}
