import java.util.*;
public class gst {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter pen price:");
        float pen = sc.nextFloat();
        System.out.print("Enter pencil price:");
        float pencil = sc.nextFloat();
        System.out.print("Enter eraser price:");
        float eraser = sc.nextFloat();
        float sum=pen+pencil+eraser;
        System.out.println("Total price is:"+sum);
        float sum2=sum+(0.18f*sum);
        System.out.println("Bill with 18% tax:"+ sum2);
    }
    
}
