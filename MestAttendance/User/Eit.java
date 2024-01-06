package User;



public class Eit extends BaseUser{

    Eit(String firstName, String lastName, String middleName, String email) {
        super(firstName, lastName, middleName, email);
        //TODO Auto-generated constructor stub
    }

    @Override
    void login(String email) {

        // TODO Auto-generated method stub
        System.out.println("EIT logged in");
    }
    
    
}
