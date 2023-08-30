public class Main {
    public static void main(String[] args) {

        boolean found = false;
        int r, a = 7, b = 22;
        while (!found) {
            r = a % b;
            if (r == 0) {
                found = true;
                System.out.println("solution is " + b);
            }
            else{
                a=b;
                b=r;
            }
        }
    }
}