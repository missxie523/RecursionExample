public class FibonacciSequence {
    //recursive way
    //1 + 1 + 2 + 4 + ... + 2^n - 1  = 2 * 2^n - 1 = O(2^n)
    //Time Complexity = O(2^n)
    //Space = O(n), call stack

    public static long fibo(long n){
        //base case
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }
        return fibo(n - 1) + fibo(n -2);//recursive rule
    }

    //DP way
    public long fibo2(int K) {
        //dp with space of O(1)
        long a = 0;
        long b = 1;
        if(K <= 0){
            return a;
        }
        while(K > 1){
            long temp = a + b;
            a = b;
            b = temp;
            K--;
        }
        return b;
    }
    public static void main(String[] args){
        FibonacciSequence sol = new FibonacciSequence();
        for(int i = 0; i < 200; i++){
            System.out.println("Fibo(" + i + ")=" + sol.fibo2(i) + "");
        }
    }
}
