package root.rest;

import root.data.ContactListDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContactEndpoints {
    private ContactListDAO contactDAO;

    @Autowired
    public ContactEndpoints(ContactListDAO contactDAO){
        this.contactDAO = contactDAO;
    }

    @RequestMapping( "/all")
    public List<String> getContacts(){
        return contactDAO.getAllContacts();
    }

    @RequestMapping( "/c")
    public String getContact( @RequestParam( value="name", defaultValue = "Sean") String name){
        return contactDAO.isContactInList( name ) ? "Found him" : "keep looking";
    }
}
