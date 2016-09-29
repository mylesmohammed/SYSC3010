import java.util.ArrayList;

public class AddressBook {
	
	private ArrayList<BuddyInfo> book;
	
	
	
	public AddressBook() {
		this.book = new ArrayList<BuddyInfo>();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Address Book");
		BuddyInfo buddy1 = new BuddyInfo("Jordan", "296 Mona Ave", 2997083);
		AddressBook addressbook1 = new AddressBook();
		addressbook1.addBuddy(buddy1);
		addressbook1.removeBuddy(buddy1);
	}
	
	public AddressBook(ArrayList<BuddyInfo> book) {
		super();
		this.book = book;
	}

	public void addBuddy(BuddyInfo buddy){
		book.add(buddy);
	}
	
	public void removeBuddy(BuddyInfo buddy){
		book.remove(buddy); //removes the buddy
	}
}
