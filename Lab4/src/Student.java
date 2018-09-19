
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
	public String toString() {
		return super.toString() + " GPA: " + gpa;
	}
	
}
