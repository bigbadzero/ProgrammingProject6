import java.util.Arrays;

public class Phonebook {
    public Contact[] contacts = new Contact[6];
    private boolean isFull = false;
    private int firstEmptyPosition = 4;


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
        this.contacts[this.firstEmptyPosition] = contact;
        firstEmptyPosition++;
        isPhonebookFull();
    }

    void isPhonebookFull(){
        if(Arrays.asList(contacts).contains(null)){
            this.isFull = false;
        }
        else{
            this.isFull = true;
        }
    }

    boolean getIsFull(){
        return this.isFull;
    }
}
