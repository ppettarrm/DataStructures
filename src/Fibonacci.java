public class Fibonacci {
    //Calculates value of fibonacci for n using recursion.
    public static void main(String[] args){
        System.out.println(fibonacci(5));
    }

    public static int fibonacci(int n){
        if(n<0)
            return -1;
        else if(n == 0 || n == 1)
            return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
