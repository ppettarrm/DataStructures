public class DecimalToBinary {
    //Calculates binary number of decimal n using recursion.
    public static void main(String[] args){
        System.out.println(decToBin(10));
    }
    
    public static int decToBin(int n){
        if(n == 0)
            return n;
        return n%2 + 10 * decToBin(n/2);
    }
}
