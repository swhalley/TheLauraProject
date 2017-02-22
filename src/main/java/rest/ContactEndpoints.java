package rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ContactEndpoints {
    private static List<String> contacts;

    public ContactEndpoints(){
        contacts = new ArrayList<String>();
        contacts.add( "Sean");
        contacts.add( "Dave");
        contacts.add( "Steve");
    }

    @RequestMapping( "/all")
    public List<String> getContacts(){
        return contacts;
    }

    @RequestMapping( "/c")
    public String getContact( @RequestParam( value="name", defaultValue = "Sean") String name){
        return contacts.stream().anyMatch(p -> p.toLowerCase().equals( name.toLowerCase())) ? "Found him" : "keep looking";
    }
}
