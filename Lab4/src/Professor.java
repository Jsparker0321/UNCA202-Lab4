
public class Professor extends UniversityMember{

	private String officeNumber;

	public Professor(String name, int age, String idNumber, String officeNumber) {
		super(name, age, idNumber);
		this.officeNumber = officeNumber;
	}

}
