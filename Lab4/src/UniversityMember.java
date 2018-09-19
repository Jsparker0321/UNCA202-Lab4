public class UniversityMember extends Person {

	private String idNumber;
	
	public UniversityMember(String name, int age, String idNumber) {
		super(name, age);
		this.idNumber = idNumber;
	}
	
	
	public String getidNumber() {
		return idNumber;
	}
	
	public void setIDNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	
	
	@Override
	public int hashCode() {
		int hash = 1;
		hash = 31 * super.hashCode();
		hash = 31 * idNumber.hashCode();
		return hash;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		if (!super.equals(obj)) return false;
		UniversityMember um = (UniversityMember) obj;
		return idNumber.equals(um.idNumber);
	}
	
	@Override
	public String toString() {
		return super.toString() + " IDNumber: " + idNumber;
	}

}
