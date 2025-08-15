public class PhoneDirectory 
{

    private static class ConNode 
    {
        String name;
        String phone;
        ConNode left;
        ConNode right;

        public ConNode(String name, String phone) 
        {
            this.name = name;
            this.phone = phone;
            this.left = null;
            this.right = null;
        }
    }
private ConNode root;

    public PhoneDirectory() {
        root = null;
    }

    public void insert(String name, String phone) {
        root = insertRec(root, name, phone);
    }

    private ConNode insertRec(ConNode root, String name, String phone) {
        if (root == null) {
            return new ConNode(name, phone);
        }
        if (name.compareTo(root.name) < 0) {
            root.left = insertRec(root.left, name, phone);
        } else if (name.compareTo(root.name) > 0) {
            root.right = insertRec(root.right, name, phone);
        }
        return root;
    }

    // Additional methods for search, delete, etc. can be added here
}
