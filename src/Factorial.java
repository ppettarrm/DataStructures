public class Factorial {
    //Calculates factorial of n using recursion.
    public static void main(String[] args){
        System.out.println(factorial(10));
    }

    public static int factorial(int n){
        if(n < 0)
            return -1;
        else if(n == 0 || n == 1)
            return n;
        return n * factorial(n-1);

    }
}
