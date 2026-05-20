public class Main {
    public static void main(String [] args){
        ContactsManager myContactsManager = new
                ContactsManager();
        Contact myFriends = new Contact();

        myFriends.name = "ourielle";
        myFriends.phoneNumber = "0512345678";
        myContactsManager.addContact(myFriends);

    }
}
class ContactsManager {
    Contact[] myFriends;
    int friendsCount;

    ContactsManager(){
        this.friendsCount = 0;
        this.myFriends = new Contact[500];
    }

    void addContact(Contact contact){
        myFriends[friendsCount] = contact;
        friendsCount++; }

}
class Contact {
    String name;
    String phoneNumber;
}