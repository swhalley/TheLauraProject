package root.data;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ContactListDAO {
    private static List<String> contacts;

    public ContactListDAO(){
        contacts = new ArrayList<String>();
        contacts.add( "Sean");
        contacts.add( "Dave");
        contacts.add( "Steve");
    }

    public List<String> getAllContacts(){
        return contacts;
    }

    public boolean isContactInList( String name ){
        return contacts.stream().anyMatch(p -> p.toLowerCase().equals( name.toLowerCase()));
    }
}
