package root.data;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ContactListMapper {

    @Select( "SELECT name FROM Contacts" )
    public List<String> getAllContacts();

    @Select( "SELECT EXISTS(SELECT 1 FROM Contacts WHERE name=#{name})" )
    public Boolean isContactInList(@Param("name") String name);
}
