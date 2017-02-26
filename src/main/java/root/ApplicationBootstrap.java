package root;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import root.data.ContactListMapper;

@SpringBootApplication
public class ApplicationBootstrap extends SpringBootServletInitializer{
    final private ContactListMapper mapper;

    public ApplicationBootstrap(ContactListMapper mapper){
        this.mapper = mapper;
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ApplicationBootstrap.class);
    }
}