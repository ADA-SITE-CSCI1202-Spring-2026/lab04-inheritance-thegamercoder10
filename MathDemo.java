public class MathDemo 
{
    public static int min(int a, int b)
    {
        return a<b?a:b;
    }
    public static int max(int a, int b)
    {
        return a>b?a:b;
    }
    public static int sum(int[] args)
    {
        int sum = 0;
        for(int i : args) sum += i;
        return sum;
    }
}

// Definintg these methods as static removes necessity of instantiating the class to use them. They can be called directly from the class itself (useful in static main).

