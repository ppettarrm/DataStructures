public class PowerOfNum {
    //Calculates power of n using recursion.
    public static void main(String[] args){
        System.out.println(powerOfNum(5, 3));
    }

    public static int powerOfNum(int n, int p){
        if(p < 0)
            return -1;
        else if(p == 0)
            return 1;
        return n * powerOfNum(n, p-1);
    }
}
