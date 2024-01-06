public class BankAccount {
    private String firstName;
    private String LastName ;
    private String middleName;
     private String accountNumber;
     

     BankAccount (String fistName, String lastName, String middleName, String accountNumber){
        this.accountNumber =accountNumber;
        this.firstName = fistName;
        this.LastName = lastName;
        this.middleName = middleName;

     }
     


     public void changeValues(String firstName, String LastName){
        this.firstName = LastName;
        this.LastName = firstName;
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
