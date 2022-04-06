public class Phonebook {
    public Contact[] contacts = new Contact[6];

    boolean SearchForContact(String firstName){
        for(int i =0; i < contacts.length; i++){
            if(contacts[i] != null){
                if(contacts[i].getFirstName().equals(firstName)){
                    return true;
                }
            }
        }
        return false;
    }

    String PrintCorrespondingContactPhoneNunber(String firstName){
        for(int i =0; i < contacts.length; i++){
            if(contacts[i] != null){
                if(contacts[i].getFirstName().equals(firstName)){
                    return contacts[i].getPhoneNumber();
                }
            }
        }
        return null;
    }

    void addContactToPhoneBook(Contact contact){
        
    }
}
