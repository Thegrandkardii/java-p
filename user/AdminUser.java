package user;

public class AdminUser extends BaseUser {
    AdminUser (String firstName, String lastName, String staffID){
        super (firstName, lastName);
        this.staffID = staffID;
    }
    
}
