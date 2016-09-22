import java.util.ArrayList;

public class AddressBook {
	
	ArrayList<BuddyInfo> book = new ArrayList<BuddyInfo>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Address Book");
	}
	
	public AddressBook(ArrayList<BuddyInfo> book) {
		super();
		this.book = book;
	}

	public void addBuddy(BuddyInfo buddy){
		book.add(buddy);
	}
	
	public void removeBuddy(BuddyInfo buddy){
		book.remove(buddy);
	}
}
