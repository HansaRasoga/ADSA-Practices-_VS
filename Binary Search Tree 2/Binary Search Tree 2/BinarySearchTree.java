public class Node 
{
int data;
Node left;
Node right;

public Node(int data) 
{
    this.data = data;
    this.left = null;
    this.right = null;
}
}

public class BinarySearchTree 
{
Node root;

public void insert(int data) 
{
    root = insertRec(root, data);
}
public Node insertRec(Node root, int data) 
{
    if (root == null) 
    {
        root = new Node(data);
        return root;
    }
    if (data < root.data) 
    {
        root.left = insertRec(root.left, data);
    } 
    else if (data > root.data) 
    {
        root.right = insertRec(root.right, data);
    }
    return root;
}
public void delete(int data)
{
    root = deleteRec(root, data);
}
private Node deleteRec(Node root, int data) 
{
    if (root == null) 
    {
        return root;
    }
    if (data < root.data) 
    {
        root.left = deleteRec(root.left, data);
    } 
    else if (data > root.data) 
    {
        root.right = deleteRec(root.right, data);
    } 
    else 
    {
        if (root.left == null) 
        {
            return root.right;
        } 
        else if (root.right == null) 
        {
            return root.left;
        }
        root.data = minValue(root.right);
        root.right = deleteRec(root.right, root.data);
    }
    return root;
}

private int minValue(Node root) 
{
    int minValue = root.data;
    while (root.left != null) 
    {
        minValue = root.left.data;
        root = root.left;
    }
    return minValue;
}

public boolean search(int data) 
{
    return searchRec(root, data);
}

private boolean searchRec(Node root, int data) 
{
    if (root == null) 
    {
        return false;
    }
    if (data < root.data) 
    {
        return searchRec(root.left, data);
    } 
    else if (data > root.data) 
    {
        return searchRec(root.right, data);
    } 
    else 
    {
        return true;
    }
}

public int findMin() 
{
    if (root == null) 
    {
        throw new IllegalStateException("Tree is empty");
    }
    return minValue(root);
}

public int findMax() 
{
    if (root == null) 
    {
        throw new IllegalStateException("Tree is empty");
    }
    Node current = root;
    while (current.right != null) 
    {
        current = current.right;
    }
    return current.data;
}

public void inorder() 
{
    inorderRec(root);
    System.out.println();
}

private void inorderRec(Node root) 
{
    if (root != null) 
    {
        inorderRec(root.left);
        System.out.print(root.data + " ");
        inorderRec(root.right);
    }
}
}
