import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Contact Jordan = new Contact("Jordan", "256-567-8876");
        Contact Rebecca = new Contact("Rebecca", "256-456-7854");
        Contact Adam = new Contact("Adam", "256-689-7757");
        Contact Jennifer = new Contact("Jennifer", "256-689-0152");
        boolean ExitingEarly = false;

        Phonebook phonebook = new Phonebook();
        int counter = 0;

        phonebook.contacts[0] = Jordan;
        phonebook.contacts[1] = Rebecca;
        phonebook.contacts[2] = Adam;
        phonebook.contacts[3] = Jennifer;

        Scanner scanner = new Scanner(System.in);
        while(counter < 2){
            String contactName;
            String phoneNumber;
            boolean contactExists;
            System.out.println("Enter a name to serach(or quit to exit)");
            contactName = scanner.nextLine();
            if(contactName.equals("quit")){
                counter = 2;
                ExitingEarly = true;
            }
            else{
                contactExists = phonebook.SearchForContact(contactName);
            if(contactExists){
                System.out.println(phonebook.PrintCorrespondingContactPhoneNunber(contactName));
            }
            else{
                System.out.println("Contact Not found. Please enter a phone number to add new contact");
                phoneNumber = scanner.nextLine();
                Contact newContact = new Contact(contactName, phoneNumber);
                if(counter == 0){
                    phonebook.contacts[4] = newContact;
                    counter ++;
                }
                else if( counter ==1){
                    phonebook.contacts[5] = newContact;
                    counter++;
                }
            }
            }
            
        }
        if(ExitingEarly){
            System.out.println("Exiting Program. You did not fill the phonebook.");
        }
        else{
            System.out.println("Contact List Full");
        }
            
        

        
    }
}
