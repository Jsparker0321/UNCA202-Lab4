
public class Professor extends UniversityMember{

	private String officeNumber;

	public Professor(String name, int age, String idNumber, String officeNumber) {
		super(name, age, idNumber);
		this.officeNumber = officeNumber;
	}

	public String getOfficeNumber() {
		return officeNumber;
	}
	
	public void setName(String officeNumber) {
		this.officeNumber = officeNumber;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Office: " + officeNumber;
	}
}
