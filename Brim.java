public class Brim {

    public static Void main(String [] arg) {
        
        BankAccount kadoonBankAccount =
        new BankAccount("kadoon",  "sarah", "Ajekwe",);
        String number = kadoonBankAccount.getAccountNumber();

        System.out.println(number);

        kadoonBankAccount.changeValues("kadoon", "Ajekwe");
        kadoonBankAccount.changeValues(number, number);

        System.out.println(kadoonBankAccount.getAccountNumber());


    




    }
    
}
