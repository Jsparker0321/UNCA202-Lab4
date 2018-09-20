
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
	public int hashCode() {
		int hash = 1;
		hash = 31 * super.hashCode();
		hash = 31 * officeNumber.hashCode();
		return hash;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		if (!super.equals(obj)) return false;
		Professor pro = (Professor) obj;
		return officeNumber.equals(pro.officeNumber);
	}
	
	
	
	
	
	
	@Override
	public String toString() {
		return super.toString() + " Office: " + officeNumber;
	}
}
