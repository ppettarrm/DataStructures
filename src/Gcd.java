public class Gcd {
    //Calculates greatest common divisor of two numbers using recursion.
    public static void main(String[] args){
        System.out.println(gcd(8, 12));
    }

    public static int gcd(int a, int b){
        if(a<0 || b<0)
            return -1;
        else if(b == 0)
            return a;
        return gcd(b, a%b);

    }
}
