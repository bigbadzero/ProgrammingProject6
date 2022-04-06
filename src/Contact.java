import java.util.Properties;

public class Contact {
    private  String FirstName;
    private String PhoneNumber;

    public Contact(String firstName, String phoneNumber) {
        this.FirstName = firstName;
        this.PhoneNumber = phoneNumber;
    }
    public String getFirstName(){
        return this.FirstName;
    }

    public String getPhoneNumber(){
        return this.PhoneNumber;
    }
}
