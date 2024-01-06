public class BankAccount {
    private String firstName = "Kadoon";
    private String LastName = "Ajekwe";
    private String middleName = "Sarah";
     private String accountNumber = "0104015019";


     public void changeValues(String firstName, String LastName){
        this.firstName = LastName;
     }


     public void setFirstName(String firstName) {
         this.firstName = firstName;
     }

     public void setAccountNumber(String accountNumber) {
         this.accountNumber = accountNumber;
     }

     public String getFirstName(){
        return firstName;
     }

     public String getAccountNumber(){
        return accountNumber;

     }
     


    
}
