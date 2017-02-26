package root.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import root.data.ContactListDAO;
import org.springframework.beans.factory.annotation.Autowired;

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
    public String getContact( @RequestParam( value="name") String name){
        return contactDAO.isContactInList( name ) ? "Found him" : "keep looking";
    }

    @RequestMapping( value = "/new", method = RequestMethod.POST, consumes = MediaType.TEXT_PLAIN_VALUE)
    public String addNewContact( @RequestBody String name ){
        if( name == null || name.trim().equals("")){
            return "Not Added, name was blank";
        }

        if( contactDAO.isContactInList( name )){
            return "Not Added, duplicate contact exists";
        }

        contactDAO.add( name );
        return "contact added";

        //This function is getting busy enough, which is starting to reflect
        //a new service or business logic layer.
    }
}
