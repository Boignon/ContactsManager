public class Main {
    public static void main(String [] args){
        ContactsManager myContactsManager = new
                ContactsManager();
        Contact myFriends = new Contact();

        myFriends.name = "ourielle";
        myFriends.phoneNumber = "0512345678";
        myContactsManager.addContact(myFriends);

        myFriends.name = "Andy";
        myFriends.phoneNumber = "0588754216";
        myContactsManager.addContact(myFriends);

        myFriends.name = "Christiane";
        myFriends.phoneNumber = "0523369541";
        myContactsManager.addContact(myFriends);

        myFriends.name = "loisse";
        myFriends.phoneNumber = "0124587956";
        myContactsManager.addContact(myFriends);

        myFriends.name = "esteban";
        myFriends.phoneNumber = "0745852365";
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