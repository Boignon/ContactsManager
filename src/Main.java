public class Main {
    public static void main(String [] args){
        ContactsManager myContactsManager = new
                ContactsManager();
        //Ajout des contacts
        Contact myFriends1 = new Contact();
        myFriends1.name = "ourielle";
        myFriends1.phoneNumber = "0512345678";
        myContactsManager.addContact(myFriends1);

        Contact myFriends2 = new Contact();
        myFriends2.name = "Andy";
        myFriends2.phoneNumber = "0588754216";
        myContactsManager.addContact(myFriends2);

        Contact myFriends3 = new Contact();
        myFriends3.name = "Christiane";
        myFriends3.phoneNumber = "0523369541";
        myContactsManager.addContact(myFriends3);

        Contact myFriends4 = new Contact();
        myFriends4.name = "loisse";
        myFriends4.phoneNumber = "0124587956";
        myContactsManager.addContact(myFriends4);

        Contact myFriends5 = new Contact();
        myFriends5.name = "esteban";
        myFriends5.phoneNumber = "0745852365";
        myContactsManager.addContact(myFriends5);

        // Affichage
        Contact result = myContactsManager.searchContact("Andy");
        if (result != null) {
            System.out.println("Numéro de Andy : " + result.phoneNumber);
        }
    }
}
class ContactsManager {
    Contact[] myFriends;
    int friendsCount;

    // CONSTRUCTEUR : initialise le tableau
    ContactsManager(){
        this.friendsCount = 0;
        this.myFriends = new Contact[500];
    }

    //Ajoute un nouveau contact au tableau.
    void addContact(Contact contact){
        myFriends[friendsCount] = contact;
        friendsCount++; }

    /*Recherche un contact par nom et
    retourne l'objet Contact correspondant.*/
    Contact searchContact(String searchName){
        for(int i=0; i<friendsCount; i++){
            if(myFriends[i].name.equals(searchName)){
                return myFriends[i];
            }
        }
        return null;}

}
class Contact {
    String name;
    String phoneNumber;
}