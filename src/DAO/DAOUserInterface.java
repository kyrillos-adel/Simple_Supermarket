
package DAO;

import DTO.DTOUser;
import java.util.ArrayList;


public interface DAOUserInterface {
    public void add(DTOUser user);
    public void delete(String user_type,String userName,String password);
    public void edit(String user_type,String userName,String oldPassword,String newPassword);
    public DTOUser find(String user_type,String username, String password);
    public ArrayList<DTOUser> listAllEmployees();
    public ArrayList<DTOUser> listAllAdminstrators();

}
