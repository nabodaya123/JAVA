import java.util.*;

public class basic {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age:");
        int age = sc.nextInt();

        if(age>=18){
            System.out.println("Is Adult: Drive,vote");
        }else{
            System.out.println("not Adult");
        }
    }
    
}
