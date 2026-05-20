public class Main {
    public static void main(String [] args){
        ContactsManager myContactsManager = new
                ContactsManager();
        Contact myFriends = new Contact();
    }
}
class ContactsManager {
    Contact[] myFriends;
    int friendsCount;
}
class Contact {
    String name;
    String phoneNumber;
}