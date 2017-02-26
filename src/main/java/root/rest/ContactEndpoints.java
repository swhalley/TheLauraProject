package root.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import root.data.ContactListMapper;

import java.util.List;

@RestController
public class ContactEndpoints {
    private ContactListMapper dao;

    @Autowired
    public ContactEndpoints(ContactListMapper dao){
        this.dao = dao;
    }

    @RequestMapping( "/all")
    public List<String> getContacts(){
        return dao.getAllContacts();
    }

    @RequestMapping( "/c")
    public String getContact( @RequestParam( value="name", defaultValue = "Sean") String name){
        return dao.isContactInList( name ) ? "Found him" : "keep looking";
    }
}
