public class SumPositive{
    //Calculates sum of digits of a positive integer number using recursion
    public static void main(String[] args){
        System.out.println(sum(12345));
    }

    public static int sum(int n){
        if(n<0)
            return -1;
        else if(n == 0)
            return 0; 
        return n%10 + sum(n/10);
    }

}