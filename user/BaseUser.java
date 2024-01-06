package user;
public class BaseUser {
    private String firstNmae;
    private String lastName;

    BaseUser (String firstNmae, String lastName){
        this.firstNmae = firstNmae;
        this.lastName = lastName;

    }
    public Void SetFirstName (String firstName){
        this.firstNmae = firstName;
        

    }
}
