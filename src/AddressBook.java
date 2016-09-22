import java.util.ArrayList;

public class AddressBook {
	
	ArrayList<BuddyInfo> book = new ArrayList<BuddyInfo>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Address Book");
		BuddyInfo buddy1 = new BuddyInfo("Jordan", "296 Mona Ave", 2997083);
		ArrayList<BuddyInfo> addressbook1 = new ArrayList<BuddyInfo>();
		addressbook1.add(buddy1);
		addressbook1.remove(buddy1);
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
