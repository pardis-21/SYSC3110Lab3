import java.util.ArrayList;

public class AddressBook {

    private static ArrayList<BuddyInfo> addressBook;

    private AddressBook() {
        this.addressBook = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddy){
        addressBook.add(buddy);
    }
    public void removeBuddy(BuddyInfo buddy){
        addressBook.remove(buddy);
    }
    public ArrayList<BuddyInfo> getBuddies(){
        return addressBook;
    }
    public void setAddressBook(ArrayList<BuddyInfo> addressBook) {
        this.addressBook = addressBook;
    }

    public static void main(String[] args) {

        BuddyInfo buddy = new BuddyInfo("TOM", "SMITH", 22);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);

    }

}
