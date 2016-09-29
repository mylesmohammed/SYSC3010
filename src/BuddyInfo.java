
public class BuddyInfo {
	
	String name;
	String address;
	int phoneNumber;

	public String getName() {
		return name;
	}

	public BuddyInfo(String name, String address, int phoneNumber) {
		super();
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
