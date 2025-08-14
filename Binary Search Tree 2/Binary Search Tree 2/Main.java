import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();
        int choice, value;
do 
        {
            System.out.println("\n=== Binary Search Tree Menu ===");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Find Minimum");
            System.out.println("5. Find Maximum");
            System.out.println("6. In-order Traversal");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    value = scanner.nextInt();
                    bst.insert(value);
                    break;
                case 2:
                    System.out.print("Enter value to delete: ");
                    value = scanner.nextInt();
                    bst.delete(value);
                    break;
                case 3:
                    System.out.print("Enter value to search: ");
                    value = scanner.nextInt();
                    System.out.println(bst.search(value) ? "Found!" : "Not found!");
                    break;
                case 4:
                    try {
                        System.out.println("Minimum value: " + bst.findMin());
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    try {
                        System.out.println("Maximum value: " + bst.findMax());
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    System.out.println("In-order Traversal:");
                    bst.inorder();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
            while (choice != 7);
        scanner.close();
    }
}
