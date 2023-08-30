public class booleanHW04 {
    public static void main(String[] args) {
        boolean found = false;
        int n= 1;
        while(!found){
            if(n%387==0&&n%6381==0){
                found=true;
                System.out.println("n = "+n);
                System.out.println(n/387);
                System.out.println(n/6381);
            }
            n++;
        }
    }
}
