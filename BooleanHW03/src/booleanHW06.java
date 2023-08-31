public class booleanHW06 {
    public static void main(String[] args){
        int primus=25, divisor =2;
        boolean found=false;
        while(!found){
            if(primus%divisor==0){
                found = true;
                System.out.println(primus+ " is a not a prime number");
            }
            divisor++;
           if(divisor>=primus){
               found = true;
               System.out.println(primus+ " is a prime number");
               return;}
        }
    }
}
