public class RecursionExample1 
{
    public int factorial(int n) 
    {
        if (n == 0 || n == 1) 
        {
            return 1; // Base case
        } 
        else 
        {
            return n * factorial(n - 1); // Recursive case
        }
    }

    public static void main(String[] args) 
    {
        RecursionExample1 recursionExample1 = new RecursionExample1();
        int no = 5; // Example input
        int result = recursionExample1.factorial(no);
        System.out.println("Factorial of " + no + " is: " + result);
    }
}
