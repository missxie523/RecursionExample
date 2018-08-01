public class Power {
    public static long power(long a, long b){
        if(a == 0){
            return 0;
        }
        if(b == 0){
            return 1;
        }
        long half = helper(a, b/2);
        if(b % 2 == 0){
            return half * half;
        }else{
            return half * half * a;
        }
    }
    private static long helper(long a, long b){
        return a ^ b;
    }
    public static void main(String[] args){
        long a = 3;
        long b = 100;
        System.out.println(power(a, b));
    }
}//Time = O(log b)
//Space = O(log b)
