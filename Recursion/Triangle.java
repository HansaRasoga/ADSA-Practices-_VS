public class Triangle 
{
    public static void printTriangle(int n) 
    {
        if (n <= 0) 
        {
            return; // Base case: no rows to print
        }
        
        printTriangle(n - 1); // Recursive call to print previous rows
        
        for (int i = 0; i < n; i++) 
        {
            System.out.print("* "); // Print stars for the current row
        }
        System.out.println(); // Move to the next line after printing stars
        
    }

    public static void main(String[] args) 
    {
        int n = 5; // Example input for the number of rows
        printTriangle(n); // Call the method to print the triangle

    }
}
