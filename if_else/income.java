import java.util.*;
public class income{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int income = sc.nextInt();
       
       if(income<500000){
        System.out.println("No, Tax paid");
       }
       else if(income>500000 && income<1000000){
        System.out.println("tax is" + income*0.2+"L");
       }else{
        System.out.println("tax is " + income*0.3+"L");
       }
    }
}