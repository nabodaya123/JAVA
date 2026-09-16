

public class BinToDecimal {

    public static void binToDecimal(int biNum){
        int pow =0;
        int dec =0;
        while(biNum>0){
            int lastDigit =biNum%10;

           dec =dec +(lastDigit*(int) Math.pow(2,pow));
            pow++;
            biNum/=10;

        }
        System.out.println("decimal num is:"+ dec);
    }
    public static void main(String args[]){
        binToDecimal(100);
    }
    
}
