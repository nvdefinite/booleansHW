import static java.lang.Math.sqrt;
public class BooleanHW06 {
    public static void main(String[] args){
        int primus=3337, divisor =2;
        boolean found=false;
        while(!found){
            if(primus%divisor==0){
                found = true;
                System.out.println(primus+ " is a not a prime number");
                System.out.println(primus+ " is divisible by " + divisor);
            }
            if(divisor>sqrt(primus)){
                found = true;
                System.out.println(primus+ " is a prime number");
            }
            divisor++;

        }
    }
}
