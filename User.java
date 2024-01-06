public class User {
    //firstname of user
    String firstName = "Kadoon";
    String lastName = "Ajekwe";
    int age = 0;
    boolean hasMoney = true;


    public static void main(String[] args) {
        double amountPaid = 23.05;
        int amountConverted = (int) amountPaid;
        double amountCredited = 12;
        double result = amountPaid/amountCredited;
        
        

        System.out.println("First Result" + amountConverted);
        System.out.println("Result" + result);
    }



}
