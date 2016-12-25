import java.util.Scanner;

/**
 * Created by ganu on 12/25/16.
 */
public class CreditCard {

    static Boolean validateCreditCard(String creditCardNumber){
        Long creditCard = null;
       if(creditCardNumber.length()>=14 || creditCardNumber.length()<=18){
           try{
                creditCard =  Long.parseLong(creditCardNumber);
                return true;
           }catch(NumberFormatException e){
                return false;
           }
       }
        return false;
    }

    public static void main(String args[]){
        System.out.print("enter credit card num");
        Scanner sc = new Scanner(System.in);
        String credit = sc.next();
        Boolean flag = validateCreditCard(credit);
        System.out.print(flag);
    }


}
