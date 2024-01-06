package User;

import java.rmi.server.UID;
import java.security.SecureRandom;
import java.util.Date;
import java.util.UUID;

//a base implementation of the user of the system
//tis class cannot be instantiated
abstract class BaseUser{
    private String id;
    private String authToken;
    private String firstNames;
    private String lastName;
    private String middleName;
    private String email;

    //record the time a new instance is created
    private Date dateCreated;


    //user's current subscription
    private BaseUser currentSuscription;
    
    BaseUser(String firstName, String lastName, String middleName, String email){
        this.firstNames = firstName;
        this.lastName = lastName;
        this.middleName= middleName;
        this.email = email;
        this.dateCreated = new Date();
        this.id = UUID.randomUUID().toString();
        this.authToken = UUID.randomUUID().toString();
    }
    //only get the user id, no setter for this


    public String getId() {
        return id;
    }
  
    public String getFirstNames() {
        return firstNames;
    }
    public void setFirstNames(String firstNames) {
        this.firstNames = firstNames;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Date getDataCreated() {
        return dataCreated;
    }
  
    private Date dataCreated;
    
abstract void login(String email);
    
}

